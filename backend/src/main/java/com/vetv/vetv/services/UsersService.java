package com.vetv.vetv.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vetv.vetv.dto.ConsultationDTO;
import com.vetv.vetv.dto.PetsDTO;
import com.vetv.vetv.dto.UsersDTO;
import com.vetv.vetv.entities.Consultation;
import com.vetv.vetv.entities.Pets;
import com.vetv.vetv.entities.Users;
import com.vetv.vetv.repositories.ConsultationRepository;
import com.vetv.vetv.repositories.UsersRepository;


@Service
public class UsersService {
	
	@Autowired
	private UsersRepository repository;
	
	@Transactional(readOnly = true)
	public List<UsersDTO> findAll() {
		List<Users> list = repository.findAll();
		
		return list.stream().map(x -> new UsersDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public UsersDTO insert(UsersDTO dto) {
		Users entity = new Users(dto.getName(), dto.getNickname(), dto.getAge(),
				dto.getGender(), dto.getEmail(), dto.getNumber(), dto.getPicURL());
		for(PetsDTO x : dto.getPets()) {
			entity.AddPet(new Pets(x.getId(), x.getAge(), x.getName(), x.getWeight(), x.getGender()));
		}
		repository.save(entity);
		return new UsersDTO(entity);
	}
}
