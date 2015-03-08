package com.campuscafe.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DisplayBottomMenu extends JPanel
{
 private CardLayout cardLayout;
 private JLabel status;
 
 private VendingMachine vmObject;
 private Cafe cafeObject;
 
 private Funds funds;
 private ViewFunds viewFunds;
 private Diet diet;
 private ViewDiet viewDiet;
 
 private StatusPanel statusPanel;

 /**Bottom canteen / VM display panel*/
 public DisplayBottomMenu(StatusPanel statusPanel)
 {
	 MainLeftPanel panel = null;
	 String userID = panel.userID;
	 
	 this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	 status = new JLabel(" 			");
	 this.statusPanel = statusPanel;
	 //Cards within the left layout.	 
	 vmObject = new VendingMachine(userID,statusPanel);
	 cafeObject = new Cafe(userID,statusPanel);
	 
	 //Cards within the right layout.
	 funds = new Funds(userID,statusPanel);
	 viewFunds = funds.getViewFunds();
	 diet = new Diet(userID,statusPanel);
	 viewDiet = diet.getViewDiet();
	 
	 //cardlayout created
	 cardLayout = new CardLayout();
	 this.setLayout(cardLayout);
	 
	 //cards added
	 add(status , "displayMenu");	
	 
	 add(vmObject, "VM");
	 add(cafeObject, "Cafes");
	 add(funds, "addFunds");
	 add(viewFunds, "viewFunds");
	 add(diet, "addDiet");	 
	 add(viewDiet,"viewDiet");
	
	 //default card
	 cardLayout.show(this, "displayMenu");
 }
 /**
  * Switch between canteen /user menu cards*/
 public void showMenu(String option)
 {
	 this.clear();
	 cardLayout.show(this, option);
 }
 /**
  * Sets the display panel below to the default card*/
 public void clear()
 {
	 cardLayout.show(this, "displayMenu");
 }
 /**
  * Resets the cafe menu checkboxes*/
 public void reset()
 {
	 this.cafeObject.clear();
	 this.vmObject.clear();
 }
 /***/
 public StatusPanel returnStatusPanel()
 {
	return this.statusPanel;
 }
 
}
