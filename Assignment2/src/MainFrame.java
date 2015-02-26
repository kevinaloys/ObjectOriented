import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * 
 * @author Kevin Aloysius
 *
 */
public class MainFrame extends JFrame{

	private SideBar sidebar;
	private RightBar rightbar;
	
	private int timeInMinutes;
	private String tempUnits;
	private String temperature;
	private boolean placed;
	private boolean start;
	private String ovenstatus;
	private App app;
	
	public MainFrame()
	{
		super("Alpha2Oven");
		try { 
/*			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");*/
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		//Initialize Components
		setLayout(new BorderLayout());
		sidebar = new SideBar();
		rightbar = new RightBar();
		sidebar.setPreferredSize(new Dimension(300, 700));
		rightbar.setBackground(Color.red);
		
		//Adding Components
		add(sidebar, BorderLayout.WEST);
		add(rightbar, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(950, 900);
		
		app = new App();
		
		
		//Listener for Keypad events
		rightbar.setStringListener(new StringListener()
		{
			//Receiving Events from RigtBarBottom for
			//Button Events from the OvenKeyPad
			//
			public void textEmitted(String text) {
				appendTemperatureField(text);
			}
			
			public void placed(String text)
			{
				if(text == "placed")
				{
					placed = true;
				}
			}
			
			public void start(String text)
			{
				if(text == "start")
				{
					app.setPlaced(getPlaced());
					app.setTempUnits(tempUnits);
					app.setTemperature(getCurrentTemperature());
					app.setTime(timeInMinutes);
					app.start();
					
				}
			}
		});
		
		
		sidebar.setDataListener(new DataListener()
		{
			public void time(int time)
			{
				timeInMinutes = time;
			}
			
			public void temperatureIn(String tempUnit)
			{
				tempUnits = tempUnit;
			}
			
		});		
		
		
	}
	
	
	
	
	//Responsible for appending the Temperature in JTextField of
	//temperature field in DataWindow
	public void appendTemperatureField(String number)
	{
		sidebar.appendTemperatureField(number);
	}
	
	private String getCurrentTemperature()
	{
		return sidebar.getCurrentTemperature();
	}
	
	public int getTime()
	{
		return timeInMinutes;
	}
	
	public String getTempUnits()
	{
		return tempUnits;
	}
	
	public String getTemperature()
	{
		temperature = getCurrentTemperature();
		return temperature;
	}
	
	public boolean getPlaced()
	{
		return placed;
	}
	
	public void setOvenStatus()
	{
		ovenstatus = app.getStatus();
	}
	
}
