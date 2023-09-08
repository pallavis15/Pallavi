package com.xworks.dto.app.repositaryimpl;

import com.xworks.dto.app.NewsPaparDTO;
import com.xworks.dto.app.repositary.NewPaperRepositary;

public class NewsPapaerRepositaryImpl implements NewPaperRepositary {
private NewsPaparDTO[] dtos = new NewsPaparDTO[TOTAL_ITEMS];
private int  position;
	@Override
	public void save(NewsPaparDTO dto) {
		System.out.println("invkoing main save in JuiceRepositaryImpl");
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
