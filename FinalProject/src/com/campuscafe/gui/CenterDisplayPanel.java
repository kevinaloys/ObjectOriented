package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.*;

public class CenterDisplayPanel extends JPanel
{
	private MapPanel mapPanel;
	//private Graph graphPanel;
	private CardLayout cards;
	
	public CenterDisplayPanel()
	{
		this.cards = new CardLayout();
		this.mapPanel = new MapPanel();
		
		this.mapPanel.setPreferredSize(new Dimension(400,450));
		//this.graphPanel = new Graph();
		
		setCardLayout();		
	}
	/***/
	public void setCardLayout()
	{
		this.setLayout(cards);
		cards.show(this, "View_map");
		add(mapPanel, "map");
		//add(graphPanel, "graphs");
	}

}
