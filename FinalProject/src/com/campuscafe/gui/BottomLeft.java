package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author Varada*/
public class BottomLeft extends JPanel
{
	private SwitchCanteenMenu menu;
	private DisplayBottomMenu menuDisplay;
	
	/**This class is the left panel below that contains the cafe and vending machine*/
	public BottomLeft(StatusPanel statusPanel)
	{
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.menu = new SwitchCanteenMenu(statusPanel);
		this.menuDisplay = menu.getDisplayMenu();
		
		setLayout();
		
	}
	/**Sets a box layout and adds components in the layout*/
	public void setLayout()
	{		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(menu);
		add(menuDisplay);
	}
	/**Returns the display menu for the canteen menu like cafe and vending machine*/
	public DisplayBottomMenu getBottomDisplay()
	{
		return this.menuDisplay;
	}
	/**Returns the switch combo that controls canteen options*/
	public SwitchCanteenMenu getCanteenSwitch()
	{
		return this.menu;
	}
}//End BottomLeft
