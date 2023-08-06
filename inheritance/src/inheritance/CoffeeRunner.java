package inheritance;

public class CoffeeRunner {
	

		public static void main(String[] args) {

			System.out.println("Invoking main in CoffeeRunner");
			Coffee coffee=new Coffee("Black Coffee",20,"Nescafe",true);
			System.out.println(coffee.name);
			System.out.println(coffee.price);
			System.out.println(coffee.brand);
			System.out.println(coffee.tasty);
			
			System.out.println("------------------------");
			ColdCoffee coldcoffee=new ColdCoffee();
			System.out.println(coldcoffee.name);
			System.out.println(coldcoffee.price);
			System.out.println(coldcoffee.brand);
			System.out.println(coldcoffee.tasty);
			
			System.out.println("------------------------");
			ColdCoffee coldcoffee1=new ColdCoffee("Cold Coffee",50,"Continental",true);
			System.out.println(coldcoffee1.name);
			System.out.println(coldcoffee1.price);
			System.out.println(coldcoffee1.brand);
			System.out.println(coldcoffee1.tasty);
					

		}

	}


