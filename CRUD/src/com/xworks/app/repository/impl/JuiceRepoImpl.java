package com.xworks.app.repository.impl;

import com.xworks.app.repo.JuiceRepo;

public class JuiceRepoImpl implements JuiceRepo {
private String[] juices= new String[TOTAL_ITEMS];
private int position;

	@Override
	public void store(String name) {
		System.out.println("invkoing main in JuiceRepoImpl");
		if(position < TOTAL_ITEMS ) {
		this.juices[position] = name;
		System.out.println("stored"+name+"is in Position"+this.position);
		this.position++;
		
		}
		else {
			System.out.println("storage is full");
			
		}
	

	}
	@Override
	public boolean IsExist(String name) {
		for(int index=0;index<=this.position;index++)
{
	String temp=this.juices[index];
	if(temp!=null && temp.equals(juices))

		
{
	System.out.println("juice is already exist");
	return true;
	
}
}
return JuiceRepo.super.IsExist(name);
			
		
	}

}
