package br.edu.infnet.loanapp.business.model;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 2469110101808443358L;

	private int id;
	
	private String name;
	
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
}
