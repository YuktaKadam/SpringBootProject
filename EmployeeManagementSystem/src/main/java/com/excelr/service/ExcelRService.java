package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.Employee;
import com.excelr.repo.Excelrepo;

@Service
public class ExcelRService implements ExcelrInterface {

	
	@Autowired
	 private Excelrepo repo;
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
	
		double basic_salary=0.0;
		
	    basic_salary=employee.getEmp_ctc() *0.3;
	    employee.setBasic_sal(basic_salary);
	    
	    double pf=0.0;
	    pf=employee.getEmp_ctc() * 0.12;
	    employee.setPf(pf);
		
	    double allowances=0.0;
	    allowances= employee.getEmp_ctc()*0.1;
	    employee.setAllowances(allowances);
	    
	    double tds=0.0;
	    tds=employee.getEmp_ctc()*0.3;
	    employee.setTds(tds);
	    
	     final double professional_tax=200;
	     employee.setProf_tax(professional_tax);
	     
	     double net_sal=0.0;
	     net_sal= basic_salary -pf +allowances-tds- professional_tax;
	     employee.setNet_sal(net_sal);
	     
	     repo.save(employee);
	     
	     
	}
	@Override
	public List<Employee> getallemp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public void deleteEmployee(int id) {
		
		repo.deleteById(id);
		
	}
	@Override
	public Employee getemp(int id) {
		// TODO Auto-generated method stub
		
		return repo.findById(id).get();
	}
	
	
	

}
