package com.campuscafe.implementation;

public class FundsManager {
	private Driver driver = new Driver();
	
	public boolean purchase(int userid, int amount)
	{
		boolean status = driver.decFunds(userid, amount);
		if(status == true)
		{
			driver.incExpenses(userid, amount);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getFunds(int userid)
	{
		int funds = driver.getFunds(userid);
		return funds;
	}
	
	public boolean addFunds(int userid, int amount)
	{
		boolean status = driver.addFunds(userid, amount);
		if(status == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
