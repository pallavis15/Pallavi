package com.xworks.dto.app.service;

import com.xworks.dto.app.DoctorDTO;

public class DoctorRunner {

	public static void main(String[] args) {
		DoctorRepository doctorRepository = new DoctorRepositoryImpl();

		DoctorService doctorService = new DoctorServiceImpl(doctorRepository);

		DoctorDTO doctorDTO = new DoctorDTO("Santhu", "Heart", 3, 100);

		DoctorDTO doctorDTO2 = new DoctorDTO(null, null, 0, 0);

		DoctorDTO doctorDTO3 = new DoctorDTO("Santosh", "Eye", 0, 0);

		DoctorDTO doctorDTO4 = new DoctorDTO(null, null, 2, 200);

		DoctorDTO doctorDTO5 = new DoctorDTO("Rathod", "Head", 5, 200);

		doctorService.saveAndValidate(doctorDTO);
		System.out.println();


	}

}
