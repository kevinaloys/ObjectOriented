import java.util.ArrayList;

public class Cafe
{
	private String cafeName;
	private String cafeLocation;
	private ArrayList<String> foodItems = new ArrayList<String>();
	
	
	public String getCafeName()
	{
		return cafeName;
	}
	
	public void setCafeName(String newname)
	{
		cafeName = newname;
	}
	
	public String getCafeLocation()
	{
		
		return cafeLocation;
	}
	
	public void setCafeLocation(String location)
	{
		cafeLocation = location;
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
		foodItems.remove(food);
	}
}