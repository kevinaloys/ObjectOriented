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
	private JButton cafe;
	private JButton cafe2;
	
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
/*		try	{sizedMap = ImageIO.read(new File("C:/Users/Varada/CampusCafe/Canteen/res/map.jpg"));}
		catch(IOException ex) {}*/
		
		ImageIcon mapLabel = new ImageIcon(getClass().getClassLoader().getResource(sizedMap));	
		map = new JLabel(mapLabel);
		cafe = new JButton("cafe1");
		cafe.setPreferredSize(new Dimension(100,50));
		cafe.setHorizontalAlignment(JButton.CENTER);
		
		cafe2 = new JButton("cafenew");
		
		setMapLayout();
		setLayout();
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));		

		add(map);
	}
	/***/
	public void setMapLayout()
	{
		map.setLayout(new FlowLayout());

	}

}
