package br.edu.infnet.loanapp.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.loanapp.business.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
