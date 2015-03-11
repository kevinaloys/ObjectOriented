package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import com.campuscafe.implementation.Driver;

public class Diet extends JPanel implements ActionListener
{
	private JButton addDietBoundary;
	private JTextField diet;
	private ViewDiet view;
	
	private JButton addSpecialNeed;
	private JTextField specialNeeds;
	private String userID;
	
	public Diet(String userid)
	{
		this.userID = userid;

		view = new ViewDiet(userid);
		
		 addDietBoundary =new JButton("Add Boundary conditions (cal)");
		 addDietBoundary.setActionCommand("boundary");
		 addDietBoundary.addActionListener(this);
		 addDietBoundary.setFont(new Font("Calibri", Font.BOLD, 22));
		 
		 diet = new JTextField();
		 diet.setPreferredSize(new Dimension(100,80));
		
		addSpecialNeed = new JButton("Add special needs");
		addSpecialNeed.setActionCommand("spNeeds");
		addSpecialNeed.addActionListener(this);
		addSpecialNeed.setFont(new Font("Calibri", Font.BOLD, 22));
		
		specialNeeds = new JTextField();
		specialNeeds.setPreferredSize(new Dimension(100,80));
		
		setLayout();
		
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,20)));
		add(addDietBoundary);
		add(Box.createRigidArea(new Dimension(0,20)));
		add(diet);
		add(Box.createRigidArea(new Dimension(0,40)));
		add(addSpecialNeed);
		add(Box.createRigidArea(new Dimension(0,20)));
		add(specialNeeds);
	}
	/** Returns the Viewdiet object created in the constructor of Diet*/
	public ViewDiet getViewDiet()
	{
		return this.view;
	}
	/** Actions on the diet boundary and calorie special conditions
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		Driver driver = new Driver();
		if(command.equals("boundary"))	
		{	
			int userid = Integer.parseInt(this.userID);
			String boundary = this.diet.getText();
			int caloriesperday = Integer.parseInt(boundary);
			driver.addCaloriePerDay(userid, caloriesperday);
			// String value of the add diet requirements that needs to be added into the database
		}
		if(command.equals("spNeeds"))
		{
			int userid = Integer.parseInt(this.userID);
			String specialneeds = this.specialNeeds.getText();
		// String value of special requirements to get the special needs and put it into the database.
		}
		
	}

}
