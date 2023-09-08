package com.xworks.dto.app.repositaryimpl;

import com.xworks.dto.app.AadharDTO;
import com.xworks.dto.app.DoctorDTO;
import com.xworks.dto.app.repositary.DoctorRepositary;

public class DoctorRepositaryImpl implements DoctorRepositary {
	private  DoctorDTO[] dtos = new  DoctorDTO[TOTAL_ITEMS];
	private int  position;

	@Override
	public void save(DoctorDTO dto) {
		System.out.println("invkoing main save in AadharRepositaryImpl");
		if(position < TOTAL_ITEMS) {
		this.dtos[position] = dto;
		System.out.println("stored"+dto+"is in position"+this.position);
		this.position++;
		}
		else {
			System.out.println("storage in full ....cannot save");
			
		}


	}

}
