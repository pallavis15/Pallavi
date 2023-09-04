package com.xworkz.Farmer.app;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LaptopsRunner");
		String brand="DELL";
		Processor pro=new Processor();
		Laptop lap=new Laptop();
		lap.setLaptops(pro);
		lap.game();
		lap.movie();
		lap.program();
		lap.chatting();

	}


	}


