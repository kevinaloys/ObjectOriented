package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class SwitchUserMenu extends JPanel implements ActionListener
{
private String[] funds = { "AddFunds", "ViewFunds"};
private String[] diet = { "ModifyDiet", "Viewdiet"};
private JComboBox fundsBox;
private JComboBox dietBox;

private int dietIndex=2;
private int fundIndex=2;

private DisplayBottomMenu menuDisplay;

public SwitchUserMenu(StatusPanel statusPanel)
{
	fundsBox = new JComboBox(funds);
	fundsBox.setFont(new Font("Calibri", Font.BOLD, 18));
	dietBox = new JComboBox(diet);
	dietBox.setFont(new Font("Calibri", Font.BOLD, 18));
	
	menuDisplay = new DisplayBottomMenu(statusPanel);
	
	setButtonProperties();
	setLayout();	
}
/***/
private void setLayout()
{
	this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	add(fundsBox);
	add(dietBox);
}
/***/
private void setButtonProperties()
{
	this.fundsBox.addActionListener(this);
	this.fundsBox.setActionCommand("funds");
	
	this.dietBox.addActionListener(this);
	this.dietBox.setActionCommand("diet");
}
/**
@Override */
public void actionPerformed(ActionEvent event) 
{
	String command = event.getActionCommand();
	
	if(command.equals("funds"))
	{
		if(fundsBox.getSelectedIndex() == 0)
		command = "addFunds";
		
		if(fundsBox.getSelectedIndex() == 1)
		command = "viewFunds";
	}
	if(command.equals("diet"))
	{
		if(dietBox.getSelectedIndex() == 0)
		command = "addDiet";
		
		if(dietBox.getSelectedIndex() == 1)
		command = "viewDiet";
	}
	
	if(this.dietIndex != this.dietBox.getSelectedIndex())
		this.menuDisplay.reset();
	
	if(this.fundIndex != this.fundsBox.getSelectedIndex())
		this.menuDisplay.reset();	
	
	this.menuDisplay.showMenu(command);
}
/**
 * @return menuDisplay*/
public DisplayBottomMenu getDisplayMenu()
{
	return this.menuDisplay;
}


}