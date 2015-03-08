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
	private StatusPanel status;
	
	/***/
	public ViewDiet(String userid, StatusPanel panelStatus)
	{
		this.userID = userid;
		this.status = panelStatus;
		
		Font font = new Font("Calibri" , Font.BOLD, 22);
		
		viewBoundary = new JButton("View Boundary value");
		viewBoundary.setFont(font);
		viewBoundary.setPreferredSize(new Dimension(70,80));
		viewBoundary.setAlignmentX(CENTER_ALIGNMENT);
		
		boundary = new JLabel();
		boundary.setFont(font);
		boundary.setPreferredSize(new Dimension(60,60));
		
		viewCalories = new JButton("View Calories consumed");
		viewCalories.setFont(font);
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
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		//get db values
	}

}
