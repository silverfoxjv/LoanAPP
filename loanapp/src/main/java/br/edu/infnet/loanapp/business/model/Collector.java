package br.edu.infnet.loanapp.business.model;

import java.io.Serializable;

public class Collector implements Serializable {

	private static final long serialVersionUID = -2022241378941950437L;
	
	private int id;
	
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

	private String name;

}
