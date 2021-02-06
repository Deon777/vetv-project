package com.vetv.vetv.controllers;

import java.net.URI;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vetv.vetv.dto.ConsultationDTO;
import com.vetv.vetv.dto.PetsDTO;
import com.vetv.vetv.entities.Consultation;
import com.vetv.vetv.entities.Pets;
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
	
	@PostMapping
	public ResponseEntity<PetsDTO> insert(@RequestBody PetsDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
}
