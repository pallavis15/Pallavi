package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.SaloonDTO;

public class Role {

	public static void main(String[] args) {
		Collection<String> collection= new LinkedList<String>();
		collection.add("Software Engineer");
		collection.add("Java Developer");
		collection.add("Human Resource");
		collection.add("Automation Tester");
		collection.add("Performance Tester");
	    collection.add("Data analyst");
		collection.add("Business Analyst");
		collection.add("Manager");
		for(String role : collection) {
			if(role.endsWith("Tester")) {
				System.out.println(role);
				
			}
		}
		System.out.println("======================");
		
		
		
		
	}

}
