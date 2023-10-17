package com.xworks.app.repo;

public interface MobileNoRepo {
	int TOTAL_ITEMS=5;
	void store(long number);
	default boolean IsExist(int number) {
	return false;

}
}
