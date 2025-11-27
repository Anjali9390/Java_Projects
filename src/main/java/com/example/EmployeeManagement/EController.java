package com.example.EmployeeManagement;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoStudentManagement.controller.GetMapping;

import java.util.List;
import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("employees")
	public class EController 
	{
		@Autowired
		private EService service;
		
		@GetMapping
	    public List<Employee> getAllEmployees() 
		{
	        return service.getALLEmployees();
	    }
		@GetMapping("/welcome")
	    public String welcome() {
	        return "Welcome to Employee Management!";
	    }
		  @GetMapping("/{id}")
		    public Employee getEmployee(@PathVariable Long id)
		  {
		        return service.getEmployeeById(id);
		    }
		  @PostMapping
		    public Employee addEmployee(@RequestBody Employee employee) {
		        return service.addEmployee(employee);
		    }

		    @PutMapping("/{id}")
		    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		        return service.updateEmployee(id, employee);
		    }

		    @DeleteMapping("/{id}")
		    public void deleteEmployee(@PathVariable Long id) {
		        service.deleteEmployee(id);
		    }


}
