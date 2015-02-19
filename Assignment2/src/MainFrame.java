import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainFrame extends JFrame{
	

	private SideBar sidebar;
	
	public MainFrame()
	{
		super("Alpha2Oven");
		try { 
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		    /*UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());*/
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		//Initialize Components
		setLayout(new BorderLayout());
		sidebar = new SideBar();
		sidebar.setPreferredSize(new Dimension(300, 700));
			
		//Adding Components
		add(sidebar, BorderLayout.WEST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(950, 900);
		
		
	}
}
