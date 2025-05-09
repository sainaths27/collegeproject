package com.example.clgRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clgmodel.college;

public interface collegeRepository extends JpaRepository<college, Integer> {

}
