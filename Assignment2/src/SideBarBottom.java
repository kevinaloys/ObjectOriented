import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class SideBarBottom extends JPanel {
	private JButton bake;
	private JButton broil;
	private Border whiteBorder;
	
	public SideBarBottom()
	{
		bake = new JButton("BAKE");
		broil = new JButton("BROIL");
/*		whiteBorder = BorderFactory.createLineBorder(Color.WHITE);
		bake.setBorder(whiteBorder);*/
		bake.setPreferredSize(new Dimension(100,35));
		broil.setPreferredSize(new Dimension(100, 35));
		bake.setLocation(200, 15);
		setLayout(new FlowLayout());
		add(bake, BorderLayout.CENTER);
		add(broil, BorderLayout.CENTER);
	}
}
