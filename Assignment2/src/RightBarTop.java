/*import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Date;
import java.text.DateFormat;

public class RightBarTop extends JPanel {
	private JLabel systemdate;
	private JLabel timeRemaining;
	private JLabel systemtime;
	
	private static String getDate()
	{
		Date date = new Date();
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.FULL);
		String datestring = dateformat.format(date);
		return datestring;
	}
	
	
	public RightBarTop()
	{
		systemdate = new JLabel(getDate());
		timeRemaining = new JLabel("42");
		
		systemdate.setFont(Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 40));
		timeRemaining.setFont(Utils.createFont("/fonts/Ubuntu-B.ttf").deriveFont(Font.BOLD, 150));
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(40,0,0,0);
		add(systemdate, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(timeRemaining, gc);
		
	}
	
	
}
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RightBarTop extends JPanel{
   
   private JButton displayBtn;
   private JLabel displayField;
   private Timer timer;
   Integer count = 0;
 
   public RightBarTop(){
      
        
	  // create a textfield
	  displayField = new JLabel();	 
      // create buttons
      displayBtn = new JButton( "Display Count" );
      displayField.setFont(Utils.createFont("/fonts/Ubuntu-B.ttf").deriveFont(Font.BOLD, 150));
      setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.insets = new Insets(40,0,0,0);
		add(displayField, gc); 
    
     
       startCounter(20);
   }
   
   public void startCounter(final int time)
   {
	// add event handlers to the button
	      ActionListener taskPerformer = new ActionListener (){
	    	  public void actionPerformed(ActionEvent e){
	    		if (count.intValue() >= time)  timer.stop();  		
	    		  displayField.setText(count.toString());   		 
	    		  count = count + 1;
	    	  }
	      };
	      // add the task to the timer
	      timer = new Timer(1000,taskPerformer);
	      timer.start();
   }
}

