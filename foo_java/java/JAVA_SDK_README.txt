Java Foobar SDK Bindings
========================


What is it ?
------------

The java foobar SDK bindings will allow to write foobar2000 plugins in Java by mapping the SDK C++ classes to Java classes, keeping mostly the same class and function names. Current version is a prototype mapping a few APIs to show the feasability of such bindings. Many APIs/Services are missing and will be added in future versions now than the concept has been validated. For now, this is only a prototype with the following API available:

- metadb_io : allow to read/write tags
- file_info/metadb_handle: allow to access/modify tags
- playback_control : allow to control playback : start / stop / pause etc
- context menu interface, so the Java plugin can expose a contextual menu.
- supports creation of panels compatible with column UI
- GUI can be written using either Swing or SWT

notifications:

- play_callback: get play notification such as current track, track progression etc..



How does it work ?
------------------

The foo_java_plugin_loader is a traditional C++ plugin than provides an interface to Java plugins. It will load all Java plugins that it finds in directory "<foobar install dir>/components/java". It's also responsible to notify java plugins for notification events (play_callback, etc). It will autodetect the JVM if present, so there's nothing to configure.


How do I write a plugin ?
-------------------------

Have a look a the two sample Java plugin for a quickstart, it should be moslty self explanatory especially if you're familiar with the C++ SDK.

Mapped C++ SDK classes in Java are in packahe org.foobar2000.api and have the same names as their C++ counterparts.

The FBAPI class is an important class that allow you to access static API services such as metadb_io or playback_control.


All java plugins must reside as a subpackage of the org.foobar2000.plugin package. Say you want to write plugin names foo_test. Then all it's code will be on package org.foobar2000.plugin.foo_test.

The entry point of the plugin will be the class org.foobar2000.plugin.foo_test.Plugin

This class must inherits from org.foobar2000.api.PluginBase and have a Plugin(long) constructor:

public class Plugin extends PluginBase {

	void Plugin(long plugin_ptr)  {
		super(plugin_ptr);
		...
	}

}

The plugin foo_test *must* be packaged as foo_test.jar and put in the components/java dierctory.

The most important thing to understand when writing Java Plugins is this fundamental difference with C++ plugins:

In Java, the GUI code is called in a different Thread than the Main Thread: it's called in the Swing Event Thread (EVT). In C++ GUI code is executed the main thread. This is crucial to understand as most foobar2000 APIs can only be called from the Main Thread (such as playback_control). In Java most code is executed in the Swing EVT through callbacks (button's actionPerformed(), listeners etc).
So you can see this is conflictual with foobar2000 behaviour. Hopefully fb2k's SDK allow any arbitray piece of code to execute in the main Thread, when the Main Thread has control.

For example consider a button which trigger playing of a track in Swing:

JButton startButton = new JButton("Start");
startButton.addActionListener( new MainThreadActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		FBAPI.getPlaybackControl().start();
	}
}));

You can see the ActionListener is encapsulated in a MainThreadActionListener which will ensure the action is performed in the main thread. Else the action would happen in the Swing Event Thread and that would not work. The  MainThreadActionListener class uses the more general FBAPI.runInMainThread(Runnbale action) function that will guarantee that action represented by the run() funtion of the Runnbale object, takes place in the Main Foobar2000 Thread. This function is safe to call in the Swing EVT or in the MainThread. In the latter case the action will be executed immediately while in the former case it'll be executed when the Main Thread has control. By default FBAPI.runInMainThreadSwing() returns only when the action has been completed, but there's the variant FBAPI.runInMainThreadAsync() that will give back control immediatelty regardless of the completion of the action.

To conclude with threads, you must understand that notification such has play_callback always run in the Main Thread (because they are invoked by
foo_java_plugin_loader). So there's no need to use runInMainThread() ven if it won't do any harm. But beware that if in such callbacks you must update some Swing widgets (such as label.settext()), theses update should happen in the Swing Event Thread. To do this, use Swing.invokeLater() which is the reciprocal to  FBAPI.runInMainThread(), to execute code in the Swing EVT.




















