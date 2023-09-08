package com.xworks.dto.app.runner;


import com.xworks.dto.app.AadharDTO;
import com.xworks.dto.app.repositary.AadharRepositary;
import com.xworks.dto.app.repositaryimpl.AadharRepositaryImpl;
import com.xworks.dto.app.service.AadharService;
import com.xworks.dto.app.serviceimpl.AadharServiceImpl;


public class AadharRunner {

	public static void main(String[] args) {
		AadharRepositary aadharRepositary = new AadharRepositaryImpl();
		AadharServiceImpl aadharServiceImpl = new AadharServiceImpl(aadharRepositary);
		AadharDTO dto=new AadharDTO();
		boolean Persited = aadharServiceImpl . validateAndSave(dto);
		System.out.println("Persisted"+ Persited);

	}

}
