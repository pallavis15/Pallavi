package com.xworks.app.dto1;

import java.io.Serializable;

public class EngineerDTO implements Serializable{ 
	private int id;
	private String name;
	private String CollegeName;
	 public EngineerDTO() {
		 
	 }
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", CollegeName=" + CollegeName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public EngineerDTO(int id, String name, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		CollegeName = collegeName;
	}

}
