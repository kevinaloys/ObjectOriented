package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class VendingMachine extends JPanel implements ActionListener
{
	private JLabel item1, item2, item3, item4, item5, item6, item7, item8, item9;
	private JCheckBox one, two, three, four, five, six, seven, eight, nine;
	
	private JLabel totalLabel; 
	int total = 0;	int calories=0;
	private JButton purchase;
	private JButton clear;
	
	private String userID;
	private StatusPanel panel;
	
	public VendingMachine(String userid, StatusPanel panelStatus)
	{	
		this.userID = userid;
		this.panel = panelStatus;
		
		totalLabel = new JLabel("  Total ");
		totalLabel.setFont(new Font("Calibri",Font.BOLD, 25));
		totalLabel.setHorizontalAlignment(JLabel.LEFT);
		
		purchase = new JButton("  Purchase ");
		purchase.setFont(new Font("Calibri",Font.BOLD, 20));
		purchase.setHorizontalAlignment(JLabel.CENTER);
		
		clear = new JButton();
		clear.setText("Clear"); clear.setFont(new Font("Calibri",Font.BOLD, 20));
		
		setItemGUI();	
		setButtonProperties();
		setGridLayout();		
	}
	/***/
	public void setGridLayout()
	{
		this.setLayout(new GridLayout(7,3));
		add(item1);		add(item2);
		add(item3);		add(one);
		add(two);		add(three);
		
		add(item4);		add(item5);		
		add(item6);		add(four);
		add(five);		add(six);
		
		add(item7);		add(item8);	
		add(item9);     add(seven);
		add(eight);		add(nine);
		
		add(clear);		add(totalLabel);	add(purchase);
	}
	/***/
	public void setItemGUI()
	{
		Font font = new Font("Calibri",Font.BOLD,20);
		
		item1 = new JLabel("Snickers ($2) 100cal"); 	item1.setFont(font); 	item1.setHorizontalAlignment(JLabel.CENTER);
		item2 = new JLabel("Energy Bar ($6) 40cal"); 	item2.setFont(font);	item2.setHorizontalAlignment(JLabel.CENTER);
		item3 = new JLabel("Chocolate Raisins ($4) 60cal");   item3.setFont(font);	
		item3.setHorizontalAlignment(JLabel.CENTER);
		
		one = new JCheckBox(""); 					
		one.setHorizontalAlignment(JLabel.CENTER);
		two = new JCheckBox(""); 					two.setFont(font);
		two.setHorizontalAlignment(JLabel.CENTER);
		three = new JCheckBox(""); 					three.setFont(font);
		three.setHorizontalAlignment(JLabel.CENTER);
		
		item4 = new JLabel("Odwalla ($10) 70cal"); 		item4.setFont(font);	item4.setHorizontalAlignment(JLabel.CENTER);
		item5 = new JLabel("Soda ($7)  120cal"); 		item5.setFont(font);	item5.setHorizontalAlignment(JLabel.CENTER);
		item6 = new JLabel("Water ($6)  2cal"); 		item6.setFont(font);	item6.setHorizontalAlignment(JLabel.CENTER);
		
		four = new JCheckBox(""); 					four.setFont(font);
		four.setHorizontalAlignment(JLabel.CENTER);
		five = new JCheckBox(""); 					five.setFont(font);
		five.setHorizontalAlignment(JLabel.CENTER);
		six = new JCheckBox(""); 					six.setFont(font);
		six.setHorizontalAlignment(JLabel.CENTER);
		
		item7 = new JLabel("Sandwich (12$) 30cal"); 		item7.setFont(font);  item7.setHorizontalAlignment(JLabel.CENTER);
		item8 = new JLabel("Baked Wafers (7$) 40cal"); 	item8.setFont(font);  item8.setHorizontalAlignment(JLabel.CENTER);
		item9 = new JLabel("Popcorn (4$)  80cal"); 			item9.setFont(font);  item9.setHorizontalAlignment(JLabel.CENTER);
		
		seven = new JCheckBox(""); 					seven.setFont(font);
		seven.setHorizontalAlignment(JLabel.CENTER);
		eight = new JCheckBox(""); 					eight.setFont(font);
		eight.setHorizontalAlignment(JLabel.CENTER);
		nine = new JCheckBox(""); 					nine.setFont(font);
		nine.setHorizontalAlignment(JLabel.CENTER);
	}
	/***/
	public void setButtonProperties()
	{
		one.addActionListener(this);   	one.setActionCommand("1");
		two.addActionListener(this);   	two.setActionCommand("2");
		three.addActionListener(this); 	three.setActionCommand("3");
		four.addActionListener(this);	four.setActionCommand("4");
		five.addActionListener(this);	five.setActionCommand("5");
		six.addActionListener(this);	six.setActionCommand("6");	
		seven.addActionListener(this);	seven.setActionCommand("7");
		eight.addActionListener(this);	eight.setActionCommand("8");
		nine.addActionListener(this);	nine.setActionCommand("9");
		
		clear.addActionListener(this);		clear.setActionCommand("clear");
		purchase.addActionListener(this);	purchase.setActionCommand("purchase");
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		
		if(command.equals("clear"))
		{
			this.clear();
		}
		if(command.equals("purchase"))
		{
				String output =  "User ID: " + this.userID + "\nTotal: " + this.total + "$" +
								 "\nCalories :" + this.calories + "cal";
				this.panel.setDisplay(output);
			
		}
		if(command.equals("1"))
		{
			if(one.isSelected())
			{	this.total = this.total+2;		this.calories = this.calories+100;			}
			else
			{	this.total = this.total-2;		this.calories = this.calories-100;			}						
		}
		if(command.equals("2"))
		{
			if(two.isSelected())
			{	this.total = this.total+6;		this.calories = this.calories+40;			}
			else
			{	this.total = this.total-6;		this.calories = this.calories-40;			}
		}
		if(command.equals("3"))
		{
			if(three.isSelected())
			{	this.total = this.total+4;		this.calories = this.calories+60;			}
			else
			{	this.total = this.total-4;		this.calories = this.calories-60;			}
		}
		if(command.equals("4"))
		{
			if(four.isSelected())
			{	this.total = this.total+10;		this.calories = this.calories+70;			}
			else
			{	this.total = this.total-10;		this.calories = this.calories-70;			}
		}
		if(command.equals("5"))
		{
			if(five.isSelected())
			{	this.total = this.total+7;		this.calories = this.calories+120;			}
			else
			{	this.total = this.total-7;		this.calories = this.calories-120;			}
		}
		if(command.equals("6"))
		{
			if(six.isSelected())
			{	this.total = this.total+6;		this.calories = this.calories+2;			}
			else
			{	this.total = this.total-6;		this.calories = this.calories-2;			}
		}
		if(command.equals("7"))
		{
			if(seven.isSelected())
			{	this.total = this.total+12;		this.calories = this.calories+30;			}
			else
			{	this.total = this.total-12;		this.calories = this.calories-30;			}
		}
		if(command.equals("8"))
		{
			if(eight.isSelected())
			{	this.total = this.total+7;		this.calories = this.calories+40;			}
			else
			{	this.total = this.total-7;		this.calories = this.calories-40;			}
		}
		if(command.equals("9"))
		{
			if(nine.isSelected())
			{	this.total = this.total+4;		this.calories = this.calories+80;			}
			else
			{	this.total = this.total-4;		this.calories = this.calories-80;			}
		}
			
		String totalString = " Total : " + String.valueOf(total) + "$ " + String.valueOf(calories) + " cal";
		if(this.total==0 && this.calories==0)
			totalString = "  Total ";
		this.totalLabel.setText(totalString);			
	}
	/**
	 * Clears all the selected checkboxes in the VendingMachine */
	public void clear() 
	{
		one.setSelected(false);	two.setSelected(false); three.setSelected(false);
		four.setSelected(false);	five.setSelected(false); six.setSelected(false);
		seven.setSelected(false);	eight.setSelected(false); nine.setSelected(false);
		
		this.total = 0;
		this.calories = 0;
		this.totalLabel.setText("  Total ");
		this.panel.setDisplay(" ");
	}
}
