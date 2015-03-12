package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import com.campuscafe.implementation.Driver;
/**
 * @author Kevin Aloysius
 * @author Varada*/
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
		 addDietBoundary.setAlignmentX(CENTER_ALIGNMENT);
		 
		 diet = new JTextField();
		 diet.setPreferredSize(new Dimension(70,80));
		 diet.setHorizontalAlignment(JTextField.CENTER);
		 diet.setAlignmentX(CENTER_ALIGNMENT);
		
		addSpecialNeed = new JButton("Add special needs");
		addSpecialNeed.setActionCommand("spNeeds");
		addSpecialNeed.addActionListener(this);
		addSpecialNeed.setFont(new Font("Calibri", Font.BOLD, 22));
		addSpecialNeed.setAlignmentX(CENTER_ALIGNMENT);
		
		specialNeeds = new JTextField();
		specialNeeds.setPreferredSize(new Dimension(70,80));
		specialNeeds.setAlignmentX(CENTER_ALIGNMENT);
		specialNeeds.setHorizontalAlignment(JTextField.CENTER);
		
		setLayout();
		
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,40)));
		add(addDietBoundary);
		add(Box.createRigidArea(new Dimension(0,20)));
		add(diet);
		add(Box.createRigidArea(new Dimension(0,40)));
		add(addSpecialNeed);
		add(Box.createRigidArea(new Dimension(0,20)));
		add(specialNeeds);
		add(Box.createRigidArea(new Dimension(0,40)));
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
		/**
		 * @author Kevin Aloysius
		 */
		String command = event.getActionCommand();
		Driver driver = new Driver();
		if(command.equals("boundary"))	
		{	
			int caloriesperday;
			int userid = Integer.parseInt(this.userID);
			String boundary = this.diet.getText();
			try
			{
				caloriesperday = Integer.parseInt(boundary);
			}
			catch(NumberFormatException e)
			{
				caloriesperday = 0;
			}
			driver.addCaloriePerDay(userid, caloriesperday);
			// String value of the add diet requirements that needs to be added into the database
		}
		if(command.equals("spNeeds"))
		{
			int userid = Integer.parseInt(this.userID);
			String specialneeds = this.specialNeeds.getText();
			driver.setSpecialNeed(userid, specialneeds);
		}
		
	}

}
