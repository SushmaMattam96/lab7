package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Scanner;

import com.cg.eis.Service.EmployeeService;
import com.cg.eis.Service.EmployeeServiceImp;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class MainClass {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceImp();
		
		HashMap<String , Employee> list=new HashMap<String, Employee>();
		service.addEmployee(Employee emp);
		
		try {
			if (salary < 3000)
				throw new EmployeeException("Please enter salary greater than 3000");
			else
			{
			employee.setName(name);
			employee.setId(id);
			employee.setSalary(salary);
			employee.setDesignation(designation);

			EmployeeService service = new EmployeeServiceImp();
			String insuranceScheme = service.validateFields(salary, designation);
			employee.setInsurancescheme(insuranceScheme);
			System.out.println(" Id: " + employee.getId() + "\n Name: " + employee.getName() + "\n Designation: "
					+ employee.getDesignation() + "\n Salary: " + employee.getSalary() + "\n Insurance Scheme: "
					+ employee.getInsurancescheme());
			sc.close();
			}

		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}

	}

}
