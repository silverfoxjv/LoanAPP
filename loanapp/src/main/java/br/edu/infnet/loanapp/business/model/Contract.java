package br.edu.infnet.loanapp.business.model;

import java.io.Serializable;
import java.util.Date;

public class Contract implements Serializable {

	private static final long serialVersionUID = -1109907034863549271L;

	private int id;

	private Customer customer;

	private Collector collector;

	private Date startDate;

	private double interestRate;

	private double loanAmount;

	private double loanPaymentAmountDue;

	private Date loanPaymentAmountDate;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(final double interestRate) {
		this.interestRate = interestRate;
	}

	public double getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(final double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getLoanPaymentAmountDue() {
		return this.loanPaymentAmountDue;
	}

	public void setLoanPaymentAmountDue(final double loanPaymentAmountDue) {
		this.loanPaymentAmountDue = loanPaymentAmountDue;
	}

	public Date getLoanPaymentAmountDate() {
		return this.loanPaymentAmountDate;
	}

	public void setLoanPaymentAmountDate(final Date loanPaymentAmountDate) {
		this.loanPaymentAmountDate = loanPaymentAmountDate;
	}

	public Collector getCollector() {
		return this.collector;
	}

	public void setCollector(final Collector collector) {
		this.collector = collector;
	}

}
