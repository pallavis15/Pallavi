package com.xworks.app.repo;

public interface CountryRepositary {
	int TOTAL_ITEMS=5;
	void travell(String name);
	 default boolean IsExist(String name) {
			return false;
	

}
}
