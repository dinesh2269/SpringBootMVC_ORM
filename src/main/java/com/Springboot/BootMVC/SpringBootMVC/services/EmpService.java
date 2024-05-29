package com.Springboot.BootMVC.SpringBootMVC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.BootMVC.SpringBootMVC.models.Employee;
import com.Springboot.BootMVC.SpringBootMVC.repositories.EmpRepository;

@Service

public class EmpService {

	@Autowired
	private EmpRepository empRepository;

	public List<Employee> findAll() {

		System.out.println("about to invoke repository method");

		return empRepository.findAll();

	}

	public boolean createEmployee(Employee emp) {
		System.out.println("before inserting");
		return empRepository.save(emp) != null;
	}

}
