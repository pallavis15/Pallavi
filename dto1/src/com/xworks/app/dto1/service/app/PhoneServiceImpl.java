package com.xworks.app.dto1.service.app;

import com.xworks.app.dto1.PhoneDTO;
import com.xworks.app.repositary.PhoneRepositary;

public class PhoneServiceImpl implements PhoneService {

	
		
		PhoneRepositary repositary;
		
		public PhoneServiceImpl(PhoneRepositary repositary) {
			this.repositary=repositary;
			
		}
		
		public boolean   findByName(String name) {
			if(name!=null) {
				repositary.findByname(name);
				System.out.println("///////////////////");
				return true;
			}
			return false;
		}
		
		public boolean findBynameAndlocation(String name,String location) {
			if(name!=null && location!=null) {
				repositary.findBynameAndlocation(name, location);
				System.out.println("/////////////////////");
				return true;
			}
			return false;
		}
		public boolean validateAndsave1(PhoneDTO dto) {
			if(dto!=null) {
				boolean reff=repositary.equals(dto);
				String name=dto.getName();
				int cost=dto.getCost();
				int batteryHealth=dto.getBatteryHealth();
				int noOfApps=dto.getNoOfApps();
				String model=dto.getModel();
				String location=dto.getLocation();
				String production=dto.getProduction();
				String screenType=dto.getScreenType();
				String speaker=dto.getSpeaker();
				String holderName=dto.getHolderName();
				String camera=dto.getCamera();
				String soundType=dto.getSoundType();
				String speed=dto.getSpeed();
				String networkType=dto.getNetworkType();
				String noOfsim=dto.getNoOfsim();
				String charging=dto.getCharging();
				String chargingType=dto.getChargingType();
				String KeyBoardtype=dto.getKeyBoardtype();
				String osType=dto.getOsType();
				String volumeRange=dto.getVolumeRange();
				String micQuality=dto.getMicQuality();
				String buttonType=dto.getButtonType();
				String fingerPrinttype=dto.getFingerPrinttype();
				String ui=dto.getUi();
				if(!reff) {
					if(name!=null && !name.isEmpty()) {
						System.out.println("it is valid to store name");
					}
					if(model!=null && !model.isEmpty()) {
						System.out.println("it is valid to store model");
						
					}
					if(location!=null && !location.isEmpty()) {
						System.out.println("it can store the location");
					}
					if(production!=null && !production.isEmpty()) {
						System.out.println("it can Store production");
					}
					if(screenType!=null && !screenType.isEmpty()) {
						System.out.println("it can Store the screenType");
					}
					if(speaker!=null && !speaker.isEmpty()) {
						System.out.println("it can store the speaker");
					}
					if(holderName!=null && !holderName.isEmpty()) {
						System.out.println("it can store holderName");
					}
					if(camera!=null && !camera.isEmpty()) {
						System.out.println("it can store the camera");
					}
					if(soundType!=null && !soundType.isEmpty()) {
						System.out.println("it can store the soundType");
					}
					if(speed!=null && !speed.isEmpty()) {
						System.out.println("it can store the speed");
					}
					if(networkType!=null && !networkType.isEmpty()) {
						System.out.println("it can store the netWorkType");
					}
					if(noOfsim!=null && !noOfsim.isEmpty()) {
						System.out.println("it can store the noOfsim");
					}
					if(charging!=null && !charging.isBlank()) {
						System.out.println("it can store the charging");
					}
					if(chargingType!=null && !chargingType.isEmpty()) {
						System.out.println("it can store the ChargingType");
					}
					if(KeyBoardtype!=null && !KeyBoardtype.isBlank()) {
						System.out.println("it can store the KeyBoardtype");
					}
					if(osType!=null && !osType.isEmpty()) {
						System.out.println("it can store the osType");
					}
					if(volumeRange!=null && !volumeRange.isEmpty()) {
						System.out.println("it can store the volumeRange");
					}
					if(micQuality!=null && !micQuality.isEmpty()) {
						System.out.println("it can store the micQuality");
					}
					if(buttonType!=null && !buttonType.isEmpty()) {
						System.out.println("it can store the buttonType");
					}
					if(fingerPrinttype!=null && !fingerPrinttype.isEmpty()) {
						System.out.println("it can store the fingerPrinttype");
					}
					if(ui!=null && !ui.isEmpty()) {
						System.out.println("it can store the ui");
					}
					if(cost!=0) {
						System.out.println("it is valid to store the cost");
					}
					if(batteryHealth!=0) {
						System.out.println("it can store the batteryHealth");
						
					}
					if(noOfApps!=0) {
						System.out.println("it can store the noOfApps");
					}
					repositary.save(dto);
					
					return true;
					
				}
			}
			return false;
			
		}
		public boolean findAll() {
			System.out.print(repositary.findAll());
			return true;
		}

		@Override
		public boolean validateAndsave(PhoneDTO dto) {
			
			return false;
		}
		
		
		

	}



