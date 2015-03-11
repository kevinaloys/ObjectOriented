package com.campuscafe.gui;

import java.awt.event.*;

public class MouseAdapterClass extends MouseAdapter
{
	// coordinates in the map
	private int x;
	private int y;
	
	private MapPanel map;

	public MouseAdapterClass(MapPanel mapObject)
	{
		this.x = 0;
		this.y = 0;
		
		this.map = mapObject;
	}
	public void mouseClicked(MouseEvent event)
	{
		this.x = event.getX();
		this.y = event.getY();
		
		//
	}
}
