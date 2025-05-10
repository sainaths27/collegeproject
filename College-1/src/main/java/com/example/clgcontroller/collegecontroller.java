package com.example.clgcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.clgmodel.college;
import com.example.clgservice.colllegeService;

@RestController
@RequestMapping("/course")
public class collegecontroller {

	    @Autowired
	    private colllegeService collegeService;


	    @PostMapping("/add")
	    public college addCourse(@RequestBody college coursename) {
	        return collegeService.addCourse(coursename);
	    }

	    @DeleteMapping("/delete")
	    public void deleteCourse(@PathVariable String coursename) {
	        collegeService.deleteCourse(coursename);
	    }

	    @PutMapping("/update")
	    public college updateCourse(@RequestBody college name) {
	        return collegeService.updateCourse(name);
	    }

	    @GetMapping("/display")
	    public List<college> displayCourse() {
	        return collegeService.displayCourse();
	    }
}
