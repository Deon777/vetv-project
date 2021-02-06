package com.vetv.vetv.dto;

import java.io.Serializable;
import java.util.Date;

import com.vetv.vetv.entities.Consultation;
import com.vetv.vetv.entities.PaymentMetode;

public class ConsultationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date date;
	private Double value;
	private String description;
	private PaymentMetode metode;
	
	
	public ConsultationDTO() {
	}
	
	public ConsultationDTO(Long id, Date date, Double value, String description, PaymentMetode metode) {
		this.id = id;
		this.date = date;
		this.value = value;
		this.description = description;
		this.metode = metode;
	}
	
	public ConsultationDTO(Consultation entity) {
		id = entity.getId();
		date = entity.getDate();
		value = entity.getValue();
		description = entity.getDescription();
		metode = entity.getMetode();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PaymentMetode getMetode() {
		return metode;
	}

	public void setMetode(PaymentMetode metode) {
		this.metode = metode;
	}

}
