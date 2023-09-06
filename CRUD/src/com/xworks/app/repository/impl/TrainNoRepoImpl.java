package com.xworks.app.repository.impl;

import com.xworks.app.repo.TrainNoRepo;


public class TrainNoRepoImpl implements TrainNoRepo {
	private int[] numbers = new int[TOTAL_ITEMS];
	private int position;

	@Override
	public void Store(int number) {
		System.out.println("invkoing main in TrainNoRepoImpl");
		if(position < TOTAL_ITEMS ) {
		this.numbers[position] = number;
		System.out.println("reached"+number+"is in Position"+this.position);
		this.position++;
		
		}
		else {
			System.out.println("cannot stored");
			
		}
	

	}


	}


