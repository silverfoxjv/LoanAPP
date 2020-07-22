package br.edu.infnet.loanapp.business.service;

import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

import br.edu.infnet.loanapp.business.model.Contract;

@Service
public class InstallmentService {

	public double calculateBasicInstallmentBasedOnPrice(final Contract contract) {
		if (contract == null) {
			throw new RuntimeException("O contrato está inválido");
		}

		return Precision.round(contract.getLoanAmount() * (//
		contract.getInterestRate() / //
				(1 - Math.pow(1 + contract.getInterestRate(), -contract.getQttInstallments()))), 2);
	}

}
