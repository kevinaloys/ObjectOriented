import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class SideBar extends JPanel {
	
	private SideBarTop sidebartop;
	private SideBarMiddle sidebarmiddle;
	private SideBarBottom sidebarbottom;
	
	public SideBar()
	{
		//Initialize components
		sidebartop = new SideBarTop();
		sidebarmiddle = new SideBarMiddle();
		sidebarbottom = new SideBarBottom();
		
		setLayout(new BorderLayout());
		
		//Add Size and Background
		sidebartop.setPreferredSize(new Dimension(250, 90));
		sidebartop.setBackground(new Color(219, 221, 222));

		sidebarbottom.setPreferredSize(new Dimension(250, 70));
		sidebarbottom.setBackground(new Color(201, 66, 52));
				
		//Add components
		add(sidebartop, BorderLayout.NORTH);
		add(sidebarmiddle, BorderLayout.CENTER);
		add(sidebarbottom, BorderLayout.SOUTH);
	}
}
