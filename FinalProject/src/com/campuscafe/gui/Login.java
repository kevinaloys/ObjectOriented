package com.campuscafe.gui;

import javax.swing.JFrame;
import javax.swing.UIManager;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

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
		 try { 
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
		 
		 expiryDateField = new JTextField();
		 expiryDateField.setFont(new Font("Calibri",Font.BOLD,20));
		 expiryDateField.setHorizontalAlignment(JTextField.CENTER);
		 okay = new JButton("Okay");
		 okay.setFont(new Font("Calibri",Font.BOLD,25));
		 
		 setLayout();
		 
		 okay.addActionListener(this);
		 okay.setActionCommand("okay");

		 panel.setVisible(true);	
		 //setLocationRelativeTo(null);  
		 pack();
	}
	/***/
	public void setLayout()
	{
		//this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		 panel.setLayout(new GridLayout(0,2));
		 panel.add(userIdLabel);
		 panel.add(userIdField);
		 panel.add(expiryDateLabel);
		 panel.add(expiryDateField);
		 panel.add(new JLabel("			"));
		 panel.add(okay);
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		
		if(command.equals("okay"))
		{
			//validation of userid and date
			this.validated=true;

			this.userID = this.userIdField.getText();
			this.setInvisible();
			SwingUtilities.invokeLater(new Runnable() {
	            public void run() 
	            {
	            	CanteenApplication application = new CanteenApplication(userID);
	            	application.setVisible(true);	            	
	            }
	        });			
		}
	}
	/***/
	public boolean getValidation()
	{
		return this.validated;
	}
	/***/
	public void setInvisible()
	{
		this.setVisible(false);
	}
}
