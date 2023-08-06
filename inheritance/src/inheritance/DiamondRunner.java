package inheritance;

public class DiamondRunner {
	

		public static void main(String[] args) {
			System.out.println("Invoking main in DiamondRunner");
			Diamond diamond=new Diamond("Mahalakshmi","jayanagr",30999.89,20.4);
			System.out.println(diamond.shopeName);
			System.out.println(diamond.address);
			System.out.println(diamond.price);
			System.out.println(diamond.weight);
			
			
			LabGrownDiamond labGrownDiamond=new LabGrownDiamond();
			System.out.println(labGrownDiamond.shopeName);
			System.out.println(labGrownDiamond.address);
			System.out.println(labGrownDiamond.price);
			System.out.println(labGrownDiamond.weight);
			
		
			LabGrownDiamond labGrownDiamond1=new LabGrownDiamond("Shredevi","Jayanagar",60789.76,20.5);
			System.out.println(labGrownDiamond1.shopeName);
			System.out.println(labGrownDiamond1.address);
			System.out.println(labGrownDiamond1.price);
			System.out.println(labGrownDiamond1.weight);

		}

	}

}
