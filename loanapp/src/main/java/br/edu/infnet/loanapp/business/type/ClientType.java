package br.edu.infnet.loanapp.business.type;

import br.edu.infnet.loanapp.business.model.Client;
import br.edu.infnet.loanapp.business.model.Collector;
import br.edu.infnet.loanapp.business.model.Customer;

public enum ClientType {

	CUSTOMER("Customer", 1) {
		@Override
		public Client getNewInstace() {
			return new Customer();
		}
	},
	COLLECTOR("Collector", 2) {
		@Override
		public Client getNewInstace() {
			return new Collector();
		}
	};

	private String description;

	private int value;

	private ClientType(final String description, final int value) {
		this.description = description;
		this.value = value;
	}

	public String getDescription() {
		return this.description;
	}

	public int getValue() {
		return this.value;
	}

	public static ClientType getFromValue(final int value) {
		for (final ClientType clientType : values()) {
			if (clientType.getValue() == value) {
				return clientType;
			}
		}
		return null;
	}

	public abstract Client getNewInstace();

}
