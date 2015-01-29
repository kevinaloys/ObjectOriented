public class Alpha1Oven
{
	public enum StatusType{on, off};
	private StatusType status;
	private int currentTime;
	private int currentTemp;
	
	Alpha1Oven()
	{
		status = StatusType.off;
		currentTime = 0;
		currentTemp = 0;
	}
	
	public void start()
	{
		if(currentTime > 10 && currentTemp > 10)
		{
			status = StatusType.on;
		}
		else
		{
			status = StatusType.off;
		}
	}
	
	public void setTemprature(int temp)
	{
		currentTemp = temp;
	}
	
	public void setTime(int time)
	{
		currentTime = time;
	}
	
	public void showStatus()
	{
		System.out.println("Current Temperature" + currentTemp);
		System.out.println("Current Time" + currentTime);
		System.out.println("Status : " + status);
	}
	
}