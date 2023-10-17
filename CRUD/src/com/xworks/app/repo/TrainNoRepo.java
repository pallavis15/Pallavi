package com.xworks.app.repo;

public interface TrainNoRepo {
	int TOTAL_ITEMS=5;
	void Store(int number);
	default boolean IsExist(int number) {
		return false;

}
}