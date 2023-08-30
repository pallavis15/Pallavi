package com.xworkz.Farmer.app;

public class Farmer {
	private String name;
	private Land land;
	 
	public Farmer(String name) {
		 this.name= name;
		 
				 }
	 public void setLand(Land land) {
		 this.land = land;
		 
	 }
	 public void farming() {
	 System.out.println("invoking in agri");
	 this.land.cropGrowing();
}
}
