package com.onezero.model;

import java.util.Date;

public class Survey {

	private String machineScreenCondition;
	private String machineKeyboardCondition;
	private String machineFaciaCondition;
	private String machineBodyCondition;
	private String cubicleOutterAppearance;
	private String cubicleInnerAppearance;
	private String cubicleWaterleakage;
	private String brandingSignboardAppearance;
	private String brandingInsideCubicle;
	private String lightingSignboardAppearance;
	private String lightingInsideCubicle;
	private String ventilation;
	private String atmStatus;
	private String otherComments;
	private String atmImage;
	private Date inspectedDate;
	private User user;
	private Atm atm;
	private String gpslocation;

	public Survey() {
		super();
	}



	public Survey(String machineScreenCondition, String machineKeyboardCondition, String machineFaciaCondition,
			String machineBodyCondition, String cubicleOutterAppearance, String cubicleInnerAppearance,
			String cubicleWaterleakage, String brandingSignboardAppearance, String brandingInsideCubicle,
			String lightingSignboardAppearance, String lightingInsideCubicle, String ventilation, String atmStatus,
			String otherComments, String atmImage, Date inspectedDate, User user, Atm atm, String gpslocation) {
		super();
		this.machineScreenCondition = machineScreenCondition;
		this.machineKeyboardCondition = machineKeyboardCondition;
		this.machineFaciaCondition = machineFaciaCondition;
		this.machineBodyCondition = machineBodyCondition;
		this.cubicleOutterAppearance = cubicleOutterAppearance;
		this.cubicleInnerAppearance = cubicleInnerAppearance;
		this.cubicleWaterleakage = cubicleWaterleakage;
		this.brandingSignboardAppearance = brandingSignboardAppearance;
		this.brandingInsideCubicle = brandingInsideCubicle;
		this.lightingSignboardAppearance = lightingSignboardAppearance;
		this.lightingInsideCubicle = lightingInsideCubicle;
		this.ventilation = ventilation;
		this.atmStatus = atmStatus;
		this.otherComments = otherComments;
		this.atmImage = atmImage;
		this.inspectedDate = inspectedDate;
		this.user = user;
		this.atm = atm;
		this.gpslocation = gpslocation;
	}



	public String getMachineScreenCondition() {
		return machineScreenCondition;
	}

	public void setMachineScreenCondition(String machineScreenCondition) {
		this.machineScreenCondition = machineScreenCondition;
	}

	public String getMachineKeyboardCondition() {
		return machineKeyboardCondition;
	}

	public void setMachineKeyboardCondition(String machineKeyboardCondition) {
		this.machineKeyboardCondition = machineKeyboardCondition;
	}

	public String getMachineFaciaCondition() {
		return machineFaciaCondition;
	}

	public void setMachineFaciaCondition(String machineFaciaCondition) {
		this.machineFaciaCondition = machineFaciaCondition;
	}

	public String getMachineBodyCondition() {
		return machineBodyCondition;
	}

	public void setMachineBodyCondition(String machineBodyCondition) {
		this.machineBodyCondition = machineBodyCondition;
	}

	public String getCubicleOutterAppearance() {
		return cubicleOutterAppearance;
	}

	public void setCubicleOutterAppearance(String cubicleOutterAppearance) {
		this.cubicleOutterAppearance = cubicleOutterAppearance;
	}

	public String getCubicleInnerAppearance() {
		return cubicleInnerAppearance;
	}

	public void setCubicleInnerAppearance(String cubicleInnerAppearance) {
		this.cubicleInnerAppearance = cubicleInnerAppearance;
	}

	public String getCubicleWaterleakage() {
		return cubicleWaterleakage;
	}

	public void setCubicleWaterleakage(String cubicleWaterleakage) {
		this.cubicleWaterleakage = cubicleWaterleakage;
	}

	public String getBrandingSignboardAppearance() {
		return brandingSignboardAppearance;
	}

	public void setBrandingSignboardAppearance(String brandingSignboardAppearance) {
		this.brandingSignboardAppearance = brandingSignboardAppearance;
	}

	public String getBrandingInsideCubicle() {
		return brandingInsideCubicle;
	}

	public void setBrandingInsideCubicle(String brandingInsideCubicle) {
		this.brandingInsideCubicle = brandingInsideCubicle;
	}

	public String getLightingSignboardAppearance() {
		return lightingSignboardAppearance;
	}

	public void setLightingSignboardAppearance(String lightingSignboardAppearance) {
		this.lightingSignboardAppearance = lightingSignboardAppearance;
	}

	public String getLightingInsideCubicle() {
		return lightingInsideCubicle;
	}

	public void setLightingInsideCubicle(String lightingInsideCubicle) {
		this.lightingInsideCubicle = lightingInsideCubicle;
	}

	public String getVentilation() {
		return ventilation;
	}

	public void setVentilation(String ventilation) {
		this.ventilation = ventilation;
	}

	public String getAtmStatus() {
		return atmStatus;
	}

	public void setAtmStatus(String atmStatus) {
		this.atmStatus = atmStatus;
	}

	public String getOtherComments() {
		return otherComments;
	}

	public void setOtherComments(String otherComments) {
		this.otherComments = otherComments;
	}

	public String getAtmImage() {
		return atmImage;
	}

	public void setAtmImage(String atmImage) {
		this.atmImage = atmImage;
	}

	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Atm getAtm() {
		return atm;
	}



	public void setAtm(Atm atm) {
		this.atm = atm;
	}



	public Date getInspectedDate() {
		return inspectedDate;
	}

	public void setInspectedDate(Date inspectedDate) {
		this.inspectedDate = inspectedDate;
	}

	public String getGpslocation() {
		return gpslocation;
	}



	public void setGpslocation(String gpslocation) {
		this.gpslocation = gpslocation;
	}



	@Override
	public String toString() {
		return "Survey [machineScreenCondition=" + machineScreenCondition + ", machineKeyboardCondition="
				+ machineKeyboardCondition + ", machineFaciaCondition=" + machineFaciaCondition
				+ ", machineBodyCondition=" + machineBodyCondition + ", cubicleOutterAppearance="
				+ cubicleOutterAppearance + ", cubicleInnerAppearance=" + cubicleInnerAppearance
				+ ", cubicleWaterleakage=" + cubicleWaterleakage + ", brandingSignboardAppearance="
				+ brandingSignboardAppearance + ", brandingInsideCubicle=" + brandingInsideCubicle
				+ ", lightingSignboardAppearance=" + lightingSignboardAppearance + ", lightingInsideCubicle="
				+ lightingInsideCubicle + ", ventilation=" + ventilation + ", atmStatus=" + atmStatus
				+ ", otherComments=" + otherComments + ", atmImage=" + atmImage + ", inspectedDate=" + inspectedDate
				+ ", user=" + user + ", atm=" + atm + ", gpslocation=" + gpslocation + "]";
	}

	

}
