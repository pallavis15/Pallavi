package com.xworks.dto.app.repositary;

import com.xworks.dto.app.DoctorDTO;

public interface DoctorRepositary {
	int TOTAL_ITEMS=5;
	void save(DoctorDTO dto);
}
