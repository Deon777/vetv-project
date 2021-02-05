package com.vetv.vetv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetv.vetv.dto.PetToAdoptDTO;
import com.vetv.vetv.services.PetToAdoptService;

@RestController
@RequestMapping(value = "/adoption")
public class PetToAdoptController {
	
	@Autowired
	private PetToAdoptService service;
	
	@GetMapping
	public ResponseEntity<List<PetToAdoptDTO>> findAllPets() {
		List<PetToAdoptDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
