package com.allstates.training.view;
import oop.allstate.training.TrainingApp.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class trainingApp {
	
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		CourseDao od=new CourseDao();
		System.out.println("enter choice"
				+ "1. create trainer"
				+ "2.create course 3. create student"
				+ "4. exit");
		Course c1=new Course();
		Trainer t1=new Trainer();
		int choice=sc.nextInt();
		if(choice==1)
		{
			t1.setTarinerName(sc.next());
			t1.setTrainerid(sc.nextInt());
			System.out.println(t1);
						
		}else if(choice==2)
		{
			c1.setCourseid(sc.nextInt());
			c1.setCourseName(sc.next());
			

			System.out.println("Do you want to set trainer? Y/N");
			char c=sc.next().charAt(0);
			if(c=='Y') {
				Trainer t2=new Trainer(sc.nextInt(),sc.next());
				c1.setTrainer(t2);
			}
		
			System.out.println(c1);
		}else if(choice==3)
		{
	     System.out.println("1. Regular student 2. Distance Student");
		int op=sc.nextInt();
		if(op==1)
		{
			System.out.println("enter id,name ,phnum,dob");
			
			RegularStudent rg=new RegularStudent(sc.nextInt(),sc.next(),sc.nextLong(),sc.next());
			System.out.println("new student created");
			System.out.println(rg);
			System.out.println("DO you wan tot add the course? Y/N");
			int ch=sc.next().charAt(0);
		    if(ch=='Y')
		    {
		    	Course java=new Course(12,"Java");
		    	System.out.println(java);
		    }
		    else
		    	System.out.println("koi na");
		}
		else if(op==2)
		{
			System.out.println("enter id,name ,phnum,dob");
			int id=sc.nextInt();
			String s1=sc.next();
			Long l=sc.nextLong();
			String s2=sc.next();
			
			DistanceStudent ds=new DistanceStudent(id,s1,l,s2);
			System.out.println("new student created");
			System.out.println(ds);
			System.out.println("DO you want to add the course? Y/N");
			int ch=sc.next().charAt(0);
		    if(ch=='Y')
		    {
		    	Course java=new Course(12,"Java");
		    	Course[] courses=new Course[2];
		    	courses[0]=java;
		    	ds.setCourse(courses);
		    }
		}
			
		
		}
			
	
	
	}	

}
