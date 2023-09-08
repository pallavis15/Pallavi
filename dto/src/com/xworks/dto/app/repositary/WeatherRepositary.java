package com.xworks.dto.app.repositary;

import com.xworks.dto.app.WeatherDTO;

public interface WeatherRepositary {
	
	

		int TOTAL_ITEMS = 5;

		void save(WeatherDTO dto);
	}


