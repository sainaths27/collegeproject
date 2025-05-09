package com.example.clgservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clgRepository.collegeRepository;
import com.example.clgmodel.college;
@Service
public class collegeserviceimp implements colllegeService {

	@Autowired
	private collegeRepository  cr;
	@Override
	public college addCourse(String coursename) {
		// TODO Auto-generated method stub
     

		return cr.save(college);
	}

	@Override
	public void deleteCourse(String coursename) {
		// TODO Auto-generated method stub
cr.deleteById(coursename);
	}

	@Override
	public college updateCourse(String coursename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public college displayCourse(String coursename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(String student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(String student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(String student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayStudent(String student) {
		// TODO Auto-generated method stub

	}

}
