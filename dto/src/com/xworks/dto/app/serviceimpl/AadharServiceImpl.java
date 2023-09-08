package com.xworks.dto.app.serviceimpl;

import com.xworks.dto.app.AadharDTO;
import com.xworks.dto.app.repositary.AadharRepositary;
import com.xworks.dto.app.repositary.NewPaperRepositary;
import com.xworks.dto.app.service.AadharService;

public class AadharServiceImpl implements AadharService {
	private AadharRepositary aadharRepositary;
	private int position;

	public AadharServiceImpl(AadharRepositary aadharRepositary) {
		this.aadharRepositary = aadharRepositary;
	}

	@Override
	public boolean validateAndSave(AadharDTO dto ) {
		System.out.println("invoking validate and save"+this.getClass().getName());
		if(dto!=null) {
			System.out.println("newsPaper data is valid"+this.position);
			String name = dto.getName();
			int number = dto.getNumber();
			int born =dto.getBorn();
			int adress = dto.getAdress();
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20);
			{
				System.out.println("name is valid");
			
			else {
				System.out.println("name is in valid");
				return false;
			}
			}
			if(number!=null && !number.isEmpty() && number.length()>=3 && number.length()<=20);
			{
				System.out.println("number is valid");
			}
			
			else {
				System.out.println("number is in valid");
				return false;
			} 
		if(born!=null && !born.isEmpty() && born.length()>=3 && born.length()<=20);
		{
			System.out.println("born is valid");
		
		else {
			System.out.println("born is in valid");
			return false;
		}
		}
			
			
		
			
			this.aadharRepositary.save(dto);
			return false;
			
		else {
			System.out.println("data is invalid cannot save");
		}
		return false;
	}
	}
}
