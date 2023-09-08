package com.xworks.dto.app.repositary;

import com.xworks.dto.app.WeatherDTO;

public class WeatherRepositaryImpl implements WeatherRepositary {

	private WeatherDTO[] dtos = new WeatherDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(WeatherDTO dto) {
		if (this.position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at index " + position);

			this.position++;
		} else {
			System.err.println("Out of range");
		}

	}

}
