package com.xworks.app.repository.app;
import com.xworks.app.repository.impl.*;
import com.xworks.app.repo.LocationService;
import com.xworks.app.repo.LocationRepo;




public class LocationRunner {

	public static void main(String[] args) {
		LocationRepo locationRepo = new LocationRepoimpl();
		LocationService locationService = new LocationServiceimpl(locationRepo);
        
		locationService.validateAndSave("shimogga");
		locationService.validateAndSave("shimogga");
		
		
		
		

	}

}
