package com.campuscafe.implementation;

public class FundsManager {
	private Driver driver = new Driver();
	
	public void purchase(int userid, int amount)
	{
		boolean status = driver.decFunds(userid, amount);
		if(status == true)
		{
			driver.incExpenses(userid, amount);
		}
	}
	
	public int getFunds(int userid)
	{
		int funds = driver.getFunds(userid);
		return funds;
	}
}
