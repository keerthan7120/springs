package com.sprongsconfig.noxml;

import org.springframework.stereotype.Component;

@Component("Employee")
public class Employeed implements EmployeeSerevice
{
	
	private EmployeeSerevice employeeservice;

	public EmployeeSerevice getEmployeeservice() {
		return employeeservice;
	}
	public void setEmployeeservice(EmployeeSerevice employeeservice) {
		this.employeeservice = employeeservice;
	}
	@Override
	public String getDetails()
	{
		return "details";
		

	}
	@Override
	public String setDetails() 
	{
		return "details 2";
	  
		
	}
  
	
	
	
}
