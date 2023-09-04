package com.xworks.app.repository.impl;
import com
public class jacketRepositoryimpl {
	private String[] typ = new String[TOTAL_ITEMS];
	private int position;
	@Override
	public void wear(String type) {
		if(position < TOTAL_ITEMS) {
			this.typ[position]=type;
			System.out.println("stored "+type +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("storage is full");
		}



