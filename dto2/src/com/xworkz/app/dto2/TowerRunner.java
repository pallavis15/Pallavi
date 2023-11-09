package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.RobotDTO;
import com.xworkz.app.dto.TowerDTO;

public class TowerRunner {
	public static void main(String[] args) {
		TowerDTO dto=new TowerDTO(19000, "amoz", "India", true);
		TowerDTO dto1=new TowerDTO(16000, "amoz", "us", true);
		TowerDTO dto2=new TowerDTO(17000, "amoz", "Uk", true);
		TowerDTO dto3=new TowerDTO(19000, "amoz", "dubai", true);
		TowerDTO dto4=new TowerDTO(19000, "amoz", "Malashiya", true);
		Collection<TowerDTO> collection=new ArrayList<TowerDTO>();
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);
		collection.stream().sorted().forEach(ref->System.out.println(ref));

	}
	}


