package com.xworks.app.repository.app;

import com.xworks.app.repository.impl.groceryimpl;

public class GroceryRunner {

	public static void main(String[] args) {
		groceryimpl ref= new groceryimpl();
        ref.save("sugar");
        ref.save("noodels");
        ref.save("chocalte");
        ref.save("juice");
        ref.save("chips");
        ref.save("milk");
        ref.save("veggies");
        ref.save("chiken");
        ref.save("fish");
        ref.save("egg");
	}

}
