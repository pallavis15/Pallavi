package com.xworks.app.repositary.runner;

import com.xworks.app.repositary.JuiceRepositary;
import com.xworks.app.repositary.impl.JuiceImpl;
import com.xworks.app.repositary.serivce.JuiceService;
import com.xworks.app.repositary.serivce.impl.JuiceServiceImpl;

public class JuiceRunner {

	public static void main(String[] args) {
		JuiceRepositary juiceRepositary = new JuiceImpl();
		JuiceService juiceService = new JuiceServiceImpl(juiceRepositary);
		juiceService.validateAndSave("apple");
		juiceService.validateAndSave("slice");
		
		
		
		

	}

}
