package com.example.stumodel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private static String name;
    private String coursename;
    private static String email;
    private String mobileno;
   private static String  password;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		student.password = password;
	}

	public void setId(int id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

	public student(String name, String coursename, String mobileno) {
		super();
		this.name = name;
		this.coursename = coursename;
		this.mobileno = mobileno;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
