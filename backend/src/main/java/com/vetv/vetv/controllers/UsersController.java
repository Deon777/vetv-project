package com.vetv.vetv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
