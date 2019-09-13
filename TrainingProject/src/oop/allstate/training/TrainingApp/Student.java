package oop.allstate.training.TrainingApp;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import com.allstates.training.view.CourseDao;

public class Student implements Serializable {
	private int stid;
	private String stname;
	private long phno;
	private String dob;
	public Student(int stid, String stname, long phno, String dob) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.phno = phno;
		this.dob = dob;
	}
	
	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", phno=" + phno + ", dob=" + dob + "]";
	}
    
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice");
		CourseDao cs=new CourseDao();
		int s=sc.nextInt();
		
	    if(s==1)
	    {
		
		System.out.println("enter details");
		Student st=new Student(sc.nextInt(),sc.next(),sc.nextLong(),sc.next());
		cs.addCourse(st);
	    }
	    else if(s==2)
	    {
	    	Student s2=cs.getCourse();
	    System.out.println(s2);	
	    }
	}
    
	

}
