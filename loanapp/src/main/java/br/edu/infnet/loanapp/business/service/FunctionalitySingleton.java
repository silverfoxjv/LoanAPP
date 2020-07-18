package br.edu.infnet.loanapp.business.service;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

import br.edu.infnet.loanapp.business.type.ClientType;
import br.edu.infnet.loanapp.core.constants.URLConsts;
import br.edu.infnet.loanapp.dto.model.FunctionalityDTO;

public final class FunctionalitySingleton {

	private static FunctionalitySingleton instance;

	private final EnumMap<ClientType, List<FunctionalityDTO>> functionalities;

	private FunctionalitySingleton() {
		super();
		this.functionalities = new EnumMap<>(ClientType.class);
		this.populateFunctionalities();
	}

	public static FunctionalitySingleton getInstance() {
		if (instance == null) {
			instance = new FunctionalitySingleton();
		}
		return instance;
	}

	public List<FunctionalityDTO> getFunctionalitiesByClientType(final ClientType clientType) {
		return this.functionalities.get(clientType);
	}

	private void populateFunctionalities() {

		this.functionalities.computeIfAbsent(ClientType.COLLECTOR, key -> {

			return Arrays.asList(//
					FunctionalityDTO.newInstance(URLConsts.getContractPath(), "Contract", key), //
					FunctionalityDTO.newInstance(URLConsts.getClientPath(), "Client", key));
		});

		this.functionalities.computeIfAbsent(ClientType.CUSTOMER, key -> {

			return Arrays.asList(//
					FunctionalityDTO.newInstance(URLConsts.getPaymentPath(), "Payment", key));
		});
	}

}
