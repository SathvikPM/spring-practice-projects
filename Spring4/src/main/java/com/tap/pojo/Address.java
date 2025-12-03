package com.tap.pojo;

public class Address {
 
	  int laneNo;
	  String city;
	  String State;
	  String Country;
	  
	  public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getLaneNo() {
		return laneNo;
	}

	public void setLaneNo(int laneNo) {
		this.laneNo = laneNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Address(int laneNo, String city, String state, String country) {
		super();
		this.laneNo = laneNo;
		this.city = city;
		State = state;
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [laneNo=" + laneNo + ", city=" + city + ", State=" + State + ", Country=" + Country + "]";
	}
	  
}
