package com.test.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


public class Student {

@Max(value=30,message="Maximum age Should be 30")	
private int maxage;

@Min(value=20 , message="Minimum age Should be 20")
private int minage;


public int getMinage() {
	return minage;
}

public void setMinage(int minage) {
	this.minage = minage;
}

public int getMaxage() {
	return maxage;
}

public void setMaxage(int maxage) {
	this.maxage = maxage;
}

}
