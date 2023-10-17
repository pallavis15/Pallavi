package com.xworks.app.repo;

public interface PincodeRepositary {
int TOTAL_ITEMS=5;
void store(int number);
default boolean IsExist(int number) {
	return false;
}
}
