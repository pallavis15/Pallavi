package com.xworks.dto.app.serviceimpl;

import com.xworks.dto.app.NewsPaparDTO;
import com.xworks.dto.app.repositary.NewPaperRepositary;
import com.xworks.dto.app.service.NewsPapaerService;

public class NewsPaperServiceImpl implements NewsPapaerService {
private NewPaperRepositary newsPaperRepositary; 
private int position;
public NewsPaperServiceImpl(NewPaperRepositary newPaperRepositary) {
	this.newsPaperRepositary = newPaperRepositary;
}

	@Override
	public boolean validateAndSave(NewsPaparDTO dto) {
		System.out.println("invoking validate and save"+this.getClass().getName());
		if(dto!=null) {
			System.out.println("newsPaper data is valid"+this.position);
			String name = dto.getName();
			Double cost = dto.getCost();
			String publisher = dto.getPublisher();
			String language = dto.getLanguage();
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20);
			{
				System.out.println("name is valid");
				
				
			}
			
			this.newsPaperRepositary.save(dto);
			return false;
			
			
		}
		else {
			System.out.println("data is invalid cannot sqave");
		}
		return false;
	}

}
