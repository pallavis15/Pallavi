package com.xworks.app.repository.app;

import com.xworks.app.repo.MobileNoRepo;
import com.xworks.app.repo.MobileService;
import com.xworks.app.repository.impl.MobileNoRepoimpl;

public class MobileRunner {

	public static void main(String[] args) {
		MobileNoRepo mobileNoRepo = new MobileNoRepoimpl();
		MobileService mobileService = new MobileServiceimpl(mobileNoRepo);
		mobileService.validateAndSave("2345678909");
	}

}
