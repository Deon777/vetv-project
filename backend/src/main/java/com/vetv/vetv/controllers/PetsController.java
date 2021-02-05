package com.vetv.vetv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetv.vetv.dto.PetsDTO;
import com.vetv.vetv.services.PetsService;

@RestController
@RequestMapping(value = "/pets")
public class PetsController {
	
	@Autowired
	private PetsService service;
	
	@GetMapping
	public ResponseEntity<List<PetsDTO>> findAllPets() {
		List<PetsDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
