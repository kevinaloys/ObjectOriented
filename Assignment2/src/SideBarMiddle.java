import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;


public class SideBarMiddle extends JPanel {
	private DataWindow datawindow;
	private DisplayWindow displaywindow;
	
	public SideBarMiddle()
	{	
		datawindow = new DataWindow();
		displaywindow = new DisplayWindow();
		
		setLayout(new BorderLayout());
		
		
		
		displaywindow.setPreferredSize(new Dimension(250, 350));
		displaywindow.setBackground(new Color(55, 54, 86));
		
		datawindow.setPreferredSize(new Dimension(250, 420));
		datawindow.setBackground(new Color(55, 54, 86));
		
		add(datawindow, BorderLayout.NORTH);
		add(displaywindow, BorderLayout.SOUTH);
		
	}
}
