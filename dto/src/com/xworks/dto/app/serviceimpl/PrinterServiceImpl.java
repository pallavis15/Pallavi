package com.xworks.dto.app.serviceimpl;

import com.xworks.dto.app.PrinterDTO;
import com.xworks.dto.app.repositary.NewPaperRepositary;
import com.xworks.dto.app.repositary.PrinterRepositary;
import com.xworks.dto.app.service.PrinterService;

public class PrinterServiceImpl implements PrinterService {
	private PrinterRepositary printerRepositary; 
	private int position;
	public PrinterServiceImpl(PrinterRepositary printerRepositary) {
		this.printerRepositary = printerRepositary;
	}
	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("invoking validate and save"+this.getClass().getName());
		if(dto!=null) {
			System.out.println("newsPaper data is valid"+this.position);
			String name = dto.getName();
			Double cost = dto.getCost();
			String brand = dto.getBrand();
			int varrenty = dto.getVarrenty();
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20);
			{
				System.out.println("name is valid");
				
				
			}
			
			this.printerRepositary.save(dto);
			return false;
			
			
		}
		else {
			System.out.println("data is invalid cannot sqave");
		}
		return false;
	}


}


