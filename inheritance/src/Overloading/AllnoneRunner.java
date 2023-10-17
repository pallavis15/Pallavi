package Overloading;

public class AllnoneRunner {

	public static void main(String[] args) {
	
	
				
				System.out.println("--------------------IRON-BOX-------------------");
				Ironbox box=new Ironbox();
				box.iron();
				System.out.println("\n");
				box.iron("Usha",1450);

				System.out.println("^--------------------HOTEL-------------------");

				Hotel star=new Hotel();
				star.fivestar();
				System.out.println("\n");
				star.fivestar("Mayura",true);
				
				
				System.out.println("--------------------STAPLER-------------------");
				
				Stapler store=new Stapler();
				store.pin();
				System.out.println("\n");
				store.pin("Hyderon",759);
				
				System.out.println("--------------------UMBRELLA-------------------");
				
				Umberlla drop=new Umberlla();
				drop.rain();
				System.out.println("\n");
				drop.rain("Black",250);

				System.out.println("--------------------GADGET-------------------");
				
				Gadget product=new Gadget();
				product.item();
				System.out.println("\n");
				product.item("Fridge",10000);
				
				System.out.println("--------------------PLIER-------------------");
				
				Piller kit=new Piller();
				kit.tool();
				System.out.println("\n");
				kit.tool("Knipex",'M');
				
				System.out.println("--------------------MOUSE-------------------");
				
				Mouse key=new Mouse();
				key.point();
				System.out.println("\n");
				key.point("Hp",1150);
				
				System.out.println("--------------------ELEVATOR-------------------");
				
				Elevator run=new Elevator();
				run.lift();
				System.out.println("\n");
				run.lift("Kaleai",542);
			}

		


	}


