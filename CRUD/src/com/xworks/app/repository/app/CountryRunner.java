package com.xworks.app.repository.app;

import com.xworks.app.repo.CountryRepositary;
import com.xworks.app.repo.CountryService;
import com.xworks.app.repository.impl.CountryRepositaryImpl;
import com.xworks.app.repository.impl.CountryServiceimpl;

public class CountryRunner {

	public static void main(String[] args) {
		
    CountryRepositary countryRepositary = new CountryRepositaryImpl();
    CountryService countryService = new CountryServiceimpl();
    countryService.validateAndSave();
	}

}
