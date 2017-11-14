package org.foobar2000.plugin;

import java.util.Vector;

import org.foobar2000.api.GUID;
import org.foobar2000.api.metadb_handle;

public interface context_menu_simple {

	public static final int FORCE_OFF = 0;
	public static final int DEFAULT_OFF = 1;
	public static final int DEFAULT_ON = 2;
	
	public int get_enabled_state(int p_index);
	public int get_num_items();
	public String get_item_name(int p_index);
	public String get_item_default_path(int p_index);
	public void context_command(int p_index, Vector<metadb_handle> p_data);
	public String get_item_description(int p_index);
	public GUID get_item_guid(int p_index);
	public GUID get_menu_guid();
	
	
}
