package inheritance;

public class RopeRunner {
	
		public static void main(String[] args) {
			System.out.println("Invoking main RopeRunner");
			Rope rope=new Rope("Polister",1500.55,"black",40);
			System.out.println(rope.material);
			System.out.println(rope.price);
			System.out.println(rope.color);
			System.out.println(rope.length);
			
			System.out.println("-----------------------------");
			StretchingRope stretchingRope=new StretchingRope();
			System.out.println(stretchingRope.material);
			System.out.println(stretchingRope.price);
			System.out.println(stretchingRope.color);
			System.out.println(stretchingRope.length);
			
			System.out.println("-----------------------------");
			StretchingRope stretchingRope1=new StretchingRope("Cotton",2500.98,"white",20);
			System.out.println(stretchingRope1.material);
			System.out.println(stretchingRope1.price);
			System.out.println(stretchingRope1.color);
			System.out.println(stretchingRope1.length);
			
		}

	}

