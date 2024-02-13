package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.model.Employee;
import com.excelr.service.ExcelRService;

@Controller
public class ExcelRController {
	
	@Autowired
	 private ExcelRService service;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/addemployee")
	public String addemployee()
	{
		return "addemployee";
	}
	
	@RequestMapping("/success")
	public String success(Employee employee)//(4 variables) data will be avialable to the model created
	{
		service.saveEmployee(employee);
		return "success";
		
	}
	@RequestMapping("/viewemployees")
	public String viewemployees(ModelMap model)
	{
		model.put("employees", service.getallemp());
		return "viewemployees";
	}
	@RequestMapping("/deletemp/{id}")
	public String deleteemp(@PathVariable int id)
	{
		service.deleteEmployee(id);
		return "redirect:/viewemployees";
	}
	@RequestMapping("/editemp/{id}")
	public String editemp(@PathVariable int id, ModelMap model)  //fetching the records
	{
		model.put("employee",service.getemp(id));   //storing the records again in model 
		return "editemp";
	}
	@RequestMapping("/updateandsave")
	public String updateandsave(Employee employee)  //fetching the records
	{
		service.saveEmployee(employee);  //storing the records again in model 
		return "redirect:/viewemployees";
	}
	
	
	
	

}
