package com.example.clgcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.clgmodel.college;
import com.example.clgservice.colllegeService;

@RestController
public class collegecontroller {

	
	


	    @Autowired
	    private colllegeService collegeService;

	  

	    @PostMapping("/course")
	    public college addCourse(@RequestParam String coursename) {
	        return collegeService.addCourse(coursename);
	    }

	    @DeleteMapping("/course/{coursename}")
	    public void deleteCourse(@PathVariable String coursename) {
	        collegeService.deleteCourse(coursename);
	    }

	    @PutMapping("/course")
	    public college updateCourse(@RequestParam String coursename) {
	        return collegeService.updateCourse(coursename);
	    }

	    @GetMapping("/course/{coursename}")
	    public college displayCourse(@PathVariable String coursename) {
	        return collegeService.displayCourse(coursename);
	    }
}
