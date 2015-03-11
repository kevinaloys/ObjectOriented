package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class ViewDiet extends JPanel implements ActionListener
{
	private JButton viewBoundary;
	private JLabel boundary;
	private JButton viewCalories;
	private JLabel calories;
	
	private String userID;
	
	/***/
	public ViewDiet(String userid)
	{
		this.userID = userid;
		
		Font font = new Font("Calibri" , Font.BOLD, 20);
		
		viewBoundary = new JButton("View Boundary Cal/Day");
		viewBoundary.setFont(font);
		viewBoundary.setActionCommand("boundary");
		viewBoundary.addActionListener(this);
		viewBoundary.setPreferredSize(new Dimension(70,80));
		viewBoundary.setAlignmentX(CENTER_ALIGNMENT);
		
		
		boundary = new JLabel();
		boundary.setFont(font);
		boundary.setPreferredSize(new Dimension(60,60));
		
		viewCalories = new JButton("View Calories consumed");
		viewCalories.setFont(font);
		viewCalories.setActionCommand("calories");
		viewCalories.addActionListener(this);
		viewCalories.setPreferredSize(new Dimension(70,80));
		viewCalories.setAlignmentX(CENTER_ALIGNMENT);
		
		calories = new JLabel();
		calories.setFont(font);
		calories.setPreferredSize(new Dimension(60,60));
		
		setLayout();
	}
	/***/
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,20)));
		add(viewBoundary);
		add(Box.createRigidArea(new Dimension(0,70)));
		add(boundary);
		add(Box.createRigidArea(new Dimension(0,70)));
		add(viewCalories);
		add(Box.createRigidArea(new Dimension(0,70)));
		add(calories);
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		//this.userid
		if(command.equals("boundary"))
		{
			
		}
		//1. view boundary -> get db value using id for cal/day
		
		//2. get cal consumed last month
		if(command.equals("calories"))
		{
			
		}
	}

}
