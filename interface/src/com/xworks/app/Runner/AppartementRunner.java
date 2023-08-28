package com.xworks.app.Runner;
import com.xworks.app.BuildAppartmentRule;
import com.xworks.app.CommonAppartementRule;
import com.xworks.app.PurchaseAppartmentRule;
import com.xworks.app.PrestigeAppartementRule;

public class AppartementRunner {

	public static void main(String[] args) {
		PrestigeAppartementRule rule=new PrestigeAppartementRule();
		PurchaseAppartmentRule rule1=new PrestigeAppartementRule();
		CommonAppartementRule rule3=new PrestigeAppartementRule();
		BuildAppartmentRule rule4=new PrestigeAppartementRule();
		
		rule1.construct();
		rule.construct();
		rule3.construct();
		rule4.construct();


	}

}
