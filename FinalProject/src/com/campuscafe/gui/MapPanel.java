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
/**
 * @author Varada*/
public class MapPanel extends JPanel
{
	private String sizedMap;
	private JLabel map;
	
	private MainBottomPanel bottompanel;
	
	private int x,y;
	
	public MapPanel(MainBottomPanel panel)
	{
		this.bottompanel = panel;
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
		
		//add code here
		
		setLayout();
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));		

		add(map);
	}
	/**This works similar to an action listener for the cafe and vending machine logos on the map
	 * when the logos are clicked the appropriate canteen menu opens*/
	public void ModifyCanteenDisplay(int xValue, int yValue)
	{
		this.x = xValue; this.y = yValue;
		BottomLeft menu = this.bottompanel.getBottomLeft();
		DisplayBottomMenu display = menu.getBottomDisplay();
		
		//Depending on mouse click change the canteen cafes
		if(this.x > 450 && this.x < 495 && this.y > 230 && this.y < 282)
		{		
			menu.getCanteenSwitch().setCafeIndex(1); //Learning center
			display.showMenu("Cafes");
		}
		if(this.x > 260 && this.x < 310 && this.y > 428 && this.y < 475)
		{
			menu.getCanteenSwitch().setCafeIndex(0); //Benson
			display.showMenu("Cafes");
		}
		if(this.x > 790 && this.x < 850 && this.y > 130 && this.y < 185)
		{
			menu.getCanteenSwitch().setCafeIndex(2); //Malley
			display.showMenu("Cafes");
		}
		if(this.x > 990 && this.x < 1045 && this.y > 100 && this.y < 146)
		{
			menu.getCanteenSwitch().setCafeIndex(3); //Leavey
			display.showMenu("Cafes");
		}
		
		// Depending on mouse click change the vending machines
		if(this.x > 142 && this.x < 195 && this.y > 165 && this.y < 242)
		{
			menu.getCanteenSwitch().setVMIndex(0); //Kenna
			display.showMenu("VM");
		}
		if(this.x > 850 && this.x < 896 && this.y > 380 && this.y < 460)
		{
			menu.getCanteenSwitch().setVMIndex(1); //Sanfillipo R Hall
			display.showMenu("VM");
		}
		
	}// end set XY
}
