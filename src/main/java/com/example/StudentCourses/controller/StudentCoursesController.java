package com.example.StudentCourses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentCourses.Service.StudentCoursesService;
import com.example.StudentCourses.model.StudentCourses;

@RestController
@RequestMapping("/studentcourses")
public class StudentCoursesController {
	@Autowired
	StudentCoursesService studentcoursesService;
	@GetMapping("/all")
	public List<StudentCourses> getAllStudentCourses()
	{
		
		return studentcoursesService.getAllStudentCourses();

	}
	@GetMapping("/add")
	public String addCourse(String name, String tech, Double fee, String coursename) {
	    StudentCourses course = new StudentCourses();
	    course.setName(name);
	    course.setTech(tech);
	    course.setFee(fee);
	    course.setCoursename(coursename);
	    studentcoursesService.saveCourse(course);
	    return "Course added successfully!";
	}

}
