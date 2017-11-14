package org.foobar2000.plugin;

import org.foobar2000.api.GUID;

public interface UIEPanelFactory {
	public Object createUIEPanel();
	public void destroyUIEPanel();
	public GUID getUIEPanelGUID();
	public String getUIEPanelName();
}
