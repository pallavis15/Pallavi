package com.xworks.dto.app;

import java.io.Serializable;

public class NewsPaparDTO implements Serializable {
 private String name;
 private Double cost;
 private String publisher;
 private String language;
 
 public NewsPaparDTO() {
	 
 }

public NewsPaparDTO(String name, Double cost, String publisher, String language) {
	super();
	this.name = name;
	this.cost = cost;
	this.publisher = publisher;
	this.language = language;
}

public String getName() {
	return name;
}

@Override
public String toString() {
	return "NewsPaparDTO [name=" + name + ", cost=" + cost + ", publisher=" + publisher + ", language=" + language
			+ "]";
}

public void setName(String name) {
	this.name = name;
}

public Double getCost() {
	return cost;
}

public void setCost(Double cost) {
	this.cost = cost;
}

public String getPublisher() {
	return publisher;
}

public void setPublisher(String publisher) {
	this.publisher = publisher;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}
}
