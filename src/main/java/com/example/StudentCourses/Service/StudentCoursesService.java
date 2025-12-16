package com.example.StudentCourses.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentCourses.Dao.StudentCoursesDao;
import com.example.StudentCourses.model.StudentCourses;

@Service
public class StudentCoursesService {
	@Autowired
	StudentCoursesDao studentcourses;

	public List<StudentCourses> getAllStudentCourses()
	{
		return studentcourses.findAll();
	}

	 public void saveCourse(StudentCourses course) {
	        studentcourses.save(course);  // <-- This actually saves to MySQL
	    }
}
