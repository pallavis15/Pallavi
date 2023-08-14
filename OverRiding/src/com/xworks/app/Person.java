package com.xworks.app;

public abstract class Person {
	
		
		public void run() {
	        System.out.println("Person is run");
	    }

	    public void eat() {
	        System.out.println("Person is eating");
	    }

	    public void sleep() {
	        System.out.println("Person is sleeping");
	    }

	    public void work() {
	        System.out.println("Person is working");
	    }
	    public void relax() {
	        System.out.println("Person is relaxing");
	    }
	    
	    public abstract String getOccupation();
	    public abstract void study();
	    public abstract void celebrateBirthday();
	    public abstract void exercise();
	    


	}


