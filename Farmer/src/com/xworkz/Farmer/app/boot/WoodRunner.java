package com.xworkz.Farmer.app.boot;
import com.xworkz.Farmer.app.Paper;
import com.xworkz.Farmer.app.Wood;
import com.xworkz.Farmer.app.boot.*;
public class WoodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in WoodRunner");
		double price=5000;
		Paper paper=new Paper();
		Wood wood =new Wood(price);
		wood.setWood(paper);
		wood.polish();


	}

}
