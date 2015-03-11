package com.campuscafe.gui;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

import java.net.URL;

public class MapPanel extends JPanel
{
	private String sizedMap;
	private JLabel map;
	private JLabel coordinateLabel;
	
	public MapPanel()
	{
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) 
		{
		    e.printStackTrace();
		}
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension maxSize = new Dimension((screenSize.width)/3, (screenSize.height)/3);
		
		sizedMap = "res/MapImage.png";
		
		ImageIcon mapLabel = new ImageIcon(getClass().getClassLoader().getResource(sizedMap));	
		map = new JLabel(mapLabel);
		coordinateLabel = new JLabel("");
		coordinateLabel.setPreferredSize(new Dimension(35,35));		
		//add code here
		
		setLayout();
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));		

		add(map);
		add(coordinateLabel);
	}
	public void setXY(String value)
	{
		this.coordinateLabel.setText(value);
	}

}
