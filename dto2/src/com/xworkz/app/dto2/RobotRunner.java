package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.RobotDTO;

public class RobotRunner {

	public static void main(String[] args) {
		RobotDTO dto=new RobotDTO(14000, "Alexa", "Shivamogga", true);
		RobotDTO dto1=new RobotDTO(13000, "Siri", "Bangalore", true);
		RobotDTO dto2=new RobotDTO(21000, "Google", "USA", true);
		RobotDTO dto3=new RobotDTO(17000, "insta", "China", true);
		RobotDTO dto4=new RobotDTO(19000, "amoz", "Malashiya", true);
		Collection<RobotDTO> collection=new ArrayList<RobotDTO>();
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);
		collection.stream().sorted().forEach(ref->System.out.println(ref));

	}

}
