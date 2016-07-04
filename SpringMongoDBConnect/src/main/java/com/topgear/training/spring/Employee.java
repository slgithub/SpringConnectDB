package com.topgear.training.spring;

public class Employee {
	
	public int id;
	public  String ename;
    public Address address;
    
    public Employee(){
    	
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, String ename, Address address) {
		super();
		this.id = id;
		this.ename = ename;
		this.address = address;
	}	

}
