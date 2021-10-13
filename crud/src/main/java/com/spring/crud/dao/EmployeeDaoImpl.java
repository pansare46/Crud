package com.spring.crud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.crud.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employee employee, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAll() {
		return jdbcTemplate.query("select * from employee",new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee getById(int id) {
		return jdbcTemplate.queryForObject("select * from employee", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

}
