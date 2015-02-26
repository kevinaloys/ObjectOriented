import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class RightMessageBar extends JPanel {
	private JLabel message;
	private Border whiteBorder;
	
	private DataListener datalistener;
	
	public RightMessageBar()
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
	
	public void setDataListener(DataListener listener)
	{
		this.datalistener = listener;
	}
}