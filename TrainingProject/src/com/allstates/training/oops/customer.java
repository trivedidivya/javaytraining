package com.allstates.training.oops;
import java.util.Scanner;
public class customer {

	 int bsaving;
	 int bcurrent;
	customer()
	{
		bsaving=2000;
		bcurrent=20000;
	}
	public int withdraw(int c,int amount)
	{
		if(c==1 && bsaving-amount>1000)
		{
			bsaving-=amount;
			return bsaving;
		}
		else if(c==2 && bcurrent-amount>10000)
		{
			bcurrent-=amount;
			return bcurrent;
		}
		else
			System.out.println("cannot withdraw amount");
		return 0;
	}
	
	public int deposit(int c,int amount)
	{
		if(c==1 && amount%100==0)
		{
			bsaving+=amount;
			return bsaving;
		}
		else 
		{
			bcurrent+=amount;
			return bcurrent;
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int c=sc.nextInt();
		int amount=sc.nextInt();
		int balanceamount=0;
		customer ct=new customer();
		if(t==1)
			balanceamount = ct.withdraw(c,amount);
		else {
			if(t==2)
			 balanceamount=ct.deposit(c, amount);}
		System.out.print(balanceamount);
		
	}
}
