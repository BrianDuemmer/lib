package org.foobar2000.plugin.test;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Vector;
import org.foobar2000.api.*;
import org.foobar2000.plugin.*;

public class Plugin	extends PluginBase implements context_menu_simple  {
	
	JTextField tagField;
	JTextField tagValue;
	
	JFrame dialog = new JFrame();
	
	Vector<metadb_handle> items;
	
	static GUID GUID_menu = new GUID_from_text("9F7BA2B6-27E6-461c-B785-D7C538B9FB54");

	
	public Plugin(long plugin_ptr) {
		super(plugin_ptr);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new SpringLayout());
		
				
	    JLabel l = new JLabel("Tag", JLabel.TRAILING);
	    topPanel.add(l);
	    tagField = new JTextField(10);
	    //tagField.setMaximumSize(new Dimension(0,25));
		l.setLabelFor(tagField);
		topPanel.add(tagField);
		
		l = new JLabel("Value", JLabel.TRAILING);
	    topPanel.add(l);
	    tagValue = new JTextField(10);
	    //tagValue.setMaximumSize(new Dimension(0,25));
		l.setLabelFor(tagValue);
		topPanel.add(tagValue);
		

//		Lay out the panel.
		SpringUtilities.makeCompactGrid(topPanel,
		                                2, 2, //rows, cols
		                                6, 6,        //initX, initY
		                                6, 6);       //xPad, yPad
		
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
			
			
		JButton button = new JButton("Tag");

		button.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final Vector<file_info> finfos = new Vector<file_info>();

				for(metadb_handle item : items) {
					file_info_impl finfo = new file_info_impl();
					item.get_info(finfo);
					finfo.meta_set(tagField.getText(), tagValue.getText());
					finfos.add(finfo);
				}

				FBAPI.runInMainThreadSwing(new Runnable() {
					public void run() {
						FBAPI.getMetaDBIO().update_info_multi(items, finfos, 
								(int)FBAPI.getMainWindowHandle(), true);		
					}
				});


				dialog.dispose();
			}
		});

		bottomPanel.add(button);
		
		mainPanel.add(topPanel);
		mainPanel.add(bottomPanel);
		dialog.setContentPane(mainPanel);
		
		dialog.setAlwaysOnTop(true);
		dialog.pack();
	}	
	
	void tagItems() {
		final Vector<file_info> finfos = new Vector<file_info>();

		for(metadb_handle item : items) {
			file_info_impl finfo = new file_info_impl();
			item.get_info(finfo);
			finfo.meta_set(tagField.getText(), tagValue.getText());
			finfos.add(finfo);
		}
		FBAPI.getMetaDBIO().update_info_multi(items, finfos, 
				(int)FBAPI.getMainWindowHandle(), true);		

	}

    public void close() {
    	dialog.dispose();
    	dialog = null;
    }
	
    /************************************************************************
     * 						MENU INTERFACE								    *
     ************************************************************************/
    
	public void context_command(int p_index, Vector<metadb_handle> p_data) {
		// TODO Auto-generated method stub
		switch(p_index) {
			case 0:
				items = p_data;
				tagItems();
				break;

			case 1:
				items = p_data;
				dialog.setVisible(true);
				break;

		}
	}

	public String get_item_default_path(int p_index) {
		return "Plugin test";
	}

	public String get_item_description(int p_index) {
		// TODO Auto-generated method stub
		return "";
	}

	public String get_item_name(int p_index) {
		switch(p_index) {
			case 0:
				return "Tag items";
			case 1:
				return "Tag items popup...";
			
		}
		return "";
	}

	public int get_num_items() {
		// TODO Auto-generated method stub
		return 2;
	}

	public int get_enabled_state(int p_index) {
		// TODO Auto-generated method stub
		return 0;
	}

	public GUID get_item_guid(int p_index) {
		// TODO Auto-generated method stub
		return null;
	}

	public GUID get_menu_guid() {
		return GUID_menu;
	}
	

  }
  


