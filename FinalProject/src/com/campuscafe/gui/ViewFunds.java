package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class ViewFunds extends JPanel implements ActionListener
{
	private JButton view;
	private JLabel funds;
	
	private String userID;
	private StatusPanel status;
	
	/***/
	public ViewFunds(String userid, StatusPanel panelStatus)
	{
		this.userID = userid;
		this.status = panelStatus;
		
		Font font = new Font("Calibri" , Font.BOLD, 22);
		
		view = new JButton("View Amount : ");
		view.setFont(font);
		view.setPreferredSize(new Dimension(70,80));
		view.setAlignmentX(CENTER_ALIGNMENT);
		
		funds = new JLabel();
		funds.setFont(font);
		funds.setPreferredSize(new Dimension(60,60));
		
		view.setActionCommand("add");
		view.addActionListener(this);
		setLayout();
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,20)));
		add(view);
		add(Box.createRigidArea(new Dimension(0,70)));
		add(funds);
		add(Box.createRigidArea(new Dimension(0,70)));
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent e) 
	{
		String command = e.getActionCommand();
	}

}
