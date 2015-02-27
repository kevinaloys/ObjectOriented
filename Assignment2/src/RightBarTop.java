import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RightBarTop extends JPanel{
   
   private JLabel displayBtn;
   private JLabel displayField;
   private Timer timer;
   Integer count = 0;
 
   public RightBarTop(){
      
        
	  // create a textfield
	  displayField = new JLabel();	 
      // create buttons
      displayBtn = new JLabel("Oven Status " + "Off");
      displayField.setFont(Utils.createFont("/fonts/Ubuntu-B.ttf").deriveFont(Font.BOLD, 150));
      displayBtn.setFont(Utils.createFont("/fonts/Ubuntu-B.ttf").deriveFont(Font.BOLD, 40));
      setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		add(displayField, gc);
		
		gc.gridx = 0;
		gc.gridy = 25;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.insets = new Insets(40,0,0,0);
		add(displayBtn, gc);   
   }
   
   public void startCounter(final int time, final String ovenstatus)
   {
	// add event handlers to the button
	      ActionListener taskPerformer = new ActionListener (){
	    	  public void actionPerformed(ActionEvent e)
	    	  {
	    		if (count.intValue() >= time)
	    		{
	    	      timer.stop();	    		  
	    		}
	    		  displayField.setText(count.toString());   		 
	    		  count = count + 1;
	    		  if(count.intValue() == (time-1 + 2))
	    		  {
	    			  displayBtn.setText("Food is ready"); 
	    		  }
	    		  else
	    		  {
	    			  displayBtn.setText("Oven Status " + ovenstatus);
	    			  
	    		  }
	    		     		  
	    	  }
	    	  
	    	  
	      };
	      // add the task to the timer
	      timer = new Timer(1000,taskPerformer);
	      timer.start();
   }
}

