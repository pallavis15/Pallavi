package com.xworks.dto.app.runner;

import com.xworks.dto.app.repositary.*;

import com.xworks.dto.app.PrinterDTO;
import com.xworks.dto.app.repositaryimpl.NewsPapaerRepositaryImpl;
import com.xworks.dto.app.repositaryimpl.PrinterRepositaryImpl;
import com.xworks.dto.app.serviceimpl.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {
		PrinterRepositary printerRepositary = new PrinterRepositaryImpl();
		PrinterServiceImpl printerService = new PrinterServiceImpl(printerRepositary);
		PrinterDTO dto=new PrinterDTO();
		boolean Persited = printerService .validateAndSave(dto);
		System.out.println("Persisted"+ Persited);
		
 
	}


	}


