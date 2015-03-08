package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BottomLeft extends JPanel
{
	private SwitchCanteenMenu menu;
	private DisplayBottomMenu menuDisplay;
	
	public BottomLeft(StatusPanel statusPanel)
	{
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.menu = new SwitchCanteenMenu(statusPanel);
		this.menuDisplay = menu.getDisplayMenu();
		
		setLayout();
		
	}
	public void setLayout()
	{		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(menu);
		add(menuDisplay);
	}
	/***/
	public DisplayBottomMenu getBottomDisplay()
	{
		return this.menuDisplay;
	}
}
