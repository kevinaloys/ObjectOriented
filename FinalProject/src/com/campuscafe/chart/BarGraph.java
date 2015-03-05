package com.campuscafe.chart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class BarGraph extends Application {
 
    @Override public void start(Stage stage) {
        stage.setTitle("Caloric Consumption");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Caloric Consumption for 2015");
        xAxis.setLabel("Month");       
        yAxis.setLabel("Caloric Count");
     
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2015");
        series2.getData().add(new XYChart.Data("January", 67401.85));
        series2.getData().add(new XYChart.Data("February", 41941.19));
        series2.getData().add(new XYChart.Data("March", 45263.37));
        series2.getData().add(new XYChart.Data("April", 117320.16));
        series2.getData().add(new XYChart.Data("May", 52645.27));
        series2.getData().add(new XYChart.Data("June", 165222.27));
        series2.getData().add(new XYChart.Data("July", 65456));
        series2.getData().add(new XYChart.Data("August", 46520));
        series2.getData().add(new XYChart.Data("September", 61532));
        series2.getData().add(new XYChart.Data("October", 26512));
        series2.getData().add(new XYChart.Data("November", 63541));
        series2.getData().add(new XYChart.Data("December", 42145));
        
        Scene scene  = new Scene(bc,1200,800);
        bc.getData().addAll(series2);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}