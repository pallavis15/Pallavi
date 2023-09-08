package com.xworks.dto.app.repositaryimpl;

import com.xworks.dto.app.AadharDTO;

import com.xworks.dto.app.repositary.AadharRepositary;

public class AadharRepositaryImpl implements AadharRepositary {
	private AadharDTO[] dtos = new AadharDTO[TOTAL_ITEMS];
	private int  position;
	@Override
	public void save(AadharDTO dto) {
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


	


