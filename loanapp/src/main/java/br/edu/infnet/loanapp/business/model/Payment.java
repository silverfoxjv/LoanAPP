package br.edu.infnet.loanapp.business.model;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable {

	private static final long serialVersionUID = -3947741510390010910L;

	private int id;
	
	private Contract contract;

	private Date paymentDate;

	private int paymentMonth;

	private double capitalPaid;

	private double interestPaid;//ajustar no script
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getPaymentMonth() {
		return paymentMonth;
	}

	public void setPaymentMonth(int paymentMonth) {
		this.paymentMonth = paymentMonth;
	}

	public double getCapitalPaid() {
		return capitalPaid;
	}

	public void setCapitalPaid(double capitalPaid) {
		this.capitalPaid = capitalPaid;
	}

	public double getInterestPaid() {
		return interestPaid;
	}

	public void setInterestPaid(double interestPaid) {
		this.interestPaid = interestPaid;
	}



}
