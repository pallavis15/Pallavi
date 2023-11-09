package com.xworkz.app.dto2;

import java.util.ArrayList;
import java.util.Collection;

public class ActorName {

	public static void main(String[] args) {
		Collection<String> actor = new ArrayList();
		actor.add("yash");
		actor.add("Ranveer");
		actor.add("Sudeep");
		actor.add("Darshan");
		actor.add("ganesh");
		actor.add("prem");
		actor.add("puneeth");
		actor.add("akshaykumar");
		actor.add("Sadukokila");
		actor.add("Dhruva");
		System.out.println("Actors :"+actor.size());
		
		Collection<String> ActorName = new ArrayList();
		ActorName.add("vijya");
		ActorName.add("Rakshith");
		ActorName.add("Prajwal");
		boolean ref = actor .contains("yash");
		System.out.println("Contains :"+ref);
		
		boolean ref1 = actor.containsAll(ActorName);
		System.out.println("ContainsAll :"+ref1);
		
		Collection<String>removeActor = new ArrayList();
		removeActor.add("Ganesh");
		removeActor.add("Prajwal");
		
		boolean ref2 = actor.removeAll(ActorName);
		System.out.println("removeAll :"+ref2);
		
		
		
		
		
		
		
		
		

	}

}
