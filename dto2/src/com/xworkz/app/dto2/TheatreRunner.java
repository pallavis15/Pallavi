package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.RobotDTO;
import com.xworkz.app.dto.TheaterDTO;

public class TheatreRunner {

	public static void main(String[] args) {
		TheaterDTO dto=new TheaterDTO(1, "Jawan", 5,"shimogga");
		TheaterDTO dto1=new TheaterDTO(2, "Jailer", 4,"shimogga");
		TheaterDTO dto2=new TheaterDTO(3, "Ghost", 5,"shimogga");
		TheaterDTO dto3=new TheaterDTO(4, "SpiderMan", 3,"mysore");
		TheaterDTO dto4=new TheaterDTO(5, "EcapeRoom", 4,"Banglore");
		Collection<TheaterDTO> collection=new ArrayList<TheaterDTO>();
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);
		collection.stream().sorted().forEach(ref->System.out.println(ref));
	}
		

}
