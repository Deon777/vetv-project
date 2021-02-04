package com.vetv.vetv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vetv.vetv.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
