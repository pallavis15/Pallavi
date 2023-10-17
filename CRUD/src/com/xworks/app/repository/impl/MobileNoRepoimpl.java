package com.xworks.app.repository.impl;

import com.xworks.app.repo.MobileNoRepo;
import com.xworks.app.repo.PincodeRepositary;

public class MobileNoRepoimpl implements MobileNoRepo {
	
	private int mobiles = new long[TOTAL_ITEMS];
	private int position;

	@Override
	public void store(long number) {
		
			System.out.println("invoking mainin store in PincodeRepositaryimpl ");
			if(position<TOTAL_ITEMS) {
				this.mobiles[position] = number;
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
		long temp=mobiles[index];
		if(temp =null && temp==mobiles)

			
	{
		System.out.println("juice is already exist");
		return true;
		
	}
	}
	return mobileNoRepo.super.IsExist(number);

	}
	
	
	
	



	}


