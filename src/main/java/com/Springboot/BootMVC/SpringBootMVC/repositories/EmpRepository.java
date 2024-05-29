package com.Springboot.BootMVC.SpringBootMVC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.BootMVC.SpringBootMVC.models.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
