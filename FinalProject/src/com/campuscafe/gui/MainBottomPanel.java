package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainBottomPanel extends JPanel
{
private BottomLeft leftPanel;
private BottomRight rightPanel;

private StatusPanel statusPanel;
/***/
public MainBottomPanel()
{
	statusPanel = new StatusPanel();
	
	leftPanel = new BottomLeft(statusPanel);
	rightPanel = new BottomRight(statusPanel);
	rightPanel.setPreferredSize(new Dimension(200,200));
	
	setLayout();
}
/***/
public void setLayout()
{
	this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	add(leftPanel);
	add(rightPanel);
}
/***/
public StatusPanel getStatusPane()
{
	return this.statusPanel;
}

}

