package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 * @author Varada */
public class CanteenApplication extends JFrame
{
	private MainLeftPanel mainPanel;
	private CenterPanel centerPanel;
	
	private String userID;
	
	public CanteenApplication()
	{
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) 
		{
		    e.printStackTrace();
		}
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
		Dimension screenSize = new Dimension(1500,1000);
		this.setPreferredSize(screenSize);
		this.mainPanel.setAlignmentY(TOP_ALIGNMENT);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
    	Login login = new Login();
    	login.setSize(new Dimension(500,500));
    	login.setVisible(true);
	}		
			
}


