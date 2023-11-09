package com.xworkz.app.dto2;

import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.app.dto.IceCreamDTO;

public class IceCreamRunner {

	public static void main(String[] args) {
		
    IceCreamDTO c = new  IceCreamDTO ("Chocalte",200,"cone","Brown");
    IceCreamDTO c1 = new  IceCreamDTO ("Vinella",200,"cup","white");
    IceCreamDTO c2 = new  IceCreamDTO ("Storberry",100,"candy","pink");
    IceCreamDTO c3= new  IceCreamDTO ("chocobar",500,"candy","Brown");
    IceCreamDTO c4= new  IceCreamDTO ("Chocalte",200,"cone","Brown");
    Stream.of(c,c1,c2,c3,c4).sorted().forEach(ref ->System.out.println(ref));
    System.out.println("_____________________________________________________");
    Comparator<IceCreamDTO> ice=(p,k)->{
    	return p.getColor().compareTo(k.getColor());
    	
    	
    	
    };
    Stream.of(c,c1,c2,c3,c4).sorted(ice).forEach(ref ->System.out.println(ref));
    System.out.println("_____________________________________________________");
    Comparator<IceCreamDTO> priceComprator=(p1,k1)->k1.getPrice().compareTo(null)
	
	

}
