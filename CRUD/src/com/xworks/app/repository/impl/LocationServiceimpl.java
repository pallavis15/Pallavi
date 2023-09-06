package com.xworks.app.repository.impl;


import com.xworks.app.repo.LocationRepo;
import com.xworks.app.repo.LocationService;

public class LocationServiceimpl implements LocationService {
	private LocationRepo locationRepo;
	public  LocationServiceimpl(LocationRepo locationRepo) {
		this.locationRepo = locationRepo;
	}

	@Override
	public boolean validateAndSave(String name) {
		System.out.println("invkoing validate and save"+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty( )&& name.length()>=3 && name.length()<20)
		{
			System.out.println("juice data is valid");
			if(!this.locationRepo.IsExist(name))
			{
			this.locationRepo.Reach(name);
			return true;
			
			
		}
			
			else
			{
				System.out.println("location name"+name+"already exists add another one");
			}
		}
		else
		{
			System.err.println("Location name"+name+"is valid");
		}
		
		return false;
	}

}
