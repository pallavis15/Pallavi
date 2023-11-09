package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.SaloonDTO;


public class SaloonRunner {

	public static void main(String[] args) {
		SaloonDTO saloon1 = new SaloonDTO(1,"pallavi",500.0,"Haircut",2);
		SaloonDTO saloon2 = new SaloonDTO(2,"Nidhi",1000.0,"Facial",1);
		SaloonDTO saloon3 = new SaloonDTO(3,"Srujana",100.0,"eyebrows",2);
		SaloonDTO saloon4 = new SaloonDTO(4,"kiran",500.0,"massage",2);
		SaloonDTO saloon5 = new SaloonDTO(5,"karthik",500.0,"",2);
		SaloonDTO saloon6 = new SaloonDTO(6,"nikitha",500.0,"Haircut",2);
		SaloonDTO saloon7 = new SaloonDTO(7,"darshan",500.0,"Haircut",2);
		SaloonDTO saloon8 = new SaloonDTO(8,"shruthi",500.0,"Pavi",2);
		SaloonDTO saloon9 = new SaloonDTO(9,"chintu",600.0,"Haircut",2);
		SaloonDTO saloon10 = new SaloonDTO(10,"archana",5000.0,"Haircolor",2);
		
		Collection<SaloonDTO> saloons = new ArrayList<SaloonDTO>();
		saloons.add(saloon1);
		saloons.add(saloon2);
		saloons.add(saloon3);
		saloons.add(saloon4);
		saloons.add(saloon5);
		saloons.add(saloon6);
		saloons.add(saloon7);
		saloons.add(saloon8);
		saloons.add(saloon9);
		saloons.add(saloon10);
System.out.println("saloon :"+saloons.size());
saloons.stream().sorted().forEach(ref->System.out.println(ref));
		
		Collection<String> saloon = new ArrayList();
		SaloonDTO saloon11 = new SaloonDTO(11,"Tanisha",5000.0,"Haircolor",1);
		SaloonDTO saloon12 = new SaloonDTO(12,"Sonu",4000.0,"waxing",3);
		 
		boolean ref = saloons .contains("shruthi");
		System.out.println("Contains :"+ref);
		
		boolean ref1 = saloons .containsAll();
		System.out.println("Contains :"+ref);
		
		
		
		

	}

}
