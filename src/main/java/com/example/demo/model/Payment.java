package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paymentdetails")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cardno;
	private String nameoncard;
	private LocalDate pmtdate;
	private int amount;
	private String paymentmethod;
	private int cvv;
	private int exmonth;
	private int exyear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getNameoncard() {
		return nameoncard;
	}

	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}

	public LocalDate getPmtdate() {
		return pmtdate;
	}

	public void setPmtdate(LocalDate pmtdate) {
		this.pmtdate = pmtdate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getExmonth() {
		return exmonth;
	}

	public void setExmonth(int exmonth) {
		this.exmonth = exmonth;
	}

	public int getExyear() {
		return exyear;
	}

	public void setExyear(int exyear) {
		this.exyear = exyear;
	}

}
