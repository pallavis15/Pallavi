package com.xworks.app.repositary;

import com.xworks.app.dto1.EngineerDTO;


public class EngineerImpl implements EngineerDTORepositary {
	private EngineerDTO[] dtos = new EngineerDTO[TOTAL_ITEMS];
	private int  position;


	@Override
	public void save(EngineerDTO dto) {
		System.out.println("invkoing main save in EngineerImpl");
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
