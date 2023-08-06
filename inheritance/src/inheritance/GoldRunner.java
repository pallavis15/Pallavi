package inheritance;

public class GoldRunner {


		public static void main(String[] args) {
			System.out.println("Invoking main in GoldRunner");
			Gold gold=new Gold("Saraswathi",35000.55,"Rajajinagar",10.55);
			System.out.println(gold.shopName);
			System.out.println(gold.price);
			System.out.println(gold.location);
			System.out.println(gold.weight);
			
			System.out.println("-----------------------------");
			GoldSmith goldsmith=new GoldSmith();
			System.out.println(goldsmith.shopName);
			System.out.println(goldsmith.price);
			System.out.println(goldsmith.location);
			System.out.println(goldsmith.weight);
			
			System.out.println("-----------------------------");
			GoldSmith goldsmith1=new GoldSmith("Mallbar",40500.55,"Malleswaram",15.5);
			System.out.println(goldsmith1.shopName);
			System.out.println(goldsmith1.price);
			System.out.println(goldsmith1.location);
			System.out.println(goldsmith1.weight);

		}

	}

