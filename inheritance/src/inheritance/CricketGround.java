package inheritance;

public class CricketGround {
	public CricketGround()
	{
		this("ChinnaSwamy","137m",11,"Rajajinagar");
		System.out.println("Invoking no-arg in CricketGround");
	}
	public CricketGround(String name,String dimension,int noOfPlayer,String location)
	{
		Super(name,dimension,noOfPlayer,location);
		System.out.println("Invoking String,int in CricketGround");
	}
}

