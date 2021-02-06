package com.vetv.vetv.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pets")
public class Pets implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int age;
	private String name;
	private Double weight;
	private Gender gender;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "tb_pets_consultations",
	joinColumns = @JoinColumn(name = "pets_id"),
	inverseJoinColumns = @JoinColumn(name = "consultation_id"))
	private Set<Consultation> consultations = new HashSet<>();
	
	
	public Pets() {
	}
	
	public Pets(Long id, int age, String name, Double weight, Gender gender) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.gender = gender;
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

	public void AddConsultations(Consultation consultation) {
		consultations.add(consultation);
	}
	
}
