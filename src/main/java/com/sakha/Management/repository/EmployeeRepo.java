package com.sakha.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sakha.Management.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
	@Query("from Employee where empId=:id")
	public Employee getOne(int id);
	
	@Transactional
	@Modifying
	@Query("update Employee set salary=:salary where empId=:id")
	public void update(float salary,int id);
}
