package com.xworks.app.repo;

public class Historicalimpl implements HistoricalRepo {
	private String[] pal = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void view(String placename) {
		this.pal[position]=placename;
		System.out.println("stored "+placename +"is in the position"+this.position);
		this.position++;
	
		
	}


}
