package com.campuscafe.gui;
//import Implementation.CampusCafe;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;


public class Cafe extends JPanel implements ActionListener
{
private JLabel item1, item2, item3, item4, item5, item6;
private JCheckBox selectItem1, selectItem2, selectItem3, selectItem4, selectItem5, selectItem6;
private JCheckBox toGo, eatIn;
private JButton clear;
private JLabel totalLabel;
private JLabel calLabel;
private JButton purchase;

private String userID;
private StatusPanel panel;
private int total=0; private int calories=0; int time=0;

public Cafe(String userid, StatusPanel panelStatus)
{	
	this.userID = userid;
	this.panel = panelStatus;
	
	this.item1 = new JLabel("Burger");	this.item2 = new JLabel("Tea"); 
	this.item3 = new JLabel("Coffee"); 	this.item4 = new JLabel("Brownie");
	this.item5 = new JLabel("Noodles");	this.item6 = new JLabel("Pasta");
	
	this.selectItem1 = new JCheckBox();	this.selectItem2 = new JCheckBox();
	this.selectItem3 = new JCheckBox();	this.selectItem4 = new JCheckBox();
	this.selectItem5 = new JCheckBox();	this.selectItem6 = new JCheckBox();
	this.toGo = new JCheckBox("To Go");		this.eatIn = new JCheckBox("Eat In");
	
	this.clear = new JButton(" Clear");
	this.clear.setPreferredSize(new Dimension(50,40));
	this.totalLabel = new JLabel(" Total");
	this.purchase = new JButton("Purchase");
	this.calLabel = new JLabel("");
	this.calLabel.setFont(new Font("Calibri",Font.BOLD, 19));
	this.calLabel.setHorizontalAlignment(JLabel.RIGHT);
	
	
	setLayout();
	setButtonProperties();
}
/***/
public void setLayout()
{
	Font font = new Font("Calibri", Font.BOLD, 20);
	
	JLabel label1 = new JLabel("12$ 60cal");		label1.setFont(font);
	JLabel label2 = new JLabel("2$ ");				label2.setFont(font);
	JLabel label3 = new JLabel("3$ ");				label3.setFont(font);
	JLabel label4 = new JLabel("6$ 80cal");			label4.setFont(font);
	JLabel label5 = new JLabel("10$ 70cal");		label5.setFont(font);
	JLabel label6 = new JLabel("11$ 90cal");		label6.setFont(font);
	
	this.clear.setFont(new Font("Calibri", Font.BOLD, 19));
	this.totalLabel.setFont(new Font("Calibri", Font.BOLD, 19));
	this.purchase.setFont(new Font("Calibri",Font.BOLD, 19));
	
	this.toGo.setFont(font);
	this.eatIn.setFont(font);
	
	this.setLayout(new GridLayout(7,4));
	add(item1);		add(label1); 		add(selectItem1);		add(new JLabel("	"));
	add(item2);		add(label2); 		add(selectItem2);		add(toGo);
	add(item3);		add(label3); 		add(selectItem3);		add(new JLabel("	"));
	add(item4);		add(label4); 		add(selectItem4);		add(new JLabel("	"));
	add(item5);		add(label5); 		add(selectItem5);		add(eatIn);
	add(item6);		add(label6); 		add(selectItem6);		add(new JLabel("	"));
	add(clear);		add(totalLabel); 	add(calLabel);		add(purchase);
}
/***/	
public void setButtonProperties()
{
	this.selectItem1.addActionListener(this);	this.selectItem2.addActionListener(this);
	this.selectItem3.addActionListener(this);	this.selectItem4.addActionListener(this);
	this.selectItem5.addActionListener(this);	this.selectItem6.addActionListener(this);
	
	this.selectItem1.setActionCommand("Burger");		this.selectItem2.setActionCommand("Tea");
	this.selectItem3.setActionCommand("Coffee");		this.selectItem4.setActionCommand("Brownie");
	this.selectItem5.setActionCommand("Noodles");		this.selectItem6.setActionCommand("Pasta");
	this.toGo.setActionCommand("togo");					this.eatIn.setActionCommand("eatin");
	this.toGo.addActionListener(this);					this.eatIn.addActionListener(this);
	
	this.clear.addActionListener(this);			this.clear.setActionCommand("clear");
	this.purchase.addActionListener(this);		this.purchase.setActionCommand("purchase");
	
	Font font = new Font("Calibri", Font.BOLD, 20);
	this.item1.setFont(font);	this.item2.setFont(font);	this.item3.setFont(font);
	this.item4.setFont(font);	this.item5.setFont(font);	this.item6.setFont(font);
}
/**
 * @Override*/
public void actionPerformed(ActionEvent event) 
{
	String command = event.getActionCommand();
	
	if(command.equals("clear"))
	{
		this.total = 0;
		this.calories=0;
		this.time =0;
		this.clear();
	}
	if(command.equals("togo"))
	{
		this.eatIn.setSelected(false);
	}
	if(command.equals("eatin"))
	{
		this.toGo.setSelected(false);
	}
	if(command.equals("purchase"))
	{
		String output =  "User ID: " + this.userID + "\nTotal: " + this.total +
						 "\nWill be ready in : " + this.time;
		this.panel.setDisplay(output);
		   // get funds from db
			// balance remaining
	}
	if(command.equals("Burger"))
	{
		if(this.selectItem1.isSelected())
		{  this.total = this.total+12;	 this.calories = this.calories+60;	this.time = this.time+10; }
		else
		{  this.total = this.total-12;	this.calories = this.calories-60;	this.time = this.time-10; }
	}
	if(command.equals("Tea"))
	{
		if(this.selectItem2.isSelected())
		{		this.total = this.total+2;		}
		else
		{		this.total = this.total-2;		}
	}
	if(command.equals("Coffee"))
	{
		if(this.selectItem3.isSelected())
		{		this.total = this.total+3;		}
		else
		{		this.total = this.total-3;		}
	}
	if(command.equals("Brownie"))
	{
		if(this.selectItem4.isSelected())
		{	this.total = this.total+6;	this.calories = this.calories+80;  this.time=this.time+2;}
		else
		{	this.total = this.total-6;	this.calories = this.calories-80;	this.time=this.time-2;}
	}
	if(command.equals("Noodles"))
	{
		if(this.selectItem5.isSelected())
		{	this.total = this.total+10;	this.calories = this.calories+70;  this.time=this.time+15;	}
		else
		{	this.total = this.total-10;	this.calories = this.calories-70;   this.time=this.time-15;	}
	}
	if(command.equals("Pasta"))
	{
		if(this.selectItem6.isSelected())
		{	this.total = this.total+11;	this.calories = this.calories+90;	this.time=this.time+15;}
		else
		{	this.total = this.total-11;	this.calories = this.calories-90;	this.time=this.time-15;}
	}
	
	
	String totalString = "Total: $ " + String.valueOf(total) ;
	String caltotal = String.valueOf(calories) + " cal";
	
	if(this.total==0 )
		totalString = "  Total ";
	if(this.calories==0)
		caltotal = "";
	
	if(this.time > 0)
	{
		totalString = totalString + "  " + this.time + "mins";
	}
	this.totalLabel.setText(totalString);	
	this.calLabel.setText(caltotal);
}
/**
* Clears all the selected checkboxes in the Cafe*/ 
public void clear()
{
	this.selectItem1.setSelected(false);	this.selectItem2.setSelected(false);
	this.selectItem3.setSelected(false);	this.selectItem4.setSelected(false);
	this.selectItem5.setSelected(false);	this.selectItem6.setSelected(false);
	this.toGo.setSelected(false);			this.eatIn.setSelected(false);
	
}

}