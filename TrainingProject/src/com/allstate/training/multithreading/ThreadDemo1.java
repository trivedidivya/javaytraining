package com.allstate.training.multithreading;

public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread mythread =new MyThread();
		MyThread2 mythread2 =new MyThread2();
		Thread thread =new Thread(mythread,"mythread");
		thread.start();
		
	}
}
