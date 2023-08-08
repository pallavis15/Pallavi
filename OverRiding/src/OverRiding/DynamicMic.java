package OverRiding;

public class DynamicMic extends Mic {

	@Override
	public void makeSound() {
		System.out.println("Invoking no arg constructor in DynamicMic");
	}



}
