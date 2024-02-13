package com.excelr.service;

import java.util.List;

import com.excelr.model.Employee;

public interface ExcelrInterface {
	
	public void saveEmployee(Employee employee);
    public List<Employee> getallemp();
    public void deleteEmployee(int id);
    public Employee getemp(int id); 
 // because we need the emp data to be edited hence we are creating the Employee method
}
