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

import com.vetv.vetv.dto.ConsultationDTO;
import com.vetv.vetv.dto.PetToAdoptDTO;
import com.vetv.vetv.services.ConsultationService;

@RestController
@RequestMapping(value = "/consultations")
public class ConsultationController {
	
	@Autowired
	private ConsultationService service;
	
	@GetMapping
	public ResponseEntity<List<ConsultationDTO>> findAllPets() {
		List<ConsultationDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<ConsultationDTO> insert(@RequestBody ConsultationDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
