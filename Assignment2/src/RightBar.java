import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


public class RightBar extends JPanel {
	private RightBarTop rightbartop;
	private RightBarBottom rightbarbottom;
	
	public RightBar()
	{
		rightbartop = new RightBarTop();
		rightbarbottom = new RightBarBottom();
		
		setLayout(new BorderLayout());
		
		rightbartop.setBackground(new Color(255,255, 255));
		rightbartop.setPreferredSize(new Dimension(650, 260));
		
		rightbarbottom.setBackground(new Color(255, 255, 255));

		add(rightbartop, BorderLayout.NORTH);
		add(rightbarbottom, BorderLayout.CENTER);
		
	}
	
	public void setStringListener(StringListener listener)
	{
		rightbarbottom.setStringListener(listener);
	}
	
	public void startCounter(int time, String ovenstatus)
	{
		rightbartop.startCounter(time, ovenstatus);
	}
	
	public void putError(String error)
	{
		rightbartop.putError(error);
	}
}
