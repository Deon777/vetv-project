package com.vetv.vetv.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vetv.vetv.dto.PetsDTO;
import com.vetv.vetv.entities.Pets;
import com.vetv.vetv.repositories.PetsRepository;


@Service
public class PetsService {
	
	@Autowired
	private PetsRepository repository;
	
	@Transactional(readOnly = true)
	public List<PetsDTO> findAll() {
		List<Pets> list = repository.findAll();
		
		return list.stream().map(x -> new PetsDTO(x)).collect(Collectors.toList());
	}
	
}
