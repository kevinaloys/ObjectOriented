package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author Varada*/
public class MainBottomPanel extends JPanel
{
private BottomLeft leftPanel;
private BottomRight rightPanel;

private StatusPanel statusPanel;
/***/
public MainBottomPanel()
{
	try { 
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) 
	{
	    e.printStackTrace();
	}
	statusPanel = new StatusPanel();
	leftPanel = new BottomLeft(statusPanel);
	leftPanel.setPreferredSize(new Dimension(300, 320));
	rightPanel = new BottomRight(statusPanel);
	rightPanel.setPreferredSize(new Dimension(80,150));
	
	setLayout();
}
/***/
public void setLayout()
{
	this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	add(leftPanel);
	add(rightPanel);
}
/**Returns the left status panel that displays purchase/user account status*/
public StatusPanel getStatusPane()
{
	return this.statusPanel;
}
/**Returns the bottom left panel*/
public BottomLeft getBottomLeft()
{
	return this.leftPanel;
}

}

