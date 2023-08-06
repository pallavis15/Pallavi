package inheritance;

public class LabGrownDiamond {
	public LabGrownDiamond()
	{
		this("Mahalakshmi","Rajajinagar",50000.30,20);
		System.out.println("Invoking no-arg in LabGrownDiamonds");
	}
	public LabGrownDiamond(String shopeName,String address,double price,double weight)
	{
		super(shopeName,address,price,weight);
		System.out.println("Invoking String and double in LabGrownDiamonds");
	}

}
