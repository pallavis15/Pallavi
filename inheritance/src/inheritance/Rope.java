package inheritance;

public class Rope {
	public String material;
	public double price;
	public String color;
	public int length;
	
	public Rope(String material,double price,String color,int length)
	{
		System.out.println("Invoking String,double,int in Rope");
		this.material=material;
		this.price=price;
		this.color=color;
		this.length=length;
	}


}
