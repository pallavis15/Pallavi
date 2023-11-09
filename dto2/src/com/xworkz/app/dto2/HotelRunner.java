package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;

	
import com.xworkz.app.dto.HotelDTO;

public class HotelRunner {

	public static void main(String[] args) {
		HotelDTO hotel = new HotelDTO(1, "Royal Orkid", "yadirappa", "34567vcdrtyl", "India");
		HotelDTO hotel1 = new HotelDTO(1, "Royal Orkid", "yadirappa", "34567vcdrtyl", "India");
		HotelDTO hotel2 = new HotelDTO(2, "Udupi kithcen", "Nidhi", "34567vcdrty2", "Uk");
		HotelDTO hotel3 = new HotelDTO(3, "Rameshwaram", "pallavi", "34567vcdrty3", "India");
		HotelDTO hotel4 = new HotelDTO(4, "Royal Inn", "Lohit", "34567vcdrtyl4", "Srilanka");
		HotelDTO hotel5 = new HotelDTO(5, "Istay", "karthik", "34567vcdrtyl3", "India");
		HotelDTO hotel6 = new HotelDTO(6, "Taj Bekal ", "kiran", "34567vcdrtyl5", "India");
		HotelDTO hotel7 = new HotelDTO(7, "grand regecy", "shruthi", "34567vcdrtyl8", "USA");
		HotelDTO hotel8 = new HotelDTO(8, "canada", "sonu", "34567vcdrtyl9", "India");
		HotelDTO hotel9 = new HotelDTO(9, "kapoors cafe", "srujana", "34567vcdrtyl6", "India");
		HotelDTO hotel10 = new HotelDTO(1, "five Star", "yashu", "34567vcdrtyl7", "India");

		
		Collection<HotelDTO> hotels= new ArrayList<HotelDTO>();
		hotels.add(hotel);
		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);
		hotels.add(hotel4);
		hotels.add(hotel5);
		hotels.add(hotel6);
		hotels.add(hotel7);
		hotels.add(hotel8);
		System.err.println("Getting Hotel Name  of india by Loaction");
		hotels.stream().filter(ref -> ref.getLocation().equals("India"))
				.forEach(ref -> System.out.println(ref.getName()));
		System.err.println("Getting Hotel Name of SriLanka  by Loaction");
	hotels.stream().filter(h -> h.getLocation().equals("Srilanka"))
				.forEach(ref -> System.out.println(ref.getName()));
		System.err.println("Only Owner names");
         hotels.stream().map(ref->ref.getOwnerName()).forEach(ref->System.out.println(ref));
         System.err.println("Only GST Number");
        hotels.stream().map(ref->ref.getGst()).forEach(ref->System.out.println(ref));
         System.err.println("Get Id By Loaction equals to UK");
         hotels.stream().filter(ref->ref.getLocation().equals("UK")).forEach(ref->System.out.println(ref.getId()));
         System.err.println("Get OwnerName By Loaction equals to USA");
     hotels.stream().filter(ref->ref.getLocation().equals("USA")).forEach(ref->System.out.println(ref.getOwnerName()));
	}


	}


