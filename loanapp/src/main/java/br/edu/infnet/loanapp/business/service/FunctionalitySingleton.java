package br.edu.infnet.loanapp.business.service;

import java.util.EnumMap;
import java.util.List;

import br.edu.infnet.loanapp.business.type.ClientType;
import br.edu.infnet.loanapp.dto.model.FunctionalityDTO;

public final class FunctionalitySingleton {

	private static FunctionalitySingleton instance;

	private final EnumMap<ClientType, List<FunctionalityDTO>> functionalities;

	private FunctionalitySingleton() {
		super();
		this.functionalities = new EnumMap<>(ClientType.class);
	}

	public static FunctionalitySingleton getInstance() {
		if (instance == null) {
			instance = new FunctionalitySingleton();
		}
		return instance;
	}

	public List<FunctionalityDTO> getFunctionalitiesByClientType(final ClientType clientType) {
//		if() {
//
//		}
		return this.functionalities.get(clientType);
	}

}
