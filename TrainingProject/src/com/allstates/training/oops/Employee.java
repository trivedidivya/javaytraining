package com.allstates.training.oops;

public class Employee extends Person{
	private double salary;
	private int empid;
	public Employee(double salary,int empid)
	{
		this.salary=salary;
		this.empid=empid;
	}
	public int getid()
	{
		return this.empid;
	}
	public double getsalary()
	{
		return this.salary;
	}
public static void main(String args[])
{
Employee e1=new Employee(241341,34);
System.out.println(e1.getsalary());
}

}
