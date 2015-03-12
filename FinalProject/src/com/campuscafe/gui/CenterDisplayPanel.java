package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Varada*/
public class CenterDisplayPanel extends JPanel
{
	private MapPanel mapPanel;
	//private CardLayout cards;
	private MainBottomPanel bottom;
	
	/**This class */
	public CenterDisplayPanel(MainBottomPanel panel)
	{
		//this.cards = new CardLayout();
		this.mapPanel = new MapPanel(panel);
		this.bottom = panel;
		
		this.mapPanel.setPreferredSize(new Dimension(400,500));
		MouseAdapterClass mouseEvent = new MouseAdapterClass(this.mapPanel);
		addMouseListener(mouseEvent);
		
		setCardLayout();		
	}
	/**Sets a layout for the Center panel*/
	public void setCardLayout()
	{
		//this.setLayout(cards);
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		//cards.show(this, "View_map");
		add(mapPanel);
	}

}
