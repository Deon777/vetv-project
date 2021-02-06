package com.vetv.vetv.services;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vetv.vetv.dto.ConsultationDTO;
import com.vetv.vetv.entities.Consultation;
import com.vetv.vetv.repositories.ConsultationRepository;


@Service
public class ConsultationService {
	
	@Autowired
	private ConsultationRepository repository;
	
	@Transactional(readOnly = true)
	public List<ConsultationDTO> findAll() {
		List<Consultation> list = repository.findAll();
		return list.stream().map(x -> new ConsultationDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public ConsultationDTO insert(ConsultationDTO dto) {
		Consultation entity = new Consultation(Date.from(Instant.now()), dto.getValue(),
				dto.getMetode(), dto.getDescription());
		repository.save(entity);
		return new ConsultationDTO(entity);
	}
	
}
