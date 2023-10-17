package OverRiding;

public class LocalRunner {
	System system = new System();
	System.out.println("Instance method");
	boolean ref = system.equals(system);
	System.out.println(ref);
	int ref1 = system.hashCode();
	System.out.println(ref1);
	String ref2 = system.toString();
	System.out.println(ref2);
	boolean ref3 = system.equals(ref2);
	System.out.println(ref3);
	int ref4 = system.hashCode();
	System.out.println(ref4);
	System.out.println("Static method");
	String ref5 = system.clearProperty(ref2);
	System.out.println(ref5);
	long ref6 = system.currentTimeMillis();
	System.out.println(ref6);
	String ref7 = system.getenv(ref2);
	System.out.println(ref7);
	String ref8 = system.getProperty(ref5);
	System.out.println(ref8);
	int ref9 = system.identityHashCode(args);
	System.out.println(ref9);
}
