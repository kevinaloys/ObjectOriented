import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class MainFrame extends JFrame{
	
	private JTextArea textArea;
	private JButton button;
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
		textArea = new JTextArea();
		sidebar = new SideBar();
		sidebar.setPreferredSize(new Dimension(250, 600));
			
		//Adding Components
		add(sidebar, BorderLayout.WEST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(700, 550);
	}
}
