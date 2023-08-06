package inheritance;

public class Coffee {
	public String name;
	public double price;
	public String brand;
	public boolean tasty;
	
	public Coffee(String name,double price,String brand,boolean tasty)
	{
		System.out.println("Invoking String,double and boolean in Coffee");
		this.name=name;
		this.price=price;
		this.brand=brand;
		this.tasty=tasty;
	}

}
