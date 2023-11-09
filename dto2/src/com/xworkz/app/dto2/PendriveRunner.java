package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.CameraDTO;
import com.xworkz.app.dto.PendriveDTO;

public class PendriveRunner {

	public static void main(String[] args) {
	PendriveDTO pendriveDTO = new PendriveDTO("128GB","HP",true,15);
	PendriveDTO pendriveDTO1 = new PendriveDTO("32GB","sanDisk",true,15);
	PendriveDTO pendriveDTO2= new PendriveDTO("64GB","sony",false,15);
	PendriveDTO pendriveDTO3 = new PendriveDTO("16GB","samsung",true,15);
	PendriveDTO pendriveDTO4= new PendriveDTO("128GB","dell",false,15);
	Collection<PendriveDTO> drive= new ArrayList<PendriveDTO>();
    drive.add(pendriveDTO);
    drive.add(pendriveDTO1);
    drive.add(pendriveDTO2);
    drive.add(pendriveDTO3);
    drive.add(pendriveDTO4);
    drive.stream().sorted().forEach(ref ->System.out.println(ref));
  
   
    
	}

}
