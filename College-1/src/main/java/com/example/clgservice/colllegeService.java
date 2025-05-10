package com.example.clgservice;

import java.util.List;

import com.example.clgmodel.college;
import com.example.stumodel.student;

public interface colllegeService {

	college addCourse(college coursename);

	void deleteCourse(String coursename);

	college updateCourse(college coursename);

	List<college> displayCourse();

	student addStudent(student student);

	void deleteStudent(int roll);

	student updateStudent(student s, int roll);

	List<student> displayStudent();
}