package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwitchCanteenMenu extends JPanel implements ActionListener
{
private String[] Cafes = { "Benson Center", "Learning Commons Library", "Malley Center", "Leavey Center"};
private String[] vendingMachines = { "Kenna Vending Machine", "Sanfillipo Residence Hall", "LabVM", "BookStoreVM"};

private JComboBox cafeCombo;
private int cafeIndex=4;	private int vmIndex=4;
private JComboBox vendingMachine;

private DisplayBottomMenu menuDisplay;

public SwitchCanteenMenu(StatusPanel statusPanel)
{
	cafeCombo = new JComboBox(Cafes);
	cafeCombo.setFont(new Font("Calibri", Font.BOLD, 18));
	vendingMachine = new JComboBox(vendingMachines);
	vendingMachine.setFont(new Font("Calibri", Font.BOLD, 18));
	
	menuDisplay = new DisplayBottomMenu(statusPanel);
	
	setButtonProperties();
	setLayout();	
}
/***/
private void setLayout()
{
	this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	add(cafeCombo);
	add(vendingMachine);
}
private void setButtonProperties()
{
	this.vendingMachine.addActionListener(this);
	this.vendingMachine.setActionCommand("VM");
	
	this.cafeCombo.addActionListener(this);
	this.cafeCombo.setActionCommand("Cafes");
}
/**
@Override */
public void actionPerformed(ActionEvent event) 
{
	String command = event.getActionCommand();
	
	if(this.cafeIndex != this.cafeCombo.getSelectedIndex())
		this.menuDisplay.reset();
	
	if(this.vmIndex != this.vendingMachine.getSelectedIndex())
		this.menuDisplay.reset();
	
	
	this.menuDisplay.showMenu(command);
}
/**
 * @return menuDisplay*/
public DisplayBottomMenu getDisplayMenu()
{
	return this.menuDisplay;
}
/**Changes the cafe from the map*/
public void setCafeIndex(int index)
{
	this.menuDisplay.reset();
	this.cafeCombo.setSelectedIndex(index);
}
/**changes the vending machine from the map*/
public void setVMIndex(int index)
{
	this.menuDisplay.reset();
	this.vendingMachine.setSelectedIndex(index);	
}

}
