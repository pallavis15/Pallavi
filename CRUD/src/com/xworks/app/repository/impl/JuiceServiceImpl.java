package com.xworks.app.repository.impl;

import com.xworks.app.repo.JucieService;
import com.xworks.app.repo.JuiceRepo;

public class JuiceServiceImpl implements JucieService {
private JuiceRepo jucieRepo;
public JuiceServiceImpl(JuiceRepo juiceRepo) {
	this.jucieRepo= juiceRepo;
	
}
	@Override
	public boolean validateAndSave(String name) {
		System.out.println("invkoing validate and save"+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty( )&& name.length()>=3 && name.length()<20)
		{
			System.out.println("juice data is valid");
			if(!this.jucieRepo.IsExist(name))
			{
			this.jucieRepo.store(name);
			return true;
			
			
		}
			
			else
			{
				System.out.println("juice name"+name+"already exists add another one");
			}
		}
		
			
		else
		{
			System.err.println("juice name"+name+"is valid");
		}
		
		return false;
	}

	}

