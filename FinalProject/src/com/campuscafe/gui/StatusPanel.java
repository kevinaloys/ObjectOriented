package com.campuscafe.gui;

import com.campuscafe.implementation.*;

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
		this.setBackground(new Color(55, 54, 86));
	display = new JLabel(status);
	display.setFont(Utils.createFont("/res/Ubuntu-L.ttf").deriveFont(Font.BOLD, 25));
	display.setForeground(Color.white);
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
