package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class CenterPanel extends JPanel
{
	private CenterDisplayPanel centerPanel;
	private MainBottomPanel bottomMenu;

	public CenterPanel()
	{
		centerPanel = new CenterDisplayPanel();
		bottomMenu = new MainBottomPanel();
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(centerPanel);
		add(bottomMenu);
	}
	/***/
	public MainBottomPanel getBottomMenu()
	{
		return this.bottomMenu;
	}
	/***/
	public StatusPanel getStatusPanel()
	{
		return (this.bottomMenu.getStatusPane());	
	}

}
