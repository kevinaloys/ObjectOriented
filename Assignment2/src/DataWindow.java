import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
 * 
 * @author Kevin Aloysius
 *
 */

public class DataWindow extends JPanel {
	private JLabel temperature;
	private JLabel time;
	private JTextField temperatureField;
	private JTextField timeField;
	private JRadioButton fahrenheit;
	private JRadioButton celsius;
	
	public DataWindow()
	{
		Border inner;
		Font myUbuntuFont;
		myUbuntuFont = Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 20);
		inner = BorderFactory.createTitledBorder(null,"Set", 0, 0, myUbuntuFont, new Color(185,188,209));
		Border outer = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		setBorder(BorderFactory.createCompoundBorder(outer, inner));
		
		
		temperature = new JLabel("Temperature");
		time = new JLabel("Time");
		fahrenheit = new JRadioButton("Fahrenheit");
		celsius = new JRadioButton("Celsius");
		temperatureField = new JTextField();
		timeField = new JTextField();
		
		temperature.setHorizontalAlignment(JLabel.CENTER);
		time.setHorizontalAlignment(JLabel.CENTER);
		
		temperatureField.setPreferredSize(new Dimension(250, 50));
		timeField.setPreferredSize(new Dimension(250, 50));
		
		
		temperatureField.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		timeField.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		time.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		celsius.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		fahrenheit.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		temperature.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		time.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		
		temperature.setForeground(new Color(185, 188, 209));
		time.setForeground(new Color(185, 188, 209));
		fahrenheit.setForeground(new Color(185, 188, 209));
		celsius.setForeground(new Color(185, 188, 209));
		
		ButtonGroup group = new ButtonGroup();
		group.add(fahrenheit);
		group.add(celsius);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(temperature, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		add(temperatureField, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(10,0,0,0);
		add(time, gc);
		
		gc.gridx = 0;
		gc.gridy = 3;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		add(timeField, gc);
		
		
		gc.gridx = 0;
		gc.gridy = 4;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(fahrenheit, gc);
		
		gc.gridx = 0;
		gc.gridy = 5;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(celsius, gc);
		
	}
}
