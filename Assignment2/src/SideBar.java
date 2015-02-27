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
	
	private SideBarMiddle sidebarmiddle;
	
	public SideBar()
	{
		//Initialize components
		sidebarmiddle = new SideBarMiddle();
		setLayout(new BorderLayout());
		//Add Size and Background
		add(sidebarmiddle, BorderLayout.CENTER);
	}
	
	public void appendTemperatureField(String number)
	{
		sidebarmiddle.appendTemperatureField(number);
	}
	
	public void setDataListener(DataListener listener)
	{
		sidebarmiddle.setDataListener(listener);
	}
	
	public String getCurrentTemperature()
	{
		return sidebarmiddle.getCurrentTemperature();
	}
	
	public void appendFahrenheit(int fah)
	{
		sidebarmiddle.appendFahrenheit(fah);
	}
	
	public void appendCelsius(int cel)
	{
		sidebarmiddle.appendCelsius(cel);
	}
}
