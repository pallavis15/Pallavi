package com.xworkz.Farmer.app.boot;
public class PassesngerRunner {


	public static void main(String[] args) {
		System.out.println("invoking main in PassengerRunner");
		int age;
		Bus bus = new Bus();
		Passenger pass = new Passesnger();
		pass.setPassenger(bus);
		pass.travelling();
	}


	}


