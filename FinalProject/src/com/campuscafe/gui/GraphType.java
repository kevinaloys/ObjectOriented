package com.campuscafe.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * @author Varada*/
public class GraphType extends JPanel implements ActionListener
{
	private JRadioButton diet ;
	private JRadioButton expense ;	
	
	public GraphType()
	{		
		 diet = new JRadioButton("Diet");
		 diet.setFont(new Font("Calibri",Font.BOLD, 22));
		 diet.setActionCommand("diet");
		 diet.addActionListener(this);
		 
		 expense = new JRadioButton("Expense");	
		 expense.setFont(new Font("Calibri",Font.BOLD, 22));
		 expense.setForeground(new Color(55, 54, 86));
		 
		 expense.setActionCommand("expense");
		 expense.addActionListener(this);
					
		setLayout();		
	}
	public void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(diet);
		add(expense);
	}
	/**Returns the diet radio button*/
	public JRadioButton getDietButton()
	{
		return this.diet;
	}
	/**Returns the expense radio button*/
	public JRadioButton getExpenseButton()
	{
		return this.expense;
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		
		if(command.equals("diet"))
		{
			if(this.expense.isSelected())
			this.expense.setSelected(false);
		}
		if(command.equals("expense"))
		{
			if(this.diet.isSelected())
				this.diet.setSelected(false);
		}
	}	
	
}	