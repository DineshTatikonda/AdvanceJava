package com.project.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Employee;
import com.project.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	public Employee save(Employee employee) {
		return repository.save(employee);
	}
	public Employee findById(Integer id) {
	return repository.findById(id).orElse(new Employee());
	
		
	}
	public List<Employee> findAll() {
		return repository.findAll();
	}
	public Employee update(Employee employee) {
		return repository.save(employee);
	}
	public void deleteById(Integer id ) {
       repository.deleteById(id);		
	}

}
