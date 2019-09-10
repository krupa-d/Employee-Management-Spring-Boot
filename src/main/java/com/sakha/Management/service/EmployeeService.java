package com.sakha.Management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sakha.Management.model.Employee;
import com.sakha.Management.repository.EmployeeRepo;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepo repo;
	public Employee save(Employee emp)
	{
		return repo.save(emp);
	}
	public Employee getEmployee(int empId)
	{
		return repo.getOne(empId);
	}
	
	public List<Employee> getAllEmployees()
	{
		return repo.findAll();
	}
	
	public void deleteEmp(int id)
	{
		  repo.deleteById(id);
	}
	public void updateEmp(float salary,int id)
	{
		 repo.update(salary,id);
	}

}
