package com.xworks.app;


	public abstract class Highway{
		public void transport()
		{
			System.out.println("iinvoking transport in highway");
		}
		public boolean travel()
		{
			System.out.println("iinvoking travel in highway");
			return true;
		}
		public boolean connectivity()
		{
			System.out.println("iinvoking connectivity in highway");
			return true;
		}
		public void trade()
		{
			System.out.println("iinvoking trade in highway");
		}
		public boolean tourism()
		{
			System.out.println("iinvoking tourism in highway");
			return true;
		}
		public abstract boolean urbenDevelopement();
		public abstract boolean publicService();
		public abstract boolean economicGrowth();
		public abstract boolean interConnection();
	
	}


