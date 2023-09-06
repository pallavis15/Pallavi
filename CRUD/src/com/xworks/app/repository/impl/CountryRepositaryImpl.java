package com.xworks.app.repository.impl;

import com.xworks.app.repo.CountryRepositary;

public class CountryRepositaryImpl implements CountryRepositary {
	private String[] countries = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void travell(String name) {
		System.out.println("invkoing main in LocationRepoImpl");
		if(position < TOTAL_ITEMS ) {
		this.countries[position] = name;
		System.out.println("travell"+name+"is in Position"+this.position);
		this.position++;
		
		}
		else {
			System.out.println("cannot reached");
			
		}
	

	}

	}


