package com.example.stuRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stumodel.student;

public interface studentRepository extends JpaRepository<student, Integer> {
	  Optional<student> findByEmail(String email);
}
