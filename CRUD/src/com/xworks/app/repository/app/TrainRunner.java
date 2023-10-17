package com.xworks.app.repository.app;
import com.xworks.app.repository.impl.*;
import com.xworks.app.repository.impl.TrainNOServiceimpl;
import com.xworks.app.repository.impl.TrainNoRepoImpl;
import com.xworks.app.repo.*;
import com.xworks.app.repository.app.*;

public class TrainRunner {

	public static void main(String[] args) {
		TrainNoRepo trainNoRepo = new TrainNoRepoimpl();
		TrainNoService trainNoService = new TrainNoServiceimpl(trainNoRepo);
		trainNoRepo.validateAndStore("123457");

	}

}
