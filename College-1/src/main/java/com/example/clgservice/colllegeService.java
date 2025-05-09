package com.example.clgservice;

import com.example.clgmodel.college;

public interface colllegeService {
	
	


college addCourse(String coursename);

void deleteCourse(String coursename);

college updateCourse(String coursename);

college displayCourse(String coursename);

void addStudent(String student);   
void deleteStudent(String student);
void updateStudent(String student); 
void displayStudent(String student);
}