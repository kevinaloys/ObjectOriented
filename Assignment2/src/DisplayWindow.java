import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DisplayWindow extends JPanel {
	JLabel fahrenheit;
	JLabel celsius;
	JLabel displayFahrenheit;
	JLabel displayCelsius;
	
	public DisplayWindow()
	{
		fahrenheit = new JLabel("Fahrenheit");
		celsius = new JLabel("Celsuis");
		displayFahrenheit = new JLabel("300 \u00b0F");
		displayCelsius = new JLabel("148.88 \u00b0C");
		fahrenheit.setForeground(new Color(185,188,209));
		celsius.setForeground(new Color(185,188,209));
		displayFahrenheit.setForeground(new Color(185,188,209));
		displayCelsius.setForeground(new Color(185,188,209));
		fahrenheit.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		celsius.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		displayFahrenheit.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 35));
		displayCelsius.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 35));
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		GridBagConstraints f = new GridBagConstraints();
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(fahrenheit, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(5, 0, 0, 0);
		add(displayFahrenheit, gc);
		
		f.gridx = 0;
		f.gridy = 2;
		f.weightx = 0;
		f.weighty = 0;
		f.fill = GridBagConstraints.NONE;
		f.insets = new Insets(5,0,0,0);
		add(celsius, f);
		
		
		f.gridx = 0;
		f.gridy = 3;
		f.weightx = 0;
		f.weighty = 0;
		f.fill = GridBagConstraints.NONE;
		add(displayCelsius, f);
	}
}
