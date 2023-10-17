package com.xworks.app.repositary.serivce.impl;

import com.xworks.app.repositary.JuiceRepositary;
import com.xworks.app.repositary.serivce.JuiceService;


public class JuiceServiceImpl implements JuiceService {
	private JuiceRepositary  juiceRepositary;
	

	@Override
	public boolean validateAndSave(String name) {
		System.out.println("inmvoking validate and save "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20);
		{
			System.out.println("juice data is valid");
			this.juiceRepositary.store(name);
		}
		}
		else {
			System.out.println("juice data is valid ,cannot save");
			
		}
		
		return false;
	}

}

