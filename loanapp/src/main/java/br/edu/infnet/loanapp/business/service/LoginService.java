package br.edu.infnet.loanapp.business.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.loanapp.business.model.Client;
import br.edu.infnet.loanapp.business.repository.CollectorRepository;
import br.edu.infnet.loanapp.business.repository.CustomerRepository;
import br.edu.infnet.loanapp.business.type.ClientType;
import br.edu.infnet.loanapp.core.dto.LoginDTO;

@Service
public class LoginService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CollectorRepository collectorRepository;

	public Optional<Client> doLogin(final LoginDTO loginDto) {
		Optional<Client> clientFound = Optional.empty();
		final Client cliente;
		if (loginDto != null) {
			if (ClientType.CUSTOMER.getValue() == loginDto.getClientType()) {
				clientFound = this.customerRepository.findById(loginDto.getCustomerCode()).map(Client.class::cast);
			} else if (ClientType.COLLECTOR.getValue() == loginDto.getClientType()) {
				clientFound = this.collectorRepository.findById(loginDto.getCustomerCode()).map(Client.class::cast);
			}
		}
		return clientFound;
	}

}
