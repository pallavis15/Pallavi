package com.xworks.dto.app.runner;

import com.xworks.dto.app.NewsPaparDTO;
import com.xworks.dto.app.repositary.NewPaperRepositary;
import com.xworks.dto.app.repositaryimpl.NewsPapaerRepositaryImpl;
import com.xworks.dto.app.service.NewsPapaerService;
import com.xworks.dto.app.serviceimpl.NewsPaperServiceImpl;

public class NewsPaperRunner {

	public static void main(String[] args) {
		NewPaperRepositary newPaperRepositary = new NewsPapaerRepositaryImpl();
		NewsPapaerService newsPapaerService = new NewsPaperServiceImpl(newPaperRepositary);
		NewsPaparDTO dto=new NewsPaparDTO();
		boolean Persited = newsPapaerService .validateAndSave(dto);
		System.out.println("Persisted"+ Persited);
		
 
	}

}
