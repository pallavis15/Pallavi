package inheritance;

public class PoisonMushroom extends Mushroom{
	public PoisonMushroom()
	{
		this("White",100,250,false);
		System.out.println("Invoking no-args in poisonMushroom");
	}

	public PoisonMushroom(String color, double price, int quantity, boolean edible) {
		super(color,price,quantity,edible);
		System.out.println("Invoking String,double,int,boolean in PoisonMushroom");
	}


}
