package com.campuscafe.gui;

import java.awt.Font;

import javax.swing.*;

public class GraphType extends JPanel
{
	private JRadioButton diet ;
	private JRadioButton expense ;	
	
	public GraphType()
	{		
		 diet = new JRadioButton("diet");
		 diet.setFont(new Font("Calibri",Font.BOLD, 22));
		 expense = new JRadioButton("expense");	
		 expense.setFont(new Font("Calibri",Font.BOLD, 22));
					
		setLayout();		
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(diet);
		add(expense);
	}
}	