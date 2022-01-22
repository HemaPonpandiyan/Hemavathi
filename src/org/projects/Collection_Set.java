package org.projects;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {
public static void main(String[] args) {
	
	//set is value based
	//set not allow duplicate value only take one value in dup values
	
	//Hashset random order
	Set<Object> s=new HashSet<Object>();
	s.add("Hema");
	s.add("Kaththalingam");
	s.add("Dhanvin");
	s.add("Hema");
	System.out.println(s);
	System.out.println(s.size());
	
	//insertion order
	Set<Object> s1=new LinkedHashSet<Object>();
	s1.add("Vinodha");
	s1.add("Shanthi");
	s1.add("Ponpandiyan");
	System.out.println(s1);
	System.out.println(s.iterator());
	
	//Ascending order
	Set<Object> s2=new TreeSet<Object>();
	s2.add("Velkani");
	s2.add("Hema");
	s2.add("Kasinadar");
	System.out.println(s2);
	
	s2.clear();
	System.out.println(s2);
}
}
