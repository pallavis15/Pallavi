package inheritance;

public class Diamond {
	public String shopeName;
	public String address;
	public double price;
	public double weight;
	
	public Diamond(String shopeName,String address,double price,double weight)
	{
		System.out.println("Invoking String and double in Diamond ");
		this.shopeName=shopeName;
		this.address=address;
		this.price=price;
		this.weight=weight;
	}


}
