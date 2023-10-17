package com.xworkz.java1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Person {
	String name="Pallavi";
	int age =22;
	
	
	public static void main(String[] args) {
		System.out.println("invkoing main in person");
		 Person p =new Person();
		 System.out.println("name"+p.name);
		 System.out.println("int"+p.age);
	}
}
