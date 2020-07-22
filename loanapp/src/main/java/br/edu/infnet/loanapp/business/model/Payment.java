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
			name = "installmentId", //
			referencedColumnName = "id", //
			nullable = false)
	private Installment installment;

	@Column(name = "paymentDate", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date paymentDate;

	@Column(name = "installmentNbr", nullable = false)
	private int installmentNbr;

	@Column(name = "capitalPaid", nullable = true)
	private double capitalPaid;

	@Column(name = "interestPaid", nullable = true)
	private double interestPaid;

	public Payment() {
		super();
	}

	public Payment(//
			final int id, //
			final Installment installment, //
			final Date paymentDate, //
			final int installmentNbr, //
			final double capitalPaid, //
			final double interestPaid) {
		super();
		this.id = id;
		this.installment = installment;
		this.paymentDate = paymentDate;
		this.installmentNbr = installmentNbr;
		this.capitalPaid = capitalPaid;
		this.interestPaid = interestPaid;
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public Installment getInstallment() {
		return this.installment;
	}

	public void setInstallment(final Installment installment) {
		this.installment = installment;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(final Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getInstallmentNbr() {
		return this.installmentNbr;
	}

	public void setInstallmentNbr(final int installmentNbr) {
		this.installmentNbr = installmentNbr;
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
				"Payment [id=%s, installment=%s, paymentDate=%s, installmentNbr=%s, capitalPaid=%s, interestPaid=%s]",
				this.id, this.installment, this.paymentDate, this.installmentNbr, this.capitalPaid, this.interestPaid);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.capitalPaid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((this.installment == null) ? 0 : this.installment.hashCode());
		result = prime * result + this.id;
		temp = Double.doubleToLongBits(this.interestPaid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((this.paymentDate == null) ? 0 : this.paymentDate.hashCode());
		result = prime * result + this.installmentNbr;
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
		if (this.installment == null) {
			if (other.installment != null) {
				return false;
			}
		} else if (!this.installment.equals(other.installment)) {
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
		} else if (this.installmentNbr != other.installmentNbr) {
			return false;
		}
		return true;
	}

}
