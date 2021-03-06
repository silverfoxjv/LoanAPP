package br.edu.infnet.loanapp.business.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "LN_INSTALLMENT")
public class Installment implements Serializable, Comparable<Installment> {

	private static final long serialVersionUID = 104299398955263373L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(//
			name = "contractId", //
			referencedColumnName = "id", //
			nullable = false)
	private Contract contract;

	@Column(name = "interestInd", nullable = false)
	private double interestIndicated;

	@Column(name = "capitalInd", nullable = false)
	private double capitalIndicates;

	@Column(name = "installmentDateDue", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date installmentDateDue;

	public Installment(//
			final int id, //
			final Contract contract, //
			final double interestIndicated, //
			final double capitalIndicates, //
			final Date installmentDateDue) {
		super();
		this.id = id;
		this.contract = contract;
		this.interestIndicated = interestIndicated;
		this.capitalIndicates = capitalIndicates;
		this.installmentDateDue = installmentDateDue;
	}

	public Installment() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setContract(final Contract contract) {
		this.contract = contract;
	}

	public void setInterestIndicated(final double interestIndicated) {
		this.interestIndicated = interestIndicated;
	}

	public void setCapitalIndicates(final double capitalIndicates) {
		this.capitalIndicates = capitalIndicates;
	}

	public void setInstallmentDateDue(final Date installmentDateDue) {
		this.installmentDateDue = installmentDateDue;
	}

	public Contract getContract() {
		return this.contract;
	}

	public double getInterestIndicated() {
		return this.interestIndicated;
	}

	public double getCapitalIndicates() {
		return this.capitalIndicates;
	}

	public Date getInstallmentDateDue() {
		return this.installmentDateDue;
	}

	@Override
	public String toString() {
		return String.format(
				"Installment [id=%s, contract=%s, interestIndicated=%s, capitalIndicates=%s, installmentDateDue=%s]",
				this.id, this.contract, this.interestIndicated, this.capitalIndicates, this.installmentDateDue);
	}

	@Override
	public int compareTo(final Installment o) {
		if (o == null) {
			return 1;
		}
		return this.getInstallmentDateDue().getTime() < o.getInstallmentDateDue().getTime() ? -1 : 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.capitalIndicates);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((this.contract == null) ? 0 : this.contract.hashCode());
		result = prime * result + this.id;
		result = prime * result + ((this.installmentDateDue == null) ? 0 : this.installmentDateDue.hashCode());
		temp = Double.doubleToLongBits(this.interestIndicated);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		final Installment other = (Installment) obj;
		if (Double.doubleToLongBits(this.capitalIndicates) != Double.doubleToLongBits(other.capitalIndicates))
			return false;
		if (this.contract == null) {
			if (other.contract != null)
				return false;
		} else if (!this.contract.equals(other.contract))
			return false;
		if (this.id != other.id)
			return false;
		if (this.installmentDateDue == null) {
			if (other.installmentDateDue != null)
				return false;
		} else if (!this.installmentDateDue.equals(other.installmentDateDue))
			return false;
		if (Double.doubleToLongBits(this.interestIndicated) != Double.doubleToLongBits(other.interestIndicated))
			return false;
		return true;
	}

}
