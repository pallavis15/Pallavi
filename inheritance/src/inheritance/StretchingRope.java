package inheritance;

public class StretchingRope extends Rope {
	public StretchingRope()
	{
		this("Nylon",3000.55,"black",30);
		System.out.println("Invoking no-args in StretchingRope");
	}
	public StretchingRope(String material,double price,String color,int length)
	{
		super(material,price,color,length);
		System.out.println("Invoking String,double,int in StretchingRope");
		
	}
	

}
