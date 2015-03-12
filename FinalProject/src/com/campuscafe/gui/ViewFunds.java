package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import com.campuscafe.implementation.FundsManager;

public class ViewFunds extends JPanel implements ActionListener
{
	private JButton view;
	private JLabel funds;
	
	private String userID;
	
	/***/
	public ViewFunds(String userid)
	{
		this.userID = userid;
		
		Font font = new Font("Calibri" , Font.BOLD, 22);
		
		view = new JButton("View Amount");
		view.setFont(font);
		view.setPreferredSize(new Dimension(70,80));
		view.setAlignmentX(CENTER_ALIGNMENT);
		
		funds = new JLabel();
		funds.setFont(font);
		funds.setAlignmentX(CENTER_ALIGNMENT);
		funds.setHorizontalAlignment(JLabel.CENTER);
		funds.setPreferredSize(new Dimension(60,60));
		
		view.setActionCommand("view");
		view.addActionListener(this);
		setLayout();
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,20)));
		add(view);
		add(Box.createRigidArea(new Dimension(0,10)));
		add(funds);
		add(Box.createRigidArea(new Dimension(0,10)));
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent e) 
	{
		String command = e.getActionCommand();
		
		if(command.equals("view"))
		{
			/**
			 * @author Kevin Aloysius
			 */
			int userid = Integer.parseInt(this.userID);
			FundsManager fund = new FundsManager();
			int balancefunds = fund.getFunds(userid);
			String balance = Integer.toString(balancefunds);
			this.funds.setText(balance);
			
		}
	}

}
