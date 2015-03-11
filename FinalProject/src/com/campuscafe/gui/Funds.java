package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import com.campuscafe.implementation.*;
/***/
public class Funds extends JPanel implements ActionListener
{
	private JButton add;
	private JTextField funds;
	private ViewFunds view;
	
	private String userID;
	private StatusPanel status;
    private Driver driver;
	public Funds()
	{
		
	}
	/***/
	public Funds(String userid, StatusPanel panelStatus)
	{
		this.userID = userid;
		this.status = panelStatus;
		view = new ViewFunds(userid);
		
		Font font = new Font("Calibri" , Font.BOLD, 22);
		
		add = new JButton("Add Amount : ");
		add.setFont(font);
		add.setPreferredSize(new Dimension(70,80));
		add.setAlignmentX(CENTER_ALIGNMENT);
		
		funds = new JTextField();
		funds.setFont(font);
		funds.setPreferredSize(new Dimension(60,60));
		
		add.setActionCommand("add");
		add.addActionListener(this);
		setLayout();
	}
	/***/
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,20)));
		add(add);
		add(Box.createRigidArea(new Dimension(0,70)));
		add(funds);
		add(Box.createRigidArea(new Dimension(0,70)));

	}
	/**Returns the ViewFunds object created inside the Funds constructor*/
	public ViewFunds getViewFunds()
	{
		return this.view;
	}
	/** Action performed on the Add funds in the Application
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		
		if(command.equals("add"))
		{
			//write this.textfield with uid to db.
			int currentFunds = 0;
			//1. get from db
			
			//2. add this.funds.gettext to db at the this.userid
			
			//display in status panel
			String output =  "User ID: " + this.userID + "\nCurrent funds: " + currentFunds;
							   // get funds from db
														
			this.status.setDisplay(output);			
				
		}		
	}
}

