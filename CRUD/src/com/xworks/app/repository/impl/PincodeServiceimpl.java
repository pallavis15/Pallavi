package com.xworks.app.repository.impl;

import com.xworks.app.repo.PincodeRepositary;
import com.xworks.app.repo.PinodeService;

public class PincodeServiceimpl implements PinodeService {
private PincodeRepositary pinodeRepositary;
public PincodeServiceimpl(PincodeRepositary pinodeRepositary) {
	
}
	@Override
	public boolean validateAndSave(int number) { 
		System.out.println("invoking validateand save "+this.getClass().getSimpleName());
		if(number!=null && ! number.isEmpty() && number.length()>=3 && number.length()<=20)
		{
			System.out.println("number is valid");
			this.pinodeRepositary.store(number);
			if(!this.pinodeRepositary.IsExist(number))
			{
			this.pinodeRepositary.store(number);
			return true;
			
			
		}
			else
			{
				System.out.println("juice name"+number+"already exists add another one");
			}
		
			
			
			
		}
		else
		{
			System.out.println("number is invalid,cannot save");
		}
		
		return false;
	}

}
