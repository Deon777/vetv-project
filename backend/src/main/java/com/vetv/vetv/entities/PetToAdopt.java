package com.vetv.vetv.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pet_to_adopt")
public class PetToAdopt implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String breed;
	private Gender gender;
	private int age;
	private Double weight;
	private Double sizeChest;
	private Double sizeNeck;
	private Double sizeBack;
	private String description;
	private ArrayList<String> pic_URL;
	
	public PetToAdopt() {
	}

	public PetToAdopt(String name, String breed, Gender gender, int age, Double weight, Double sizeChest,
			Double sizeNeck, Double sizeBack, String description, ArrayList<String> pic_URL) {
		super();
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.sizeChest = sizeChest;
		this.sizeNeck = sizeNeck;
		this.sizeBack = sizeBack;
		this.description = description;
		this.pic_URL = pic_URL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getSizeChest() {
		return sizeChest;
	}

	public void setSizeChest(Double sizeChest) {
		this.sizeChest = sizeChest;
	}

	public Double getSizeNeck() {
		return sizeNeck;
	}

	public void setSizeNeck(Double sizeNeck) {
		this.sizeNeck = sizeNeck;
	}

	public Double getSizeBack() {
		return sizeBack;
	}

	public void setSizeBack(Double sizeBack) {
		this.sizeBack = sizeBack;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getPic_URL() {
		return pic_URL;
	}

	public void setPic_URL(ArrayList<String> pic_URL) {
		this.pic_URL = pic_URL;
	}
	
	}
