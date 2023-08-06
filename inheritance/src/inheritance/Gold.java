package inheritance;

public class Gold {
	public String shopName;
	public double price;
	public String location;
	public double weight;
	
	public Gold(String shopName,double price,String location,double weight)
	{
		System.out.println("Invoking String,double in Gold");
		this.shopName=shopName;
		this.price=price;
		this.location=location;
		this.weight=weight;
		
	}

}
