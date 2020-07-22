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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "LN_PAYMENT")
public class Payment implements Serializable {

	private static final long serialVersionUID = -3947741510390010910L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(//
			name = "contractId", //
			referencedColumnName = "id", //
			nullable = false)
	private Contract contract;

	@Column(name = "paymentDate", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date paymentDate;

	@Column(name = "paymentMonth", nullable = false)
	private int paymentMonth;

	@Column(name = "capitalPaid", nullable = true)
	private double capitalPaid;

	@Column(name = "interestPaid", nullable = true)
	private double interestPaid;

	public Payment() {
		super();
	}

	public Payment(//
			final int id, //
			final Contract contract, //
			final Date paymentDate, //
			final int paymentMonth, //
			final double capitalPaid, //
			final double interestPaid) {
		super();
		this.id = id;
		this.contract = contract;
		this.paymentDate = paymentDate;
		this.paymentMonth = paymentMonth;
		this.capitalPaid = capitalPaid;
		this.interestPaid = interestPaid;
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public Contract getContract() {
		return this.contract;
	}

	public void setContract(final Contract contract) {
		this.contract = contract;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(final Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getPaymentMonth() {
		return this.paymentMonth;
	}

	public void setPaymentMonth(final int paymentMonth) {
		this.paymentMonth = paymentMonth;
	}

	public double getCapitalPaid() {
		return this.capitalPaid;
	}

	public void setCapitalPaid(final double capitalPaid) {
		this.capitalPaid = capitalPaid;
	}

	public double getInterestPaid() {
		return this.interestPaid;
	}

	public void setInterestPaid(final double interestPaid) {
		this.interestPaid = interestPaid;
	}

	@Override
	public String toString() {
		return String.format(
				"Payment [id=%s, contract=%s, paymentDate=%s, paymentMonth=%s, capitalPaid=%s, interestPaid=%s]",
				this.id, this.contract, this.paymentDate, this.paymentMonth, this.capitalPaid, this.interestPaid);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.capitalPaid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((this.contract == null) ? 0 : this.contract.hashCode());
		result = prime * result + this.id;
		temp = Double.doubleToLongBits(this.interestPaid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((this.paymentDate == null) ? 0 : this.paymentDate.hashCode());
		result = prime * result + this.paymentMonth;
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Payment other = (Payment) obj;
		if (Double.doubleToLongBits(this.capitalPaid) != Double.doubleToLongBits(other.capitalPaid)) {
			return false;
		}
		if (this.contract == null) {
			if (other.contract != null) {
				return false;
			}
		} else if (!this.contract.equals(other.contract)) {
			return false;
		}
		if (this.id != other.id) {
			return false;
		}
		if (Double.doubleToLongBits(this.interestPaid) != Double.doubleToLongBits(other.interestPaid)) {
			return false;
		}
		if (this.paymentDate == null) {
			if (other.paymentDate != null)
				return false;
		} else if (!this.paymentDate.equals(other.paymentDate)) {
			return false;
		} else if (this.paymentMonth != other.paymentMonth) {
			return false;
		}
		return true;
	}

}
