package com.campuscafe.chart;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import com.campuscafe.implementation.*;


/**
 * 
 * @author Kevin Aloysius
 *
 */
public class ExpensesBarGraph extends Application {
	private String[] months = {"January", "February","March",
			"April","May", "June", "July", "August",
			"September", "October", "November", "December"};
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private static int userid;
	public static ExpensesBarGraph expensesbargraph;
	
	public static ExpensesBarGraph setUserId(int userId)
	{
		userid = userId;
		return expensesbargraph;
	}
	
    @Override 
    public void start(Stage stage) {
 
    	Driver driver = new Driver();
    	map = driver.getExpensesDataForGraph(userid);
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Expenses for 2015");
        xAxis.setLabel("Month");       
        yAxis.setLabel("Expenditure Count");
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2015");
        
        for(int i = 0; i < 12; i++)
        {
        	series2.getData().add(new XYChart.Data(months[i], map.get(months[i])));
        }
        bc.getData().addAll(series2);
        
        Scene scene  = new Scene(bc,1200,800);
        scene.getStylesheets().add("res/ExpenseBarGraph.css");
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Expenses");

    }
 
    public static void main(String args[]) {
        launch();
    }
}