package OverRiding;

public class FirstclassTicket extends Ticket {
	@Override
	public void issue() {
		System.out.println("Invoking no arg constructor in BalconyTicket");
	}

}
