package com.vetv.vetv.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vetv.vetv.dto.PetToAdoptDTO;
import com.vetv.vetv.entities.PetToAdopt;
import com.vetv.vetv.repositories.PetToAdoptRepository;


@Service
public class PetToAdoptService {
	
	@Autowired
	private PetToAdoptRepository repository;
	
	@Transactional(readOnly = true)
	public List<PetToAdoptDTO> findAll() {
		List<PetToAdopt> list = repository.findAll();
		return list.stream().map(x -> new PetToAdoptDTO(x)).collect(Collectors.toList());
	}
	
	public PetToAdoptDTO insert(PetToAdoptDTO dto) {
		PetToAdopt entity = new PetToAdopt(dto.getName(), dto.getBreed(), dto.getGender(),
				dto.getAge(), dto.getWeight(), dto.getSizeChest(), dto.getSizeNeck(),
				dto.getSizeBack(), dto.getDescription(), dto.getPic_URL());
		repository.save(entity);
		return new PetToAdoptDTO(entity);
	}
	
}
