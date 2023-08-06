package inheritance;

public class ColdCoffee extends Coffee{
	public ColdCoffee()
	{
		this("Black Coffee",10,"Bru",true);
		System.out.println("Invoking no-arg in ColdCoffee");
	}
	public ColdCoffee(String name,double price,String brand,boolean tasty)
	{
		super(name,price,brand,tasty);
		System.out.println("Invoking String,double and boolean in ColdCoffee");
	}


}
