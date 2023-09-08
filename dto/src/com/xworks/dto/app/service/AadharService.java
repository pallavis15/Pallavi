package com.xworks.dto.app.service;


import com.xworks.dto.app.AadharDTO;
import com.xworks.dto.app.serviceimpl.*;

public interface AadharService {
	boolean validateAndSave(AadharDTO dto);

}
