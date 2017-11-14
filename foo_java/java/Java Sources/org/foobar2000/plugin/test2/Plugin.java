package org.foobar2000.plugin.test2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Vector;
import org.foobar2000.api.*;
import org.foobar2000.plugin.*;

public class Plugin	extends PluginBase implements context_menu_simple, play_callback, UIEPanelFactory {
	
	UIESwingPanel uieWindow = null;
	JLabel trackLabel;
	
	static GUID GUID_window = new GUID_from_text("DDB99EA8-CAF0-4ad4-AB39-A5EAABE70663");
	
	boolean usePercent = true;
	
	JProgressBar progressBar;
	
	static GUID GUID_menu = new GUID_from_text("B93D6704-5BDA-40b2-90B5-DF89FD3B9800");
	static GUID GUID_item0 = new GUID_from_text("65794798-09D1-4e9c-BCF0-2A3FDF8773DD");


	public Plugin(long plugin_ptr) {
		super(plugin_ptr);


	}	

    public void close() {
    	uieWindow.setVisible(false);
    	uieWindow.dispose();
    	uieWindow = null;
    }

    /************************************************************************
     * 						MENU INTERFACE								    *
     ************************************************************************/
    
	public void context_command(int p_index, Vector<metadb_handle> p_data) {

		switch(p_index) {
		case 0:
			FBAPI.getPlaybackControl().play_or_pause();
			break;
		case 1:
			FBAPI.getPlaybackControl().start();
			break;
		case 2:
			uieWindow.setVisible(!uieWindow.isVisible());
			break;
		}
		
	}

	public String get_item_default_path(int p_index) {
		return "Plugin test2";
	
	}

	public String get_item_description(int p_index) {
		return get_item_name(p_index);
	}

	public String get_item_name(int p_index) {
		switch(p_index) {
		case 0:
			return "Play/stop";
		case 1:
			return "Start";
		case 2:
			if(uieWindow.isVisible()) {
				return "Hide window";
			} else {
				return "Show window";
			}
			
		}
		return "";
	
	}

	public int get_num_items() {
		return 3;
	}
	
	public int get_enabled_state(int p_index) {
		if(p_index == 1) return FORCE_OFF;
		return DEFAULT_ON;
	}

	public GUID get_item_guid(int p_index) {
		
		switch(p_index) {
		case 0:
			return GUID_item0;
		}
		
		return null;
	}

	public GUID get_menu_guid() {
		return GUID_menu;
	}

	/************************************************************************
     * 						PLAYBACK INTERFACE							    *
     ************************************************************************/

	public void on_playback_dynamic_info(file_info finfo) {
		// TODO Auto-generated method stub
		
	}

	public void on_playback_dynamic_info_track(file_info finfo) {
		// TODO Auto-generated method stub
		
	}

	public void on_playback_new_track(final metadb_handle item) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				file_info_impl finfo = new file_info_impl(); 
				item.get_info(finfo);
				trackLabel.setText("Track: " + finfo.meta_get("ARTIST", 0) + " - " + finfo.meta_get("TITLE",0));
				progressBar.setValue(0);
				progressBar.setMaximum((int)item.get_length());
			}
		});
	}

	public void on_playback_time(final double time) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				progressBar.setValue((int)time);
				if(!usePercent) {
					int seconds = (int)time % 60;
					progressBar.setString((int)time / 60 + ":" + (seconds < 10 ? "0" : "") + seconds);
				}	
			}
		});
	}

	public void on_volume_change(float volume) {
		// TODO Auto-generated method stub
		
	}


	public Object createUIEPanel() {
		uieWindow = new UIESwingPanel();
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		trackLabel = new JLabel("Track:");
		trackLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		
		JButton startButton = new JButton("Start");
		startButton.addActionListener( new MainThreadActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FBAPI.getPlaybackControl().start();
			}
		}));
		
		JButton stopButton = new JButton("Stop");
		stopButton.addActionListener( new MainThreadActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FBAPI.getPlaybackControl().stop();
			}
		}));
		
		
		JToggleButton pauseButton = new JToggleButton("Pause");
		pauseButton.addActionListener( new MainThreadActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FBAPI.getPlaybackControl().play_or_pause();
			}
		}));
		
		/*
		JToggleButton muteButton = new JToggleButton("Mute");
		pauseButton.addActionListener( new MainThreadActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FBAPI.getPlaybackControl().volume_mute_toggle();
			}
		}));
		*/
		
		topPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		topPanel.add(startButton);
		topPanel.add(stopButton);
		topPanel.add(pauseButton);
		//topPanel.add(muteButton);

		progressBar  = new JProgressBar();
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		
		JRadioButton b1 = new JRadioButton(new AbstractAction("Display percent") {
			 public void actionPerformed(ActionEvent evt) {
				 	usePercent = true;
				 	progressBar.setString(null);
		        }
		});
		//b1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		b1.setSelected(true);
	    
		JRadioButton b2 = new JRadioButton(new AbstractAction("Display elapsed time") {
			 public void actionPerformed(ActionEvent evt) {
				 	usePercent = false;
		        }
		});
		//b2.setAlignmentX(Component.CENTER_ALIGNMENT);
	    
	    // Associate the two buttons with a button group
	    ButtonGroup group = new ButtonGroup();
	    group.add(b1);
	    group.add(b2);

		
		mainPanel.add(Box.createVerticalStrut(5));
		mainPanel.add(topPanel);
		mainPanel.add(Box.createVerticalStrut(5));
		mainPanel.add(progressBar);
		//mainPanel.add(Box.createVerticalStrut(5));
		mainPanel.add(trackLabel);
		mainPanel.add(Box.createVerticalStrut(10));
		mainPanel.add(b1);
		mainPanel.add(b2);
		mainPanel.add(Box.createVerticalStrut(5));
		
		uieWindow.setContentPane(mainPanel);
		uieWindow.pack();

		uieWindow.setVisible(true);
		return uieWindow;
	}

	public void destroyUIEPanel() {
		
	}

	public GUID getUIEPanelGUID() {
		return GUID_window;
	}
	
	public String getUIEPanelName() {
		return "Useless Player Control";
	}
	
	
  }
  

