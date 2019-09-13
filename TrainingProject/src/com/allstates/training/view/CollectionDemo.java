package com.allstates.training.view;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.allstates.training.oops.Person;
public class CollectionDemo {
public static void main(String[] args) {
	List<Department> deps=new ArrayList<>();
        deps.add(new Department(123,"dveel"));
        deps.add(new Department(234,"dfgh"));
        deps.add(new Department(11,"sales"));
        Collections.sort(deps,(d1,d2)->d1.getDname().compareTo(d2.getDname()));
	System.out.println(deps);
}
}
