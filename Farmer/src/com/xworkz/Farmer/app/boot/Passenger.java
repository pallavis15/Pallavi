package com.xworkz.Farmer.app.boot;
public class Passenger {
	private int age;
	private Bus bus;

	public Passenger(int age) {
		this.age = age;
	}

	public void setPassenger(Bus bus) {
		this.bus = bus;
	}

	public void travelling() {
		System.out.println("invoking travelling() in passesnger");
		this.bus.stop();

}
}
