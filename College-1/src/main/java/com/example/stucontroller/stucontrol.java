package com.example.stucontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.stumodel.student;
import com.example.stuservice.studentservice;
@RestController
public class stucontrol {
	@Autowired
	private studentservice sr;

}
