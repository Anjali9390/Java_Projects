package com.example.Employee_Management_System;
import jakarta.persistence.*;
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String role;
	private String dept;
	
	//getter methods
	public String getname()
	{
	return name;
	}
	public String gerrole()
	{
		return role;
	}
	public String dept()
	{
		return dept;
	}
	
	//setter methods
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setrole(String role)
	{
		this.role=role;
	}
	public void setdept(String dept)
	{
		this.dept=dept;
	}
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}

}
