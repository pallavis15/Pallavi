package com.xworks.app.runner;

public class Phonerunner {

	public static void main(String[] args) {
		
			PhoneRepositoryImp ref1=new PhoneRepositoryImp();
			PhoneServiceImp ref2=new PhoneServiceImp(ref1);
			PhoneDTO ref3=new PhoneDTO(55,56,88,"iphone","13ip","usa","apple","led","doulby","krish","20mp","dj","20megabyte","4g cum 5g","dualsim","moreThan u think","lighting cable","smooth","ios-13","limitless","BassLikefeel","smoothy","not mentioned","clear");
			ref2.validateAndsave(ref3);
			

		}



	}


