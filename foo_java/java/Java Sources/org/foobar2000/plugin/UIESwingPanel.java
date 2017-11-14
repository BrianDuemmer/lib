package org.foobar2000.plugin;

import java.awt.Dimension;

import javax.swing.JWindow;

import org.foobar2000.api.GUID;

public class UIESwingPanel extends JWindow {
	
	public UIESwingPanel() {
		Dimension dim = new Dimension(0,0);
		setSize(dim);
		setPreferredSize(dim);
		setMaximumSize(dim);
	}
	
	public void destroy() {
		dispose();
	}
	
	public GUID getExtensionGUID() {
		return null;
	}
	
	
}
