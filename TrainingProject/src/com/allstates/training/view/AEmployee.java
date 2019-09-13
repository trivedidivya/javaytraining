package com.allstates.training.view;

public class AEmployee{
	private int empno;
	private String name;
	private double salary;
     private String address;
    

	public AEmployee(int empno, String name, double salary, String address) {
		
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}


	@Override
	public String toString() {
		return "AEmployee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}




	
	
     
}
