package com.xworks.dto.app.repositaryimpl;

import com.xworks.dto.app.AadharDTO;
import com.xworks.dto.app.PrinterDTO;
import com.xworks.dto.app.repositary.PrinterRepositary;

public class PrinterRepositaryImpl implements PrinterRepositary {
	private PrinterDTO[] dtos = new PrinterDTO[TOTAL_ITEMS];
	private int  position;
	@Override
	public void save(PrinterDTO dto) {
		System.out.println("invkoing main save PrinterRepositaryImpl");
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
