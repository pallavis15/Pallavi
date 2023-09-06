package com.xworks.app.repository.impl;

import com.xworks.app.repo.MobileService;
import com.xworks.app.repository.app.*;


public class obileServiceimpl implements MobileService {

	@Override
	public boolean validateAndSave() {
		System.out.println("invoking validateand save "+this.getClass().getSimpleName());
		String number;
		if(number!=null && ! number.isEmpty() && number.length()>=3 && number.length()<=20)
		{
			System.out.println("number is valid");
			this.mobileNoRepo.store(number);
			if(!this.mobileNoRepo.IsExist(number))
			{
			this.MobileNoRepo.store(number);
			return true;
			
			
		}
			else
			{
				System.out.println("Mobile "+number+"already exists add another one");
			}
		
			
			
			
		}
		else
		{
			System.out.println("number is invalid,cannot save");
		}
		
		return false;
	}

}

	

