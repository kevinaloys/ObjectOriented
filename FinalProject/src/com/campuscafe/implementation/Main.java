package com.campuscafe.implementation;
import java.net.UnknownHostException;
/**
 * 
 * @author Kevin Aloysius
 *
 */

public class Main {
	public static void main(String[] args) throws UnknownHostException
	{
		
		Driver driver = new Driver();
		driver.getExpensesDataForGraph(1);
		
	}
}
