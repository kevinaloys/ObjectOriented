package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class Diet extends JPanel implements ActionListener
{
	private JButton addDietBoundary;
	private JTextField diet;
	private ViewDiet view;
	
	private JButton addSpecialNeed;
	private JTextField specialNeeds;
	private String userID;
	private StatusPanel panel;
	
	public Diet(String userid, StatusPanel panelStatus)
	{
		this.userID = userid;
		this.panel = panelStatus;
		view = new ViewDiet(userid, panelStatus);
		
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
	/***/
	public ViewDiet getViewDiet()
	{
		return this.view;
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		
		if(command.equals("boundary"))
		{
			
		}
		if(command.equals("spNeeds"))
		{
			//send to db
		}
		
	}

}
