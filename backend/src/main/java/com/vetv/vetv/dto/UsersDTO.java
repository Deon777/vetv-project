package com.vetv.vetv.dto;

import java.io.Serializable;
import java.util.ArrayList;

import com.vetv.vetv.entities.Gender;
import com.vetv.vetv.entities.Users;

public class UsersDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int age;
	private Gender gender;
	private String name;
	private String nickname;
	private String email;
	private String picURL;
	private String number;
	
	
	public UsersDTO() {
	}
	
	public UsersDTO(Long id, int age, Gender gender, String name, String nickname, String email, String picURL,
			String number) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.picURL = picURL;
		this.number = number;
	}
	
	public UsersDTO(Users entity) {
		id = entity.getId();
		age = entity.getAge();
		gender = entity.getGender();
		name = entity.getName();
		nickname = entity.getNickname();
		email = entity.getEmail();
		picURL = entity.getPicURL();
		number = entity.getNumber();
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPicURL() {
		return picURL;
	}

	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}

	public String getNumbers() {
		return number;
	}

	public void setNumbers(String number) {
		this.number = number;
	}
	
}
