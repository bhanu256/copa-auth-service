package com.copa.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.copa.authservice.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	
}
