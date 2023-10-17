package com.xworks.app.repo;

public interface LocationRepo {
int TOTAL_ITEMS=5;
void Reach(String name);
default boolean IsExist(String name) {
		return false;

}
}
