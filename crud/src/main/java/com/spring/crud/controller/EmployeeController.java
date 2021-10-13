package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.dao.EmployeeDao;
import com.spring.crud.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return employeeDao.getAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeDao.getById(id);
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee employee) {
		return employeeDao.save(employee)+"No. of rows saved to the database";
	}
	
	@PutMapping("/employee/{id}")
	public String updateEmployee(@RequestBody Employee employee,@PathVariable int id) {
		return employeeDao.update(employee, id)+"No. of rows update to the database";
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return employeeDao.delete(id)+"No. of rows update to the database";
	}
	
}


