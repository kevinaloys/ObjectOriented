package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import com.campuscafe.implementation.*;
/**
 * @author Varada*/
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
		
		add = new JButton("Add Amount");
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
		/**
		 * @author Kevin Aloysius
		 */
		String command = event.getActionCommand();
		
		if(command.equals("add"))
		{
			int currentFunds = 0;
			int amount;
			FundsManager f = new FundsManager();
			int userid = Integer.parseInt(this.userID);
			
			//Fetching the amount from the Text field.
			String amountToAdd = funds.getText();
			try
			{
				amount = Integer.parseInt(amountToAdd);
			}
			catch(NumberFormatException e)
			{
				amount = 0;
			}
			
			//Inserting the amount into the database
			boolean status = f.addFunds(userid, amount);
			
			//Fetching the added amount from the funds.
			currentFunds = f.getFunds(userid);
			
			String output =  "User ID: " + this.userID + "\nCurrent funds: " + currentFunds;
			this.status.setDisplay(output);			
				
		}		
	}
}

