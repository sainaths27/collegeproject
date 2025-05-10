package com.example.clgservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clgRepository.collegeRepository;
import com.example.clgmodel.college;
import com.example.stuRepository.studentRepository;
import com.example.stumodel.student;
@Service
public class collegeserviceimp implements colllegeService {

	@Autowired
	private collegeRepository  cr;
	@Autowired
	private studentRepository sr;
	@Override
	public college addCourse(college coursename) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteCourse(String coursename) {
		// TODO Auto-generated method stub
		cr.deleteById(coursename);
		
	}
	@Override
	public college updateCourse(college coursename) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<college> displayCourse() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public student addStudent(student student) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteStudent(int roll) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public student updateStudent(student s, int roll) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<student> displayStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
