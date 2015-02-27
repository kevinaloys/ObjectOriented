import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 
 * @author Kevin Aloysius
 *
 */
public class DisplayWindow extends JPanel {
	private JLabel fahrenheit;
	private JLabel celsius;
	private JLabel displayFahrenheit;
	private JLabel displayCelsius;
	private JRadioButton optionFahrenheit;
	private JRadioButton optionCelsius;
	int fah;
	int cel;
	public DisplayWindow()
	{
		fahrenheit = new JLabel("Fahrenheit");
		celsius = new JLabel("Celsius");
		
		displayFahrenheit = new JLabel("");
		displayCelsius = new JLabel(" \u00b0C");
		
		
		optionFahrenheit = new JRadioButton("Fahreneheit");
		optionCelsius = new JRadioButton("Celsuis");
		
		fahrenheit.setForeground(new Color(185,188,209));
		celsius.setForeground(new Color(185,188,209));
		displayFahrenheit.setForeground(new Color(185,188,209));
		displayCelsius.setForeground(new Color(185,188,209));
		optionFahrenheit.setForeground(new Color(185, 188 ,209));
		optionCelsius.setForeground(new Color(185, 188, 209));
		
		fahrenheit.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		celsius.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		displayFahrenheit.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 35));
		displayCelsius.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 35));
		optionFahrenheit.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 25));
		optionCelsius.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 25));
		
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
		
		f.gridx = 0;
		f.gridy = 4;
		f.weightx = 0;
		f.weighty = 0;
		f.fill = GridBagConstraints.NONE;
		add(optionFahrenheit, f);
		
		f.gridx = 0;
		f.gridy = 5;
		f.weightx = 0;
		f.weighty = 0;
		f.fill = GridBagConstraints.NONE;
		add(optionCelsius, f);
		
		optionFahrenheit.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e) {
				JRadioButton clicked = (JRadioButton)e.getSource();
				{
					if(clicked.isSelected())
					{
						displayFahrenheit.setVisible(true);
						displayFahrenheit.setText(fah +  " \u00b0F");
						
					}
					else if(!clicked.isSelected())
					{
						displayFahrenheit.setVisible(false);
					}
					
				}
			}
		});
		
		optionCelsius.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				JRadioButton clicked = (JRadioButton)e.getSource();
				{
					if(clicked.isSelected())
					{
						displayCelsius.setVisible(true);
						displayCelsius.setText(cel + " \u00b0C");
					}
					else if(!clicked.isSelected())
					{
						displayCelsius.setVisible(false);
					}
					
					
				}
				
			}
			
		});
		
	}
	
	public void appendFahrenheit(int fah)
	{
		this.fah = fah;
	}
	
	public void appendCelsius(int cel)
	{
		this.cel = cel;
	}
}
