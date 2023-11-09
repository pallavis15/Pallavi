package com.xworkz.app.dto2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Festival {
		    public static void main(String[] args) {
		        LinkedList<String> festivals = new LinkedList<>(Arrays.asList(
		                "New Year's Day", "Yugadi", "Easter", "Independence Day",
		                "Halloween", "Sankranti", "Christmas", "Diwali", "ganesh chaturthi",
		                "Raksha bandhan", "Dasara", "Onam", "Panchami",
		                "kannada rajyostava", "Bhoomi hunnime", "Ram Navami"));

		        
		        festivals.stream()
		                .filter(festival -> festival.length() > 6)
		                .forEach(System.out::println);

		       
		        List<String> shortFestivals = festivals.stream()
		                .filter(festival -> festival.length() < 6)
		                .collect(Collectors.toList());
		        System.out.println(shortFestivals);

		     
		        List<String> festivalsWithO = festivals.stream()
		                .filter(festival -> festival.toLowerCase().contains("o"))
		                .collect(Collectors.toList());
		        System.out.println(festivalsWithO);

		      
		        List<String> festivalsWithG = festivals.stream()
		                .filter(festival -> festival.toLowerCase().contains("g"))
		                .collect(Collectors.toList());
		        System.out.println(festivalsWithG);

		       
		        festivals.stream()
		                .filter(festival -> festival.toLowerCase().endsWith("s"))
		                .forEach(System.out::println);

		        List<String> festivalsWithZR = festivals.stream()
		                .filter(festival -> festival.toLowerCase().contains("z") || festival.toLowerCase().contains("r"))
		                .collect(Collectors.toList());
		        System.out.println(festivalsWithZR);

		       
		      		        
		        List<String> festivalWithRAM = festivals.stream()
		        		.filter(festival ->festival.toLowerCase().contains("ram"))
		        		.collect(Collectors.toList());
		        System.out.println("festivalWithRam");
		    }
		    }


		}



