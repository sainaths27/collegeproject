package com.example.stuservice;

import java.util.Optional;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.example.demo.College1Application;
import com.example.stuRepository.studentRepository;
import com.example.stumodel.student;

@Service
public class studentserviceimp implements studentservice {

    private final College1Application college1Application;
@Autowired
private studentRepository sr;
@Autowired
private JavaMailSender mailSender;

    studentserviceimp(College1Application college1Application) {
        this.college1Application = college1Application;
    }
	@Override
	public student Register(student s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	@Override
	public student login(String email, String password) {
	Optional<student>studentopt = sr.findByEmail(email);
	student student = studentopt.get();
	if(student.getPassword().equals(password))
	{
	 return student;
	}
	return null;
	}

	@Override
	public void sendpasswordmail(String email) {
		// TODO Auto-generated method stub
		Optional<student>studentopt = sr.findByEmail(email);
	     SimpleMailMessage message = new SimpleMailMessage();
	     message.setTo(student.getEmail());
	message.setSubject("youe login passowrd");
	 message.setText("Hello " + student.getName() + ",\n\nYour password is: " + student.getPassword());
mailSender.send(message);
	
	
	
	}

}
