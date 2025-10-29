package com.example.EmployeeManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="EmployeeManagement")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String deptname;
	private String companyname;
	
	// getter and setter methods
	
	private Long getid()
	{
		return id;
	}
	private String getname()
	{
		return name;
	}
	String getdeptname()
	{
		return deptname;
	}
	
	private String getcompanyname()
	{
	
		return companyname;
	}
	private void setid(Long id)
	{
		this.id=id;
	}
	private void setname(String name)
	{
		this.name=name;
	}
 private void setdept_name(String deptname)
 {
	 this.deptname=deptname;
 }
 void setcompanyname()
 {
	 this.companyname=companyname;
 }
}
