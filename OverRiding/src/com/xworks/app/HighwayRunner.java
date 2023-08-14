package com.xworks.app;

public class HighwayRunner {

		public static void main(String[] args) {

			System.out.println("invoking highway runner in main method");
			Highway highway=new NationalHighway();
			highway.connectivity();
			highway.interConnection();
			highway.economicGrowth();
			highway.publicService();
			
			highway.tourism();
			highway.trade();
			highway.transport();
			highway.travel();
			

		}
	}

		

