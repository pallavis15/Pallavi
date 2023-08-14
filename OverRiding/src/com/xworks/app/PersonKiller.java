package com.xworks.app;

public class PersonKiller {

	public static void main(String[] args) {
		System.out.println("Running main in PersonRunner");

		Person person = new Employe();

		person.run();
		person.eat();
		person.work();
		person.sleep();
		person.relax();

		System.out.println(person.getOccupation());
		person.study();
		person.celebrateBirthday();
		person.exercise();
		
	}



	}


