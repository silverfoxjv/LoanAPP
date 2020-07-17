package br.edu.infnet.loanapp.core.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable {

	private static final long serialVersionUID = -3822336148644237144L;

	private int customerCode;

	private String password;

	private int clientType;

	public int getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(final int customerCode) {
		this.customerCode = customerCode;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public int getClientType() {
		return this.clientType;
	}

	public void setClientType(final int clientType) {
		this.clientType = clientType;
	}

	@Override
	public String toString() {
		return String.format(//
				"LoginDTO [customerCode=%s, password=%s, clientType=%s]", //
				this.customerCode, //
				this.password, //
				this.clientType);
	}
}