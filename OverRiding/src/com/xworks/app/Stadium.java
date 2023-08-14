package com.xworks.app;

public abstract class Stadium {
	public void type() {
		System.out.println("invoking type in Stadium");
		
	}
	public void players() {
		System.out.println("invoking plyers in Stadium");
	} 
	public void ground() {
		System.out.println("invoking ground in Stadium");
	}
	public void maintince() {
		System.out.println("invoking maintince in Stadium");
		
	}
	public void coach() {
		
			System.out.println("invoking coach in Stadium");
	}
	public  abstract void coat();
	public abstract void investment();
	public abstract void stay();
	public abstract void entry();
	public abstract void workingCondition();
}
