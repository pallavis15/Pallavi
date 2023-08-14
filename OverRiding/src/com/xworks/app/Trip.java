package com.xworks.app;

public abstract class Trip {
	
	public void plan() {
		System.out.println("invoking plan in Trip");
		
	}
	public void travel() {
		System.out.println("invoking travel in Trip");
		
	}
	public void money() {
		System.out.println("invoking money in Trip");
		
	}
	public void noOfpeople() {
		System.out.println("invoking noOfpeople in Trip");
		
	}
	public void destination() {
		System.out.println("invoking noOfpeople in Trip");
	}


   public abstract boolean safe();
   public abstract void members();
   public  abstract boolean start();
   public abstract void location();
}