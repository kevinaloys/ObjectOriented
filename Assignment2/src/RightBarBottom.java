import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class RightBarBottom extends JPanel implements ActionListener {
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, place, start, point;
    
	private StringListener textListener;
	private DataListener dataListener;
	
	public RightBarBottom()
	{
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");		
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8"); 
		nine = new JButton("9");
		zero = new JButton("0");
		place = new JButton("Place");
		start = new JButton("Start");
		
		one.setPreferredSize(new Dimension(100,100));
		two.setPreferredSize(new Dimension(100,100));
		three.setPreferredSize(new Dimension(100,100));
		four.setPreferredSize(new Dimension(100,100));
		five.setPreferredSize(new Dimension(100,100));
		six.setPreferredSize(new Dimension(100,100));
		seven.setPreferredSize(new Dimension(100,100));
		eight.setPreferredSize(new Dimension(100,100));
		nine.setPreferredSize(new Dimension(100,100));
		zero.setPreferredSize(new Dimension(100,100));
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		place.addActionListener(this);
		start.addActionListener(this);
		
		one.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		two.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		three.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		four.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		five.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		six.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		seven.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		eight.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		nine.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		zero.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		place.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		start.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 30));
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(one, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(two, gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(three, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(four, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(five, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(six, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(seven, gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(eight, gc);
		
		gc.gridx = 2;
		gc.gridy = 2;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(nine, gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(zero, gc);
		
		gc.gridx = 0;
		gc.gridy = 5;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(place, gc);
		
		gc.gridx = 2;
		gc.gridy = 5;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(start, gc);
		
		
	}
	
	public void setStringListener(StringListener listener)
	{
		this.textListener = listener;
	}
	
	public void setDataListener(DataListener listener)
	{
		this.dataListener = listener;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == one)
		{
			if(textListener != null)
			{
				textListener.textEmitted("1");
			}
		}
		else if (clicked == two)
		{
			if(textListener != null)
			{
				textListener.textEmitted("2");
			}
		}
		else if (clicked == three)
		{
			if(textListener != null)
			{
				textListener.textEmitted("3");
			}
		}
		else if (clicked == four)
		{
			if(textListener != null)
			{
				textListener.textEmitted("4");
			}
		}
		else if (clicked == five)
		{
			if(textListener != null)
			{
				textListener.textEmitted("5");
			}
		}
		else if (clicked == six)
		{
			if(textListener != null)
			{
				textListener.textEmitted("6");
			}
		}
		else if (clicked == seven)
		{
			if(textListener != null)
			{
				textListener.textEmitted("7");
			}
		}
		else if (clicked == eight)
		{
			if(textListener != null)
			{
				textListener.textEmitted("8");
			}
		}
		else if (clicked == nine)
		{
			if(textListener != null)
			{
				textListener.textEmitted("9");
			}
		}
		else if (clicked == zero)
		{
			if(textListener != null)
			{
				textListener.textEmitted("0");
			}
			
		}
		else if (clicked == place)
		{
			if(textListener != null)
			{
				textListener.placed("placed");
			}
		}
		else if (clicked == start)
		{
			if(textListener != null)
			{
				textListener.start("start");
				
			}
		}
	}
}
