package com.xworks.app.repository.impl;

import com.xworks.app.repo.CountryService; 
import com.xworks.app.repository.app.*;

public class CountryServiceimpl implements CountryService {

	

	private Object name;

	@Override
	public boolean validateAndSave() {
		System.out.println("invkoing validate and save"+this.getClass().getSimpleName());
		if(name!=null && !name.IsEmpty( )&& name.length()>=3 && name.length()<20)
		{
			System.out.println("juice data is valid");
			if(!this.countryRepositary.IsExist(name))
			{
			this.countryRepositary.travell(name);
			return false;
			
			
		}
			
			else
			{
				System.out.println("country name"+name+"already exists add another one");
			}
		}
		



		{
			System.err.println("juice name"+name+"is valid");
		}
		
		return false;
	}

	


	
}
