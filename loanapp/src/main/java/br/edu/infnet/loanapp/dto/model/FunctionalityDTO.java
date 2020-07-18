package br.edu.infnet.loanapp.dto.model;

import java.io.Serializable;

import br.edu.infnet.loanapp.business.type.ClientType;

public class FunctionalityDTO implements Serializable {

	private static final long serialVersionUID = 1992218710934135798L;

	private String route;

	private String name;

	private ClientType clientType;

	private FunctionalityDTO() {
		super();
	}

	private FunctionalityDTO(final String route, final String name, final ClientType clientType) {
		super();
		this.route = route;
		this.name = name;
		this.clientType = clientType;
	}

	public static FunctionalityDTO newInstance(//
			final String route, //
			final String name, //
			final ClientType clientType) {
		return new FunctionalityDTO(route, name, clientType);
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(final String route) {
		this.route = route;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public ClientType getClientType() {
		return this.clientType;
	}

	public void setClientType(final ClientType clientType) {
		this.clientType = clientType;
	}

	@Override
	public String toString() {
		return String.format("FuncionalidadeDTO [route=%s, name=%s]", this.route, this.name);
	}

}
