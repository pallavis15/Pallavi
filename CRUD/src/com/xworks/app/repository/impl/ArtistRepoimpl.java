package com.xworks.app.repository.impl;

import com.xworks.app.repo.ArtistRepo;

public class ArtistRepoimpl implements ArtistRepo {
	

		private String[] paint = new String[TOTAL_ITEMS];
		private int position;
		
		public void paint(String paintingName) {
			if(position < TOTAL_ITEMS) {
				this.paint[position]=paintingName;
				System.out.println("stored "+paintingName +"is in the position"+this.position);
				this.position++;
			}else {
				System.err.println("storage is full");
			}
			
		}

		
	}


