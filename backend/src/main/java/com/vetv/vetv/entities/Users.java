package com.vetv.vetv.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_users")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int age;
	private Gender gender;
	private String name;
	private String nickname;
	private String email;
	private String picURL;
	private ArrayList<String> numbers;
	
	@OneToMany
	private Set<Pets> pets = new HashSet<>();
	
	
	public Users() {
	}
	
	public Users(String name, String nickName, int age, Gender gender, String email, ArrayList<String> numbers,
			String picURL) {
		super();
		this.name = name;
		this.nickname = nickName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.numbers = numbers;
		this.picURL = picURL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickname;
	}

	public void setNickName(String nickName) {
		this.nickname = nickName;
	}

	public int getbirthDate() {
		return age;
	}

	public void setbirthDate(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<String> numbers) {
		this.numbers = numbers;
	}

	public String getPicURL() {
		return picURL;
	}

	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	
	public Set<Pets> getPets() {
		return pets;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void AddPet(Pets pet) {
		pets.add(pet);
	}
	
}
