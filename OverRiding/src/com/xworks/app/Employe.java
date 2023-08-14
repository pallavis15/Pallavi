package com.xworks.app;



	public class Employe extends Person {
		@Override
	    public String getOccupation() {
	        return "Chef";
	    }

	    @Override
	    public void study() {
	        System.out.println("Person is studying.");
	    }

	    @Override
	    public void celebrateBirthday() {
	        System.out.println("Person is celebrating their birthday.");
	    }

	    @Override
	    public void exercise() {
	        System.out.println("Person is exercising.");
	    }

	   

	}



