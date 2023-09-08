package com.xworks.dto.app;

import java.io.Serializable;

public class AadharDTO implements Serializable {
	private String name;
	private int number;
	private int born;
	private int adress;
	
	public AadharDTO() {
		
	}

	public AadharDTO(String name, int number, int born, int adress) {
		super();
		this.name = name;
		this.number = number;
		this.born = born;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBorn() {
		return born;
	}

	public void setBorn(int born) {
		this.born = born;
	}

	public int getAdress() {
		return adress;
	}

	public void setAdress(int adress) {
		this.adress = adress;
	}

}
