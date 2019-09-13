package com.allstates.training.assignment;

public class savingaccount implements Account{
private long accnum;
private double balance;
public savingaccount(long accnum,double balance)
{
	this.accnum=accnum;
	this.balance=balance;
}
public double getBalance()
{
	return balance;
}
@Override
public double withdraw(double amount)

{
	if(amount>0 && amount>(balance-1000))
		balance-=amount;
	else if(amount==balance)
		System.out.println("Minimum balance");
	else if(amount<0)
		System.out.println("Wrong input");
	else
		System.out.println("low balance");
	return balance;
}
@Override
public double deposit(double amount)
{
	if(amount>0 && amount%100==0)
	balance+=amount;

else if(amount<0)
	System.out.println("Wrong input");
return balance;

}

}
