package com.topgear.training.spring;

public class Address {
	

	private int hno;
	private String street;
	private String citi;
	
	
	public Address() {
		super();
	}


	public Address(int hno, String street, String citi) {
		super();
		this.hno = hno;
		this.street = street;
		this.citi = citi;
	}
	
	
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCiti() {
		return citi;
	}
	public void setCiti(String citi) {
		this.citi = citi;
	}
	

}
