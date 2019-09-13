package com.allstates.training.view;
import com.allstates.training.view.AEmployee;
import com.allstates.training.view.Department;
import java.util.Scanner;
public class EmployeeApp {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Department department=new Department(12,"Production");
		AEmployee em= new AEmployee(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next());
		System.out.println(em);
		System.out.println(department);
	}
	
}
