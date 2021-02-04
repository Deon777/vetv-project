package com.vetv.vetv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vetv.vetv.entities.Consultation;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

}
