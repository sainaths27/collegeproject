package com.example.stuservice;

import com.example.stumodel.student;

public interface studentservice {
	
	public student Register(student s);
	public student login(String email , String password );
	public  void sendpasswordmail(String email);
	

}
