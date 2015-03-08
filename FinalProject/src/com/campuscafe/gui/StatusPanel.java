package com.campuscafe.gui;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.*;

public class StatusPanel extends JPanel
{
	private JLabel display;
	private String status;

	public StatusPanel()
	{
	display = new JLabel(status);
	display.setFont(new Font("Calibri",Font.BOLD,22));
	display.setHorizontalAlignment(JLabel.CENTER);
	setLayout();
	}
	/***/
	private void setLayout()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(Box.createRigidArea(new Dimension(0,60)));
		add(display);
	}
	/***/
	public void setDisplay(String statusString)
	{
		statusString = statusString.replace("\n","<br>");
		statusString = "<html>" + statusString + "</html>";
		this.display.setText(statusString);
	}

}
