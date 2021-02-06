package com.vetv.vetv.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vetv.vetv.dto.ConsultationDTO;
import com.vetv.vetv.dto.PetsDTO;
import com.vetv.vetv.entities.Consultation;
import com.vetv.vetv.entities.Pets;
import com.vetv.vetv.repositories.ConsultationRepository;
import com.vetv.vetv.repositories.PetsRepository;


@Service
public class PetsService {
	
	@Autowired
	private PetsRepository repository;
	private ConsultationRepository consultRepository;
	
	@Transactional(readOnly = true)
	public List<PetsDTO> findAll() {
		List<Pets> list = repository.findAll();
		
		return list.stream().map(x -> new PetsDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public PetsDTO insert(PetsDTO dto) {
		Pets entity = new Pets(null, dto.getAge(), dto.getName(), dto.getWeight(), dto.getGender());
		for(ConsultationDTO x : dto.getConsultations()) {
			entity.AddConsultations(new Consultation(x.getDate(), x.getValue(), x.getMetode(), x.getDescription()));
		}
		repository.save(entity);
		return new PetsDTO(entity);
	}
	
}
