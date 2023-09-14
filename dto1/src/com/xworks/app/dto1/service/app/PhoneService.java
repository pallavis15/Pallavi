package com.xworks.app.dto1.service.app;

import com.xworks.app.dto1.PhoneDTO;

public interface PhoneService {
	public boolean validateAndsave(PhoneDTO dto);
	public boolean  findByName(String name);
	public boolean findBynameAndlocation(String name,String location);
	public boolean findAll();

}
