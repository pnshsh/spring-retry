package com.pnshsh.spring_retry.bean;

public class Man {

	private Long id;
	private String name;
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Man(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	

}
