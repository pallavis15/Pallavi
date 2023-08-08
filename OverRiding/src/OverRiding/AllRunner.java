package OverRiding;

public class AllRunner {

	public static void main(String[] args) {
	
System.out.println("Running main in TicketRunner");
		
		Ticket ticket=new FirstclassTicket();
		ticket.issue();
		System.out.println("_______________________");
		
System.out.println("Running main in TheatreRunner");
		
		Theatre theatre=new MovieTheatre();
		theatre.playMovies();
		System.out.println("_______________________");
		
System.out.println("Running main in MicRunner");
		
		Mic mic=new DynamicMic();
		mic.makeSound();
		System.out.println("_______________________");
System.out.println("Running main in GaterRunner");
		
		Gate gate=new SlidingGate();
		gate.open();

		System.out.println("Running main in FlexRunner");
		System.out.println("_______________________");	
		Flex flex=new RollingFlex();
		flex.display();
		System.out.println("_______________________");
System.out.println("Running main in DrumRunner");
		
		Drum drum=new bassDrum();
		drum.noise();
		System.out.println("_______________________");
System.out.println("Running main in DinosaurRunner");
		
		Dinosaur dinosaur=new Spinosaurus();
		dinosaur.eat();
		
		System.out.println("_______________________");
System.out.println("Running main in CoalRunner");
		
		Coal coal=new BestCoal();
		coal.burn();
		System.out.println("_______________________");
System.out.println("Running main in BangleRunner ");
		
		Bangle bangle=new GlassBangle();
		bangle.sound();

		System.out.println("_______________________");
		System.out.println("Running main in AmoebaRunner");
		Amoeba amoeba=new ProteusAmoeba();
		
		amoeba.move();


	}



	}


