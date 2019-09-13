package com.allstates.training.oops;

public class Person {
	String adarNum;
	String pname;
	long[] ph_num;
	String address;
	Person()
	{
		
	}
	Person(String adarNum,String pname,long[] ph_num,String address)
	{
		this.adarNum=adarNum;
		this.pname=pname;
		this.ph_num=ph_num;
		this.address=address;
		
	}
	void getPerson() {
		System.out.println("Person Details");
		System.out.println(adarNum+" "+pname+" "+ph_num[0]+" "+address);
		
	}
	public static void main(String args[])
	{
		long[] ph= {12345,21434};
		Person person=new Person("21312423","shubham",ph,"jkdcsjc");
		person.getPerson();
	}
	
}
