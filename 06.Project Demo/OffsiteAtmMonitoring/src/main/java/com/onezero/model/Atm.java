package com.onezero.model;

import org.springframework.stereotype.Component;

@Component
public class Atm {
	
	private String id;
	private String location;
	private String streetaddress;
	private String city;
	private String state;
	private String countrycode;
	
	public Atm(){}

	public Atm(String id, String location, String streetaddress, String city, String state, String countrycode) {
		super();
		this.id = id;
		this.location = location;
		this.streetaddress = streetaddress;
		this.city = city;
		this.state = state;
		this.countrycode = countrycode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	@Override
	public String toString() {
		return "Atm [id=" + id + ", location=" + location + ", streetaddress=" + streetaddress + ", city=" + city
				+ ", state=" + state + ", countrycode=" + countrycode + "]";
	};
	

}
