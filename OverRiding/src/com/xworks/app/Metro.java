package com.xworks.app;



	public abstract class Metro {
		public  boolean moving()
		{
			System.out.println("invoking move in metro");
			return true;
		}
		public boolean transport(){
			System.out.println("invoking transport in metro");
			return true;
		}
		public boolean isProvideTravel() {
			System.out.println("invoking travel in Metro");
			return true;
		}
		public boolean isQuickReach() {
			System.out.println("invoking QuickReach in metro ");
			return true;
		}
		public boolean isTraficless()
		{
			System.out.println("invoking Traficless journey in metro");
			return true;
		}
		public abstract boolean stop();
		public abstract boolean reduceNoOfVehicle();
		public abstract boolean connectivity();
		public abstract boolean lessTime();
        public abstract boolean secure();
		
	}



