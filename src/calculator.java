public class item
{
	private String itemID;
	private double cost;
	private double price;
	private String location;
	public static final double stockXfees = 0.125;
	public static final double supremeShipping = 10.0; 
	public item(String itemID, int cost, String price, String location)
	{
		this.itemID = itemID;
		this.cost = cost;
		this.price = price;
		this.location = location;
	}
	

}