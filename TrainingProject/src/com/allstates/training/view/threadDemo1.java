package com.allstates.training.view;

public class threadDemo1 {
public static void main(String[] args) {
	
	Thread t=null;
	t=Thread.currentThread();
	t.setName("springpeople");
	System.out.print(t);
	System.out.println(t.toString());
}
}
