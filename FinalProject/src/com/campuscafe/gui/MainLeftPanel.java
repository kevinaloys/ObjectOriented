package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.*;


import com.campuscafe.chart.CaloriesBarGraph;
import com.campuscafe.chart.ExpensesBarGraph;

/**
 * @author Varada*/
public class MainLeftPanel extends JPanel implements ActionListener
{
	private JLabel logo;
	private JLabel currentTime;
	
	private JButton viewGraph;
	private GraphType graphType;
	//	Center and Bottom Panels
	private CenterPanel centerPanel;	
	private MainBottomPanel bottomPanel;
	//Status pane
	private StatusPanel displayPanel;
	public static String userID;
	/***/
	public MainLeftPanel(String uid)
	{
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) 
		{
		    e.printStackTrace();
		}
		this.userID = uid;
		this.setBackground(new Color(55, 54, 86));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		//Canteen icon/(logo)
		ImageIcon icon = new ImageIcon("C:/Users/Varada/CampusCafe/Canteen/res/icon.jpg");
		logo = new JLabel(icon);
		//current date
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		//MainPanel components	
		this.currentTime = new JLabel(dateFormat.format(date));		
		
		
		
		this.viewGraph = new JButton("View Graph");			
		this.graphType = new GraphType();		
		
		//Create Center and bottom panels		
		this.centerPanel = new CenterPanel();
		this.bottomPanel = this.centerPanel.getBottomMenu();
		this.displayPanel = this.centerPanel.getStatusPanel();
		
		//Set properties for the components in the panel
		setComponentProperties();
		
		setBoxLayout();
	}	
	/***/
	public void setBoxLayout()
	{	 
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0,30)));
		add(logo);
		add(Box.createRigidArea(new Dimension(0,40)));
		add(currentTime);
			
		add(Box.createRigidArea(new Dimension(0,40)));	
		add(viewGraph);
		add(Box.createRigidArea(new Dimension(0,60)));
		add(graphType);
		add(Box.createRigidArea(new Dimension(0,100)));
		add(displayPanel);
	}
	/***/
	public void setComponentProperties()
	{
		Font font = new Font("Calibri",Font.BOLD, 22);
		
		logo.setAlignmentX(CENTER_ALIGNMENT);
		currentTime.setFont(new Font("Calibri",Font.BOLD, 20));
		currentTime.setAlignmentX(CENTER_ALIGNMENT);
		currentTime.setForeground(Color.white);
		viewGraph.setAlignmentX(CENTER_ALIGNMENT);
		viewGraph.setFont(font);
		viewGraph.setActionCommand("graph");
		viewGraph.addActionListener(this);
	}
	/***/
	public CenterPanel getDisplay()
	{
		return this.centerPanel;
	}
	/***/
	public MainBottomPanel getBottomPanel()
	{
		return this.bottomPanel;
	}
	/**
	@Override */
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getActionCommand() == "graph")
		{
			if(this.graphType.getDietButton().isSelected())
			{
						new Thread() {
						@Override
						public void run() {
						javafx.application.Application.launch(CaloriesBarGraph.class);
						}
						}.start();
						int user = Integer.parseInt(userID);
						CaloriesBarGraph bargraph = CaloriesBarGraph.setUserid(user);
			}
			if(this.graphType.getExpenseButton().isSelected())
			{
					new Thread() {
					@Override
					public void run() {
					javafx.application.Application.launch(ExpensesBarGraph.class);
					}
					}.start();
					int user = Integer.parseInt(userID);
					ExpensesBarGraph expensesbargraph = ExpensesBarGraph.setUserId(user);
			}
		}
	}
}
