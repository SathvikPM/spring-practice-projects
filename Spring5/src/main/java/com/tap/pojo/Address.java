package com.tap.pojo;

public class Address {
	
	private int lno;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int lno, String city, String state, String country) {
		super();
		this.lno = lno;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [lno=" + lno + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	 
	

}
