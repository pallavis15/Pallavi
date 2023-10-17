package com.xworks.app.repository.app;

import com.xworks.app.repository.impl.JuiceRepoImpl;

public class JuiceRunner {

	public static void main(String[] args) {
	JuiceRepo juiceRepo = new JuiceRepoImpl();
	JucieService juiceService = new JuiceSerivceImpl(juiceRepo);
	jucieSerivce.validateAndSave("fonta is juice");
	

	}

}
