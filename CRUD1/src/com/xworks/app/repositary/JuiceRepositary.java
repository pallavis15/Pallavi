package com.xworks.app.repositary;

public interface JuiceRepositary {
	int TOTAL_ITEMS = 5;

	void store(String name);

	default boolean IsExit(String name) {
		return false;
	}

}
