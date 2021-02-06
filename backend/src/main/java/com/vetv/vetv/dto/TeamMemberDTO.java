package com.vetv.vetv.dto;

import java.io.Serializable;

import com.vetv.vetv.entities.TeamMember;

public class TeamMemberDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String function;
	private String formation;
	private String picURL;
	
	
	public TeamMemberDTO() {
	}
	
	public TeamMemberDTO(Long id, String name, String function, String formation, String picURL) {
		this.id = id;
		this.name = name;
		this.function = function;
		this.formation = formation;
		this.picURL = picURL;
	}
	
	public TeamMemberDTO(TeamMember entity) {
		id = entity.getId();
		name = entity.getName();
		function = entity.getFunction();
		formation = entity.getFormation();
		picURL = entity.getPicURL();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public String getPicURL() {
		return picURL;
	}

	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamMemberDTO other = (TeamMemberDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
