import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


public class RightBar extends JPanel {
	private RightBarTop rightbartop;
	private RightBarBottom rightbarbottom;
	private RightMessageBar rightmessagebar;
	
	public RightBar()
	{
		rightbartop = new RightBarTop();
		rightbarbottom = new RightBarBottom();
		rightmessagebar = new RightMessageBar();
		
		setLayout(new BorderLayout());
		
		rightbartop.setBackground(new Color(255,255, 255));
		rightbartop.setPreferredSize(new Dimension(650, 250));
		
		rightbarbottom.setBackground(new Color(255, 255, 255));
		rightmessagebar.setPreferredSize(new Dimension(250, 70));
		rightmessagebar.setBackground(new Color(201, 66, 52));
		add(rightbartop, BorderLayout.NORTH);
		add(rightbarbottom, BorderLayout.CENTER);
		add(rightmessagebar, BorderLayout.SOUTH);
		
	}
	
	public void setStringListener(StringListener listener)
	{
		rightbarbottom.setStringListener(listener);
	}
	
	public void setDataListener(DataListener listener)
	{
		rightbarbottom.setDataListener(listener);
	}
	
}
