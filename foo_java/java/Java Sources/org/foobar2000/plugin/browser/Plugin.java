package org.foobar2000.plugin.browser;

import java.util.Vector;

import org.foobar2000.api.*;
import org.foobar2000.plugin.*;

public class Plugin extends PluginBase implements /*context_menu_simple, */ play_callback, UIEPanelFactory {
	
	
	UIEBrowserPanel browserPanel = null;
	
	public Plugin(long plugin_ptr) {
		super(plugin_ptr);
	}
	
	
	/************************************************************************
     * 						play_callback INTERFACE						    *
     ************************************************************************/
	
	
	public void on_playback_dynamic_info(file_info finfo) {
	}


	public void on_playback_dynamic_info_track(file_info finfo) {
	}


	public void on_playback_new_track(final metadb_handle item) {
		if(browserPanel != null) {
			browserPanel.on_playback_new_track(item);
		}
	}

	public void on_playback_time(double time) {
	}


	public void on_volume_change(float volume) {
	}

	/************************************************************************
     * 						UIEPanelFactory INTERFACE					    *
     ************************************************************************/
	
	public Object createUIEPanel() {
		
		browserPanel = new UIEBrowserPanel();
		return browserPanel.getShell();
	}

	public GUID getUIEPanelGUID() {
		return UIEBrowserPanel.GUID;
	}

	public void destroyUIEPanel() {
		browserPanel.exit();
	}

	public String getUIEPanelName() {
		return "WWW Browser";
	}
	
	/************************************************************************
     * 						MENU INTERFACE								    *
     ************************************************************************/
	/* 
	Vector<metadb_handle> items;
	
	static public final GUID GUID_menu = new GUID_from_text("171878E0-E9D0-4106-9606-22D317CE07AC");

	
	public void context_command(int p_index, Vector<metadb_handle> p_data) {
		// TODO Auto-generated method stub
		switch(p_index) {
			case 0:
				if(browserPanel != null) {
					browserPanel.tagItems(p_data);
				}
				break;

		}
	}

	public String get_item_default_path(int p_index) {
		return "WWW Browser";
	}

	public String get_item_description(int p_index) {
		// TODO Auto-generated method stub
		return "";
	}

	public String get_item_name(int p_index) {
		switch(p_index) {
			case 0:
				return "Test Tag items in SWT Thread";
		}
		return "";
	}

	public int get_num_items() {
		// TODO Auto-generated method stub
		return 1;
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
	*/
	
		
	
}
