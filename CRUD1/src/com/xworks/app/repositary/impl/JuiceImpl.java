package com.xworks.app.repositary.impl;

import com.xworks.app.repositary.JuiceRepositary;

public class JuiceImpl implements JuiceRepositary {
	private String[] juices = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void store(String name) {
		System.out.println("invkoing main save in JuiceRepositaryImpl");
		if(position < TOTAL_ITEMS) {
		this.juices[position] = name;
		System.out.println("stored"+name+"is in position"+this.position);
		this.position++;
		}
		else {
			System.out.println("storage in full");
			
		}
	
}


	
	

	@Override
	public boolean IsExist(String name) {
		for(int index=0;index<=this.position;index++)
		
		{
		String temp=this.juices[index];	
		if((temp!=null && temp.equals(name))
				{
			System.out.println("juice already exits");
			return true;
			
			
				}
	
	
}
		return JuiceRepositary.super.IsExit(name);
	}
}

		
	


