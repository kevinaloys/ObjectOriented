package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * @author Varada*/
public class BottomRight extends JPanel
{
private SwitchUserMenu menu;
private DisplayBottomMenu menuDisplay;

/**This is the Right Panel below that contains the user options funds and diet*/
public BottomRight(StatusPanel statusPanel)
{
	this.setBorder(BorderFactory.createLineBorder(Color.black));
	this.menu = new SwitchUserMenu(statusPanel);
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
/**Returns the Bottom menu that displays the canteen/user options*/
public DisplayBottomMenu getBottomDisplay()
{
	return this.menuDisplay;
}

}// End BottomRight
