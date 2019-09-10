package com.sakha.Management.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class EmployeeAspect
{
	@Before("execution(* com.sakha.Management.service.EmployeeService.deleteEmp(..))")
	public void showDeleteLog()
	{
		System.out.println("Deleting");
	}
	@AfterReturning("execution(* com.sakha.Management.service.EmployeeService.deleteEmp(..))")
	public void showDeleteLog1()
	{
		System.out.println("Deleted");
	}
	@AfterThrowing("execution(* com.sakha.Management.service.EmployeeService.deleteEmp(..))")
	public void showDeleteLog2()
	{
		System.out.println("Deletion failed");
	}
	
}
