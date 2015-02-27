import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * 
 * @author Kevin Aloysius
 *
 */

public class SideBarMiddle extends JPanel {
	private DataWindow datawindow;
	private DisplayWindow displaywindow;
	private DataListener datalistener;
	private SideBar sidebar;
	public SideBarMiddle()
	{	 
		datawindow = new DataWindow();
		displaywindow = new DisplayWindow();
		
		setLayout(new BorderLayout());
		
		displaywindow.setPreferredSize(new Dimension(250, 400));
		displaywindow.setBackground(new Color(55, 54, 86));
		
		datawindow.setPreferredSize(new Dimension(250, 500));
		datawindow.setBackground(new Color(55, 54, 86));
		
		add(datawindow, BorderLayout.NORTH);
		add(displaywindow, BorderLayout.SOUTH);
			
		
	}
	
	public void appendTemperatureField(String number)
	{
		datawindow.appendTemperatureField(number);
	}
	
	public void setDataListener(DataListener listener)
	{
		datawindow.setDataListener(listener);
	}
	
	public String getCurrentTemperature()
	{
		return datawindow.getCurrentTemperature();
	}
}
