package com.xworks.app.repository.impl;
import com.xworks.app.repository.impl.*;

public class PolictianRepositoryimpl implements PoliticanRepository
{
	private String[] des = new String[TOTAL_ITEMS];
	private int position;
	public void help(String designation) {

		if(position < TOTAL_ITEMS) {
			this.des[position]=designation;
			System.out.println("stored "+designation +"is in the position"+this.position);
			this.position++;
		}else {
			System.err.println("storage is full");
		}
	}
}


