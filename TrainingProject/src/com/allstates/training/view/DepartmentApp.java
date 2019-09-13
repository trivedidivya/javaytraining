package com.allstates.training.view;

import java.util.Scanner;

public class DepartmentApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.get department");
			System.out.println("2.add depatment");
			System.out.println("3.remove department");
			int ch=sc.nextInt();
		}
		while(true);
	}

}
