package br.edu.infnet.loanapp.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.loanapp.business.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

}
