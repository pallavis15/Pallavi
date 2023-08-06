package inheritance;

public class Ground {

	public String name;
	public String dimension;
	public int noOfPlayer;
	public String location;
	
	public Ground(String name,String dimension,int noOfPlayer,String location)
	{
		System.out.println("Invoking String,int in Ground");
		this.name=name;
		this.dimension=dimension;
		this.noOfPlayer=noOfPlayer;
		this.location=location;
		
	}

}
