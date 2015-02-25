import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * 
 * @author Kevin Aloysius
 *
 */

public class SideBar extends JPanel {
	
	private SideBarTop sidebartop;
	private SideBarMiddle sidebarmiddle;
	
	public SideBar()
	{
		//Initialize components
		sidebartop = new SideBarTop();
		sidebarmiddle = new SideBarMiddle();
		
		setLayout(new BorderLayout());
		
		//Add Size and Background
		sidebartop.setPreferredSize(new Dimension(250, 90));
		sidebartop.setBackground(new Color(219, 221, 222));
				
		//Add components
		add(sidebartop, BorderLayout.NORTH);
		add(sidebarmiddle, BorderLayout.CENTER);
	}
	
	public void appendTemperatureField(String number)
	{
		sidebarmiddle.appendTemperatureField(number);
	}
	
	public void setDataListener(DataListener listener)
	{
		sidebartop.setDataListener(listener);
		sidebarmiddle.setDataListener(listener);
	}
	
	public String getCurrentTemperature()
	{
		return sidebarmiddle.getCurrentTemperature();
	}
}
