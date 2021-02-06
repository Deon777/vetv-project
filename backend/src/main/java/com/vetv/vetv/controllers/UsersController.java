package com.vetv.vetv.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vetv.vetv.dto.PetsDTO;
import com.vetv.vetv.dto.UsersDTO;
import com.vetv.vetv.services.UsersService;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@GetMapping
	public ResponseEntity<List<UsersDTO>> findAllPets() {
		List<UsersDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<UsersDTO> insert(@RequestBody UsersDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
