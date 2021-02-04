package com.vetv.vetv.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_consult")
public class Consultation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date;
	private Double value;
	private String description;
	private PaymentMetode metode;
	
	public Consultation() {
	}
	
	public Consultation(Date date, Double value, PaymentMetode metode, String description) {
		super();
		this.date = date;
		this.value = value;
		this.metode = metode;
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public PaymentMetode getMetode() {
		return metode;
	}

	public void setMetode(PaymentMetode metode) {
		this.metode = metode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
