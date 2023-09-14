package com.xworks.app.repositary;

import com.xworks.app.dto1.PhoneDTO;

public interface PhoneRepositary {
	public void save(PhoneDTO dto);
	public boolean isExist(PhoneDTO dto);
	public PhoneDTO findByname(String name);
	public PhoneDTO findBynameAndlocation(String name,String location);
	public MobileDTO findAll();

}
