package com.xworks.app.repository.impl;
import com.xworks.app.repository.impl.*;
public class Mediciniimpl implements Medicine {
	private int TOTAL_ITEMS;
	private String[] nam = new String[TOTAL_ITEMS];
	private int position;
	
	public void cure(String name) {
		if(position < TOTAL_ITEMS) {
			this.nam[position]=name;
			System.out.println("stored "+name +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("storage is full");
		}
				
	}
	

}
