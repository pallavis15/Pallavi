package com.xworks.app.repository.impl;

import com.xworks.app.repo.TrainNoService;

public class TrainNOServiceimpl implements TrainNoService {

	@Override
	public boolean validateAndSave(int number) {
		private int[] pincodes = new int[TOTAL_ITEMS];
		private int position;
			@Override
			public void Store(int number) {
			System.out.println("invoking mainin store in TrainNoRepositaryimpl ");
			if(position<TOTAL_ITEMS) {
				this.numbers[position] = number;
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
			if(temp!=null && temp.equals(number))

		return false;
	}

}
	}

