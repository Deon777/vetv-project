package com.vetv.vetv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vetv.vetv.entities.Pets;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Long> {

}
