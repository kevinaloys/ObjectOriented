package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import com.campuscafe.implementation.Driver;

public class ViewDiet extends JPanel implements ActionListener
{
	private JButton viewBoundary;
	private JLabel boundary;
	private JButton viewCalories;
	private JLabel calories;
	private JButton viewSpecialNeeds;
	private JLabel specialNeeds;
	
	private String userID;
	
	/***/
	public ViewDiet(String userid)
	{
		this.userID = userid;
		
		Font font = new Font("Calibri" , Font.BOLD, 18);
		
		viewBoundary = new JButton("View Boundary Cal/Day");
		viewBoundary.setFont(font);
		viewBoundary.setActionCommand("boundary");
		viewBoundary.addActionListener(this);
		viewBoundary.setPreferredSize(new Dimension(70,80));
		viewBoundary.setAlignmentX(CENTER_ALIGNMENT);		
		
		boundary = new JLabel();
		boundary.setFont(font);
		boundary.setPreferredSize(new Dimension(60,60));
		boundary.setHorizontalAlignment(JLabel.CENTER);
		
		viewCalories = new JButton("View Calories consumed");
		viewCalories.setFont(font);
		viewCalories.setActionCommand("calories");
		viewCalories.addActionListener(this);
		viewCalories.setPreferredSize(new Dimension(70,80));
		viewCalories.setAlignmentX(CENTER_ALIGNMENT);
		
		calories = new JLabel();
		calories.setFont(font);
		calories.setPreferredSize(new Dimension(60,60));
		calories.setHorizontalAlignment(JLabel.CENTER);
		
		viewSpecialNeeds = new JButton("View special conditions");
		viewSpecialNeeds.setActionCommand("needs");
		viewSpecialNeeds.setFont(font);
		viewSpecialNeeds.addActionListener(this);
		viewSpecialNeeds.setAlignmentX(CENTER_ALIGNMENT);
		viewSpecialNeeds.setPreferredSize(new Dimension(70,80));
		
		specialNeeds = new JLabel( "pull diet requirements / needs");
		specialNeeds.setFont(font);
		specialNeeds.setPreferredSize(new Dimension(60,60));
		specialNeeds.setHorizontalAlignment(JLabel.CENTER);
		specialNeeds.setAlignmentX(CENTER_ALIGNMENT);
		
		setLayout();
	}
	/***/
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,10)));
		add(viewBoundary);
		add(Box.createRigidArea(new Dimension(0,10)));
		add(boundary);
		add(Box.createRigidArea(new Dimension(0,20)));
		add(viewCalories);
		add(Box.createRigidArea(new Dimension(0,20)));
		add(calories);
		add(Box.createRigidArea(new Dimension(0,20)));
		add(viewSpecialNeeds);
		add(Box.createRigidArea(new Dimension(0,10)));
		add(specialNeeds);
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		Driver driver = new Driver();
		//this.userid
		if(command.equals("boundary"))
		{
			try
			{
				int userid = Integer.parseInt(this.userID);
				String calorieperday = driver.getCaloriePerDay(userid);
				boundary.setText(calorieperday);
			}
			catch(NullPointerException e)
			{
				boundary.setText("0");
			}
			
			
		}
		//1. view boundary -> get db value using id for cal/day
		
		//2. get cal consumed this current month;
		if(command.equals("calories"))
		{
			int userid = Integer.parseInt(this.userID);
			int consumedcalories = driver.getConsumedCalories(userid);
			String consumedcal = Integer.toString(consumedcalories);
			calories.setText(consumedcal);
			
		}
		
		if(command.equals("needs"))
		{
			//pull special needs from db
			//display to this.specialNeeds
		}
		
	}

}
