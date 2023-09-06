package com.xworks.app.repository.impl;

import com.xworks.app.repo.LocationRepo;

public class LocationRepoimpl implements LocationRepo {
private String[] locations = new String[TOTAL_ITEMS];
private int position;

	@Override
	public void Reach(String name) {
		System.out.println("invkoing main in LocationRepoImpl");
		if(position < TOTAL_ITEMS ) {
		this.locations[position] = name;
		System.out.println("reached"+name+"is in Position"+this.position);
		this.position++;
		
		}
		else {
			System.out.println("cannot reached");
			
		}
	

	}

}
