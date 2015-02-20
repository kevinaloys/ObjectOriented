import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class RightBarTop extends JPanel {
	private JLabel systemtime;
	private JLabel timeRemaining;
	public RightBarTop()
	{
		systemtime = new JLabel("Feb, Thursday 18, 2015");
		timeRemaining = new JLabel("55");
		
		systemtime.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 40));
		timeRemaining.setFont(Utils.createFont("/fonts/Ubuntu-B.ttf").deriveFont(Font.BOLD, 35));
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		
		add(systemtime, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(timeRemaining, gc);
		
	}
}
