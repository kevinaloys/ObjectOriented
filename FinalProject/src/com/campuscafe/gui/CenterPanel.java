package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * @author Varada*/
public class CenterPanel extends JPanel
{
	private CenterDisplayPanel centerPanel;
	private MainBottomPanel bottomMenu;

	public CenterPanel()
	{
		bottomMenu = new MainBottomPanel();
		centerPanel = new CenterDisplayPanel(this.bottomMenu);
		
		
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
