package org.foobar2000.plugin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Vector;

import org.eclipse.swt.widgets.Display;
import org.foobar2000.api.*;

public class FBAPI {

	static private long main_window_handle = 0;
	static private long jvm_context_ptr = 0;
	static private long metadb_io_ptr = 0;
	static private long playback_control_ptr = 0;


	// services
	static private metadb_io metaDBIO = null;
	static private playback_control playbackControl = null;

	static {
			System.loadLibrary("fb2k_java_api");
			
			try
			{
			  UIManager.setLookAndFeel(
			  	//"net.java.plaf.windows.WindowsLookAndFeel"
					  "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
			  );
			}
			catch ( Exception e ) {}
			
			try {
				System.setErr ( new PrintStream ( new FileOutputStream ( "c:\\stderr.txt" ) ) );
				System.setOut ( new PrintStream ( new FileOutputStream ( "c:\\stdout.txt" ) ) );
			} catch(FileNotFoundException e) { 
				System.exit(0);
			}

	}	

	private static native boolean init_fb2k_java_api_dll(long main_thread_cb_manager_ptr);
		
	public static boolean init() {
		

		if(main_window_handle == 0 ||
		   jvm_context_ptr == 0 ||
		   metadb_io_ptr == 0 ||
		   playback_control_ptr == 0)
			return false;

		
		if(!init_fb2k_java_api_dll(jvm_context_ptr)) return false;

		//create proxy classes for services
		metaDBIO = new metadb_io(metadb_io_ptr, false);
		playbackControl = new playback_control(playback_control_ptr, false);
		
		return true;
	}
	
	public static void runInMainThreadSwing(Runnable task) {
		if(SwingUtilities.isEventDispatchThread()) {
			runInMainThread(task, true);
		} else {
			task.run();
		}
	}
	
	public static void runInMainThreadSWT(Runnable task) {
		if(Thread.currentThread() == Display.getDefault().getThread()) {
			runInMainThread(task, true);
		} else {
			task.run();
		}
	}
	
	// can be invoked from both Swing or SWT
	public static void runInMainThreadAsync(Runnable task) {
		runInMainThread(task, false);
	}
	
	public static native void runInMainThread(Runnable task, boolean sync);
	
	public static long getMainWindowHandle() { return main_window_handle; }
	public static metadb_io getMetaDBIO() { return metaDBIO; }
	public static playback_control getPlaybackControl() { return playbackControl; }



	
	
}



