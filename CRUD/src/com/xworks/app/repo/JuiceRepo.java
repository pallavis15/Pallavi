package com.xworks.app.repo;

public interface JuiceRepo {
	int TOTAL_ITEMS=5;
	void store (String name);
	 default boolean IsExist(String name) {
		return false;
	

}
	
	
}
