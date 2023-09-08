package com.xworks.dto.app;

import java.io.Serializable;

public class PrinterDTO implements Serializable{
	private String name;
	private Double cost;
	private String Brand;
	private int varrenty;
	public PrinterDTO() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PrinterDTO [name=" + name + ", cost=" + cost + ", Brand=" + Brand + ", varrenty=" + varrenty + "]";
	}
	public PrinterDTO(String name, Double cost, String brand, int varrenty) {
		super();
		this.name = name;
		this.cost = cost;
		Brand = brand;
		this.varrenty = varrenty;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getVarrenty() {
		return varrenty;
	}
	public void setVarrenty(int varrenty) {
		this.varrenty = varrenty;
	}

}
