package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	//user informations
	@Id
	private int emp_id;
	private String emp_name;
	private String emp_img;
	private double emp_ctc;
	
	//Internal variables
	private double basic_sal;
	private double pf;
	private double allowances;
	private double tds;
	private double prof_tax;
	private double net_sal;
	
	public Employee(int emp_id, String emp_name, String emp_img, double emp_ctc, double basic_sal, double pf,
			double allowances, double tds, double prof_tax, double net_sal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_img = emp_img;
		this.emp_ctc = emp_ctc;
		this.basic_sal = basic_sal;
		this.pf = pf;
		this.allowances = allowances;
		this.tds = tds;
		this.prof_tax = prof_tax;
		this.net_sal = net_sal;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_img=" + emp_img + ", emp_ctc=" + emp_ctc
				+ ", basic_sal=" + basic_sal + ", pf=" + pf + ", allowances=" + allowances + ", tds=" + tds
				+ ", prof_tax=" + prof_tax + ", net_sal=" + net_sal + "]";
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_img() {
		return emp_img;
	}
	public void setEmp_img(String emp_img) {
		this.emp_img = emp_img;
	}
	public double getEmp_ctc() {
		return emp_ctc;
	}
	public void setEmp_ctc(double emp_ctc) {
		this.emp_ctc = emp_ctc;
	}
	public double getBasic_sal() {
		return basic_sal;
	}
	public void setBasic_sal(double basic_sal) {
		this.basic_sal = basic_sal;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public double getTds() {
		return tds;
	}
	public void setTds(double tds) {
		this.tds = tds;
	}
	public double getProf_tax() {
		return prof_tax;
	}
	public void setProf_tax(double prof_tax) {
		this.prof_tax = prof_tax;
	}
	public double getNet_sal() {
		return net_sal;
	}
	public void setNet_sal(double net_sal) {
		this.net_sal = net_sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
