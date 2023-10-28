package com.xworkz.app.dto2;

import java.io.Serializable;
import java.time.LocalDate;

public class ApplicationDTO implements  Serializable {
	private String name;
    private String version;
    private String companyName;
    private double rating;
    private LocalDate createdate;
	
	public ApplicationDTO() {
		
		
	}

	public LocalDate getCreatedate() {
		return createdate;
	}

	public void setCreatedate(LocalDate createdate) {
		this.createdate = createdate;
	}

	public ApplicationDTO(LocalDate createdate) {
		super();
		this.createdate = createdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ApplicationDTO(String name, String version, String companyName, double rating, LocalDate createdate) {
		super();
		this.name = name;
		this.version = version;
		this.companyName = companyName;
		this.rating = rating;
		this.createdate = createdate;
	}

	

}

