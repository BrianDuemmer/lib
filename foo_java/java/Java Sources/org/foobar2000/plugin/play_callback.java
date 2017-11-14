package org.foobar2000.plugin;

import org.foobar2000.api.file_info;
import org.foobar2000.api.metadb_handle;

public interface play_callback {
	
	public void on_playback_new_track(metadb_handle item);
	public void on_playback_dynamic_info(file_info finfo);
	public void on_playback_time(double time);
	public void on_volume_change(float volume);
	public void on_playback_dynamic_info_track(file_info finfo);

}
