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
	private JLabel message;
	private Border whiteBorder;
	
	public SideBarBottom()
	{
		message = new JLabel("Oven Message");
		message.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		message.setForeground(Color.white);
/*		whiteBorder = BorderFactory.createLineBorder(Color.WHITE);
		bake.setBorder(whiteBorder);*/
/*		bake.setPreferredSize(new Dimension(100,35));
		broil.setPreferredSize(new Dimension(100, 35));
		bake.setLocation(200, 15);
		setLayout(new FlowLayout());*/
		add(message, BorderLayout.CENTER);
	}
}
