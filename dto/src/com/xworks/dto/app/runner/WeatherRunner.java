package com.xworks.dto.app.runner;

import com.xworks.dto.app.WeatherDTO;
import com.xworks.dto.app.serviceimpl.WeatherService;

public class WeatherRunner {

	public static void main(String[] args) {
		WeatherRepository repository = new WeatherRepositoryImpl();

		WeatherService service = new WeatherService(repository);

		WeatherDTO dto = new WeatherDTO("Hot", 135, "Normal");

		WeatherDTO dto2 = new WeatherDTO(null, 0, null);

		WeatherDTO dto3 = new WeatherDTO("Cool", 120, null);

		WeatherDTO dto4 = new WeatherDTO("Normal", 122.3, "Strong");

		service.weatherValidate(dto);

		

	}


	}


