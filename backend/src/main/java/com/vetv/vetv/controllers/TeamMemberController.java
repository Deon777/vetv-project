package com.vetv.vetv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetv.vetv.dto.TeamMemberDTO;
import com.vetv.vetv.services.TeamMemberService;

@RestController
@RequestMapping(value = "/team")
public class TeamMemberController {
	
	@Autowired
	private TeamMemberService service;
	
	@GetMapping
	public ResponseEntity<List<TeamMemberDTO>> findAllPets() {
		List<TeamMemberDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
