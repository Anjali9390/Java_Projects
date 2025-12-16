package com.example.StudentCourses.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentCourses.model.StudentCourses;

@Repository
public interface StudentCoursesDao extends JpaRepository<StudentCourses,Integer> {

	
}
