package com.xworks.app.dto1.service.app;

import com.xworks.app.dto1.EngineerDTO;
import com.xworks.app.repositary.EngineerDTORepositary;

public class EngineerServiceImpl implements EngineerService {
	private EngineerDTORepositary engineerdtoRepositary;
	private int position;

	public EngineerServiceImpl(EngineerDTORepositary engineerDTORepositary) {
		this.engineerdtoRepositary = engineerdtoRepositary;
	}

	@Override
	public boolean validateAndSave(EngineerDTO dto, Object CollegeName) {
		System.out.println("invoking validate and save" + this.getClass().getName());
		if (dto != null) {
			System.out.println("Engineer data is valid" + this.position);
			int id = dto.getId();
			String name = dto.getName();
			String CollegeName = dto.getCollegeName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20)
				
			{

				System.out.println("Engineer" + dto.getName() + "is valid");

			}
		}

		else {
			System.out.println("name is in-valid");
			return false;

		}
		if (id > 0) {
			System.out.println("Engineer" + dto.getId() + "is valid");
			
		}
		else {
			System.out.println("id is invalid");
			
		}
		if (CollegeName != null && !CollegeName.is && CollegeName.length() >= 3 && CollegeName.length() <= 20)
			
{

		System.out.println("Engineer" + dto.getName() + "is valid");

	}


		this.engineerdtoRepositary.save(dto);

		return false;
	}
}
