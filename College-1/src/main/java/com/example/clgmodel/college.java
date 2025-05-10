
package com.example.clgmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class college {

	@Id
	private String coursename;

	public college(String coursename) {
		super();
		this.coursename = coursename;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public college() {
		super();
		// TODO Auto-generated constructor stub
	}

}
