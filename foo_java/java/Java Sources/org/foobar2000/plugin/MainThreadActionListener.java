package org.foobar2000.plugin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainThreadActionListener implements ActionListener {

	private ActionListener listener;
	private boolean sync;
	
	public MainThreadActionListener(ActionListener listener) {
		this(listener, true);
	}
	
	public MainThreadActionListener(ActionListener listener, boolean sync) {
		this.listener = listener;
		this.sync = sync;
	}
	
	public void actionPerformed(final ActionEvent e) {
		if(sync) {
			FBAPI.runInMainThreadSwing(new Runnable() {
				public void run() {
					listener.actionPerformed(e);
				}});
		} else {
		FBAPI.runInMainThreadAsync((new Runnable() {
			public void run() {
				listener.actionPerformed(e);
			}}));
		}

		
	}

}
