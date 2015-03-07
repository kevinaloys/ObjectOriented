package com.campuscafe.chart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class BarGraph extends Application {
	String[] months = {"January", "February","March",
			"April","May", "June", "July", "August",
			"September", "October", "November", "December"};
	
    @Override 
    public void start(Stage stage) {
        
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Caloric Consumption for 2015");
        xAxis.setLabel("Month");       
        yAxis.setLabel("Caloric Count");
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2015");
        for(int i = 0; i < 12; i++)
        {
        	series2.getData().add(new XYChart.Data(months[i], i));
        }
        bc.getData().addAll(series2);
        
        Scene scene  = new Scene(bc,1200,800);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Caloric Consumption");

    }
 
    public static void main(String args[]) {
        launch();
    }
}