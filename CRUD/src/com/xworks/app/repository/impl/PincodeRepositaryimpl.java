package com.xworks.app.repository.impl;

import com.xworks.app.repo.PincodeRepositary;

public class PincodeRepositaryimpl implements PincodeRepositary {
private int[] pincodes = new int[TOTAL_ITEMS];
private int position;
	@Override
	public void store(int number) {
	System.out.println("invoking mainin store in PincodeRepositaryimpl ");
	if(position<TOTAL_ITEMS) {
		this.pincodes[position] = number;
		System.out.println("sotred"+number+"is in position"+this.position);
		this.position++;
		
		
		
	}
	else {
		System.out.println("storage is full");
		
	}

	}
	@Override
	public boolean IsExist(int number) {
		for(int index=0;index<=this.position;index++)
{
	int temp=this.pincodes[index];
	if(temp!=null && temp.equals(pincodes))

		
{
	System.out.println("juice is already exist");
	return true;
	
}
}
return PincodeRepositary.super.IsExist(number);

}
}
