package inheritance;

public class GroundRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in GroundRunner");
		Ground ground=new Ground("Chinnnaswamy","137m",11,"Rajajinagar");
		System.out.println(ground.name);
		System.out.println(ground.dimension);
		System.out.println(ground.noOfPlayer);
		System.out.println(ground.location);
		
		System.out.println("----------------------------");
		CricketGround cricketground=new CricketGround();
		System.out.println(cricketground.name);
		System.out.println(cricketground.dimension);
		System.out.println(cricketground.noOfPlayer);
		System.out.println(cricketground.location);

		System.out.println("----------------------------");
		CricketGround cricketground1=new CricketGround("Kanteerava","150m",11,"Malleshwaram");
		System.out.println(cricketground1.name);
		System.out.println(cricketground1.dimension);
		System.out.println(cricketground1.noOfPlayer);
		System.out.println(cricketground1.location);
	}


	}


