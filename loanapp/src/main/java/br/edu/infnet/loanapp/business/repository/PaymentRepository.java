package br.edu.infnet.loanapp.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.loanapp.business.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
