package com.xworks.app.repositary;

import com.xworks.app.dto1.EngineerDTO;


public interface EngineerDTORepositary {
	int TOTAL_ITEMS=5;
	void save(EngineerDTO dto);

	default boolean IsExist(EngineerDTO dto) {
		return false;

}
}