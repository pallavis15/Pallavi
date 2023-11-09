package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.OceanDTO;
import com.xworkz.app.dto.TheaterDTO;
import com.xworkz.app.dto.TowerDTO;

public class OceanRunner {

	public static void main(String[] args) {
		 OceanDTO dto=new  OceanDTO(200, "indianOcean", 5,"inida");
		 OceanDTO dto1=new  OceanDTO(100, "Atlantic", 5,"uk");
		 OceanDTO dto2=new  OceanDTO(290, "Southern", 5,"us");
		 OceanDTO dto3=new  OceanDTO(201, "pacific", 5,"us");
		 OceanDTO dto4=new  OceanDTO(145, "Sanji", 5,"china");
		 Collection<OceanDTO> collection=new ArrayList<OceanDTO>();
			collection.add(dto4);
			collection.add(dto3);
			collection.add(dto2);
			collection.add(dto1);
			collection.add(dto);
			collection.stream().sorted().forEach(ref->System.out.println(ref));

	}

}
