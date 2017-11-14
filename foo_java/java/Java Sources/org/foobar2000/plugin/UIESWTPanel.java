package org.foobar2000.plugin;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.foobar2000.api.GUID;

public class UIESWTPanel extends Thread {
	
	protected Display display = null;
	protected Shell shell = null;
	
	protected boolean _exit = false;
		
	public UIESWTPanel() {	
		start();
		while(shell == null) ; // wait for shell to be created
	}
	
	public void exit() {
		_exit = true;
	}
	
	// should be overridden in subclass
	public void init() { }

	public void run() {
		
		display = new Display();
		Shell rootShell = new Shell(display, SWT.NONE);
		shell = new Shell(rootShell, SWT.NONE);
		
		init();
		
		shell.setSize(0, 0);
		shell.open();
		
		while (!shell.isDisposed() && !_exit) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		// don't dispose display here, it'll lock foobar 
		shell = null;
	}
	
	public Shell getShell() {
		return shell;
	}
	

	
}
