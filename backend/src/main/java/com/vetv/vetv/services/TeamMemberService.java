package com.vetv.vetv.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vetv.vetv.dto.TeamMemberDTO;
import com.vetv.vetv.entities.TeamMember;
import com.vetv.vetv.repositories.TeamMemberRepository;


@Service
public class TeamMemberService {
	
	@Autowired
	private TeamMemberRepository repository;
	
	@Transactional(readOnly = true)
	public List<TeamMemberDTO> findAll() {
		List<TeamMember> list = repository.findAll();
		return list.stream().map(x -> new TeamMemberDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public TeamMemberDTO insert(TeamMemberDTO dto) {
		TeamMember entity = new TeamMember(null, dto.getName(), dto.getFunction(), 
				dto.getFormation(), dto.getPicURL());
		entity = repository.save(entity);
		return new TeamMemberDTO(entity);
	}
	
}
