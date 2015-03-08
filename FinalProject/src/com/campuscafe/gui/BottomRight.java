package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class BottomRight extends JPanel
{private SwitchUserMenu menu;
private DisplayBottomMenu menuDisplay;

public BottomRight(StatusPanel statusPanel)
{
	this.setBorder(BorderFactory.createLineBorder(Color.black));
	this.menu = new SwitchUserMenu(statusPanel);
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
