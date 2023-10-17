package com.xworks.app.repository.app;
import com.xworks.app.repository.impl.*;
import com.xworks.app.repo.*;
public class PincodeRunner {

	public static void main(String[] args) {
		PincodeRepositary pincodeRepositary = new PincodeRepositaryimpl();
		PincodeService pincodeService = new PincodeRepositaryimpl(pincodeRepositary);
		pincodeService.validateAndSave =("577201");

				
				
	}

}
