import java.util.ArrayList;

public class VendingMachine
{
	private String vendingMachineName;
	private String vendingMachineLocation;
	private ArrayList<String> foodItems = new ArrayList<String>();
	
	
	public void setVendingMachineName(String name)
	{
		vendingMachineName = name;
	}
	
	public String getVendingMachineName()
	{
		return vendingMachineName;
	}
	
	public void setVendingMachineLocation(String location)
	{
		vendingMachineLocation = location;
	}
	
	public String getVendingMachineLocation()
	{
		return vendingMachineLocation;
	}
	
	public ArrayList<String> getFoodItems()
	{
		return foodItems;
	}
	
	public void addFoodItem(String food)
	{
		foodItems.add(food);
	}
	
	public void removeFoodItem(String food)
	{
		
	}
}