package inheritance;

public class GoldSmith extends Gold {

	public GoldSmith()
	{
		this("SJR",30500.55,"Rajajinagar",10.55);
		System.out.println("Invoking no-arg in GoldSmith");
	}
	public GoldSmith(String shopName,double price,String location,double weight)
	{
		super(shopName,price,location,weight);
		System.out.println("Invoking String and double in GoldSmith");
	}

}
