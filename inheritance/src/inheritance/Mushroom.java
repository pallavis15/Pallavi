package inheritance;

public class Mushroom {
	public String color;
	public double price;
	public int quantity;
	public boolean edible;
	
	public Mushroom(String color,double price,int quantity,boolean edible)
	{
		System.out.println("Invoking string,double,int,boolean in mushroom");
		this.color=color;
		this.price=price;
		this.quantity=quantity;
		this.edible=edible;
		
	}

}
