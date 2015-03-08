package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class CanteenApplication extends JFrame
{
	private MainLeftPanel mainPanel;
	private CenterPanel centerPanel;
	
	private String userID;
	
	public CanteenApplication()
	{
		
	}
	public CanteenApplication(String id)
	{
		this.userID = id;
		Container contentPane = getContentPane();	 
		 
		 setTitle("CampusCafe");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
	     	 
	     this.mainPanel = new MainLeftPanel(this.userID);  
	     this.mainPanel.setPreferredSize(new Dimension(300,1000));
	     this.centerPanel = this.mainPanel.getDisplay();  
	     
	       
	     setFrameProperties();
	     //Add the panel to the window.
	     contentPane.add(mainPanel, BorderLayout.WEST);
	     contentPane.add(centerPanel, BorderLayout.CENTER);
	     
	     //setLocationRelativeTo(null);   
	     pack();
	}
	/***/
	public void setFrameProperties()
	{		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = 1500; int height =1000;
		screenSize.setSize(width, height);
		this.setPreferredSize(screenSize);
		this.mainPanel.setAlignmentY(TOP_ALIGNMENT);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
    	Login login = new Login();
    	login.setMinimumSize(new Dimension(500,500));
    	login.setVisible(true);
	}		
	/***/
	public String getUserID()
	{
		return this.userID;
	}		
}


