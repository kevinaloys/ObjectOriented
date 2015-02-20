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
		rightbar = new RightBar();
		sidebar.setPreferredSize(new Dimension(300, 700));
		rightbar.setBackground(Color.red);	
		//Adding Components
		add(sidebar, BorderLayout.WEST);
		add(rightbar, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(950, 900);

	}
}
