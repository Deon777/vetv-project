package com.vetv.vetv.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;

import com.vetv.vetv.entities.Consultation;
import com.vetv.vetv.entities.Gender;
import com.vetv.vetv.entities.PaymentMetode;
import com.vetv.vetv.entities.Pets;

public class PetsDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int age;
	private String name;
	private Double weight;
	private Gender gender;
	
	private Set<Consultation> consultations = new HashSet<>();

	
	public PetsDTO() {
	}
	
	public PetsDTO(Long id, int age, String name, Double weight, Gender gender, Set<Consultation> consultations) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.consultations = consultations;
	}
	
	public PetsDTO(Pets entity) {
		id = entity.getId();
		age = entity.getAge();
		name = entity.getName();
		weight = entity.getWeight();
		gender = entity.getGender();
		consultations = entity.GetConsultations();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Set<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(Set<Consultation> consultations) {
		this.consultations = consultations;
	}
	
}
