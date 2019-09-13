package com.allstates.training.view;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo2 {
	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add(new String("divya"));
		li.add(new String("baishali"));
		li.add(0,new String("shubham"));
		li.add(2,new String("deepti"));
		li.add(new String("keyur"));
		System.out.println(li);
		
		List<String> li2=new ArrayList<>();
		li2.addAll(li);
		li2.add("budhil");
		li2.add(2,"gaurav");
		
		System.out.println(li2);
		li2.removeIf(n->(n.charAt(0)=='s'));
		System.out.println("after removal");
		//li2.retainAll(li);
		//li2.removeAll(li);
		System.out.println(li2);
	}

}
