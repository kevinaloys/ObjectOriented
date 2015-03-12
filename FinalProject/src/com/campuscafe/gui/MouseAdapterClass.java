package com.campuscafe.gui;

import java.awt.event.*;

/**
 * @author Varada*/
public class MouseAdapterClass extends MouseAdapter
{
	// coordinates in the map
	private int x;
	private int y;
	
	private MapPanel map;

	/**The mouse adapter takes a MapPanel object and when a mouse event occurs on the map,
	 * notifies the map the coordinates of map click*/
	public MouseAdapterClass(MapPanel mapObject)
	{
		this.x = 0;
		this.y = 0;
		
		this.map = mapObject;
	}
	/**When a user clicks a map cafe or vending machine icon coordinates of the event are
	 * passed to MapPanel class to handle*/
	public void mouseClicked(MouseEvent event)
	{
		this.x = event.getX();
		this.y = event.getY();
		
		this.map.ModifyCanteenDisplay(this.x, this.y);
	}
}// End MouseAdapterclass
