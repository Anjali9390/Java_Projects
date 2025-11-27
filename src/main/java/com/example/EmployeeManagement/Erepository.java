package com.example.EmployeeManagement;

import org.springframework.data.jpa.repository.*;

public interface Erepository extends JpaRepository<Employee,Long>
{

}
