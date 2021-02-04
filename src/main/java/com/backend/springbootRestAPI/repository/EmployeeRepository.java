package com.backend.springbootRestAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.springbootRestAPI.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}