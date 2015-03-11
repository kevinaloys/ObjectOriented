package com.campuscafe.implementation;
import java.net.UnknownHostException;
import com.campuscafe.chart.*;
/**
 * 
 * @author Kevin Aloysius
 *
 */

public class Main {
	public static void main(String[] args) throws UnknownHostException
	{
		new Thread() {
            @Override
            public void run() {
                javafx.application.Application.launch(CaloriesBarGraph.class);
            }
        }.start();
		CaloriesBarGraph caloriesbargraph = CaloriesBarGraph.setUserid(1);
		
		
	}
}
