package br.edu.infnet.loanapp.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.loanapp.business.model.Collector;

public interface CollectorRepository extends JpaRepository<Collector, Integer> {

}
