package com.xworks.app.dto1;

public class PhoneDTO {
	private int cost;
	private int batteryHealth;
	private int noOfApps;
	private String name;
	private String model;
	private String location;
	private String production;
	private String screenType;
	private String speaker;
	private String holderName;
	private String camera;
	private String soundType;
	private String speed;
	private String networkType;
	private String noOfsim;
	private String charging;
	private String chargingType;
	private String KeyBoardtype;
	private String osType;
	private String volumeRange;
	private String micQuality;
	private String buttonType;
	private String fingerPrinttype;
	private String ui;
	public PhoneDTO() {

}
	@Override
	public String toString() {
		return "PhoneDTO [cost=" + cost + ", batteryHealth=" + batteryHealth + ", noOfApps=" + noOfApps + ", name="
				+ name + ", model=" + model + ", location=" + location + ", production=" + production + ", screenType="
				+ screenType + ", speaker=" + speaker + ", holderName=" + holderName + ", camera=" + camera
				+ ", soundType=" + soundType + ", speed=" + speed + ", networkType=" + networkType + ", noOfsim="
				+ noOfsim + ", charging=" + charging + ", chargingType=" + chargingType + ", KeyBoardtype="
				+ KeyBoardtype + ", osType=" + osType + ", volumeRange=" + volumeRange + ", micQuality=" + micQuality
				+ ", buttonType=" + buttonType + ", fingerPrinttype=" + fingerPrinttype + ", ui=" + ui + "]";
	}
	public PhoneDTO(int cost, int batteryHealth, int noOfApps, String name, String model, String location,
			String production, String screenType, String speaker, String holderName, String camera, String soundType,
			String speed, String networkType, String noOfsim, String charging, String chargingType, String keyBoardtype,
			String osType, String volumeRange, String micQuality, String buttonType, String fingerPrinttype,
			String ui) {
		super();
		this.cost = cost;
		this.batteryHealth = batteryHealth;
		this.noOfApps = noOfApps;
		this.name = name;
		this.model = model;
		this.location = location;
		this.production = production;
		this.screenType = screenType;
		this.speaker = speaker;
		this.holderName = holderName;
		this.camera = camera;
		this.soundType = soundType;
		this.speed = speed;
		this.networkType = networkType;
		this.noOfsim = noOfsim;
		this.charging = charging;
		this.chargingType = chargingType;
		KeyBoardtype = keyBoardtype;
		this.osType = osType;
		this.volumeRange = volumeRange;
		this.micQuality = micQuality;
		this.buttonType = buttonType;
		this.fingerPrinttype = fingerPrinttype;
		this.ui = ui;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getBatteryHealth() {
		return batteryHealth;
	}
	public void setBatteryHealth(int batteryHealth) {
		this.batteryHealth = batteryHealth;
	}
	public int getNoOfApps() {
		return noOfApps;
	}
	public void setNoOfApps(int noOfApps) {
		this.noOfApps = noOfApps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getSoundType() {
		return soundType;
	}
	public void setSoundType(String soundType) {
		this.soundType = soundType;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getNetworkType() {
		return networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	public String getNoOfsim() {
		return noOfsim;
	}
	public void setNoOfsim(String noOfsim) {
		this.noOfsim = noOfsim;
	}
	public String getCharging() {
		return charging;
	}
	public void setCharging(String charging) {
		this.charging = charging;
	}
	public String getChargingType() {
		return chargingType;
	}
	public void setChargingType(String chargingType) {
		this.chargingType = chargingType;
	}
	public String getKeyBoardtype() {
		return KeyBoardtype;
	}
	public void setKeyBoardtype(String keyBoardtype) {
		KeyBoardtype = keyBoardtype;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public String getVolumeRange() {
		return volumeRange;
	}
	public void setVolumeRange(String volumeRange) {
		this.volumeRange = volumeRange;
	}
	public String getMicQuality() {
		return micQuality;
	}
	public void setMicQuality(String micQuality) {
		this.micQuality = micQuality;
	}
	public String getButtonType() {
		return buttonType;
	}
	public void setButtonType(String buttonType) {
		this.buttonType = buttonType;
	}
	public String getFingerPrinttype() {
		return fingerPrinttype;
	}
	public void setFingerPrinttype(String fingerPrinttype) {
		this.fingerPrinttype = fingerPrinttype;
	}
	public String getUi() {
		return ui;
	}
	public void setUi(String ui) {
		this.ui = ui;
	}
}