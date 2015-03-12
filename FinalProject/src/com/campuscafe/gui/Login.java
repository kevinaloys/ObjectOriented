package com.campuscafe.gui;

import javax.swing.JFrame;
import javax.swing.UIManager;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

import com.campuscafe.implementation.Driver;

/**
 * @author Varada*/
public class Login extends JFrame implements ActionListener
{
private String userID;
private String expiryDate;

private JTextField userIdField;
private JLabel userIdLabel;
private JTextField expiryDateField;
private JLabel expiryDateLabel;

private JButton okay;
private boolean validated=false;

private JPanel panel;

	public Login()
	{	 
		
		 try 
		 { 
			//Author : Kevin Aloysius
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		 } catch (Exception e) 
		 {
		    e.printStackTrace();
		 }
		 Container contentPane = getContentPane();	 
		 
		 setTitle("CampusCafe");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
	    
		 setVisible(true);
		 
		 panel = new JPanel();
		 contentPane.add(panel);
		
		 expiryDateLabel = new JLabel("Enter Date : ");
		 expiryDateLabel.setFont(new Font("Calibri",Font.BOLD,25));
		 expiryDateLabel.setHorizontalAlignment(JLabel.RIGHT);
		 
		 userIdLabel = new JLabel("Enter ID ");
		 userIdLabel.setHorizontalAlignment(JLabel.RIGHT);
		 userIdLabel.setFont(new Font("Calibri",Font.BOLD,25));
		 
		 userIdField = new JTextField();
		 userIdField.setFont(new Font("Calibri",Font.BOLD,20));
		 userIdField.setHorizontalAlignment(JTextField.CENTER);
		 userIdField.setPreferredSize(new Dimension(80,80));
		 
		 expiryDateField = new JTextField();
		 expiryDateField.setFont(new Font("Calibri",Font.BOLD,20));
		 expiryDateField.setHorizontalAlignment(JTextField.CENTER);
		 expiryDateField.setPreferredSize(new Dimension(80,80));
		 
		 okay = new JButton("Login");
		 okay.setFont(new Font("Calibri",Font.BOLD,25));
		 
		 setLayout();
		 
		 okay.addActionListener(this);
		 okay.setActionCommand("okay");

		 panel.setVisible(true);	
		 //setLocationRelativeTo(null);  
		 //pack();
	}
	/***/
	public void setLayout()
	{
		 panel.setLayout(new GridLayout(0,2));
	
		 panel.add(userIdLabel);
		 panel.add(userIdField);
		 
		 panel.add(expiryDateLabel);
		 panel.add(expiryDateField);
		
		 panel.add(new JLabel("		")); 
		 panel.add(okay);

	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		
		if(command.equals("okay"))
		{	
			/**
			 * @author Kevin Aloysius
			 */
			this.userID = this.userIdField.getText();
			this.expiryDate = this.expiryDateField.getText();
			
			int userid = Integer.parseInt(this.userID);
			int expiry = Integer.parseInt(this.expiryDate);
			
			Driver driver = new Driver();
			boolean userExists = driver.userExists(userid);
			
			int userexpiry = driver.getCardExpiry(userid);
			
			if((expiry <= userexpiry) && userExists)
			{
				this.validated = true;
			}
			else
			{
				this.validated = false;
			}
			
			if(this.validated)
			{
			this.userID = this.userIdField.getText();
			this.setVisible(false);
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() 
	            {
	            	CanteenApplication application = new CanteenApplication(userID);
	            	application.setVisible(true);	            	
	            }
	        });	
		  } 
		}
	}
}
