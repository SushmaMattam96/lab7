package com.cg.eis.Service;

import java.util.HashMap;

public class EmployeeServiceImp implements EmployeeService {
	
	
	
	HashMap<String , Employee> list=new HashMap<String, Employee>();
	
	public void addEmployee(Employee emp) {
		
	    Employee e1=new Employee(101,"Sushma","Progammer",3000.23,"Scheme A");    
	    Employee e2=new Employee(102,"Abdulla","Tester",4000.34,"Scheme B");    
	    Employee e3=new Employee(103,"Akshaya","Associate",2500.32,"Scheme C");
	    
	    map.put(1,e1);  
	    map.put(2,e2);  
	    map.put(3,e3);
		
		
	    for(Map.Entry<String, Employee> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Employee emp=entry.getValue();  
	        System.out.println(key+" Employee Details:");  
	        System.out.println(emp.id+" "+emp.name+" "+emp.designation+" "+emp.salary+" "+emp.insurancescheme);
	}
	    @Override
	    public boolean deleteEmployee(int id)
	    {
	    	
	    	 HashMap<String,Employee> map=new HashMap<String,Employee>();          
	         map.put(1,e1);    
	         map.put(2,e2);    
	         map.put(3,e3);    
	       System.out.println("Initial list of elements: "+map);    
	       map.remove(1);
	       System.out.println("After deletion of elements:"+map);	
	    }
	

	@Override
	public String validateFields(double salary,String designation) {
		String result;
		if(salary>5000 && salary<20000 && designation.equals("System Associate"))
		{
			result="Scheme C";
		}
		
		else if(salary>=20000 && salary<40000 && designation.equals("Programmer"))
		{
		    result="Scheme B";
		}
		else if(salary>=40000 && designation.equals("Manager"))
		{
			result="Scheme A";
		}
		else
		{
			if(salary<5000 && designation.equals("Clerk"))
			{
			result="No Scheme";
		    }
			else
			{
				result="Error";
			}
		}
		return result;
	}
		

}
