import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Date;
import java.text.DateFormat;

public class RightBarTop extends JPanel {
	private JLabel systemtime;
	private JLabel timeRemaining;
	
	private static String getDate()
	{
		Date date = new Date();
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.FULL);
		String datestring = dateformat.format(date);
		return datestring;
	}
	public RightBarTop()
	{
		systemtime = new JLabel(getDate());
		timeRemaining = new JLabel("42");
		
		systemtime.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 40));
		timeRemaining.setFont(Utils.createFont("/fonts/Ubuntu-B.ttf").deriveFont(Font.BOLD, 150));
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(40,0,0,0);
		add(systemtime, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(timeRemaining, gc);
		
	}
}
