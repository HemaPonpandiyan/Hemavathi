package org.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//collection is the interface
public class Collections_Types_List {
public static void main(String[] args) {
	//Types----List,Set and Map
	//List Types --ArrayList,LinkedList and vector
	//syntax--List<Wrapper class> refname=new ListTyes<Wrapper class>();
	//Wrapper class --- converts datatypes to objects
	
	//List allow dups
	
	List<Object> l=new ArrayList<Object>();    //ArrayList
	
	//add values---index based---Arraylist
	l.add("Hema");
	l.add("Hema");
	l.add(12);
	l.add('a');
	l.add("Dhanvin");
	l.add("Dhanvin");
	l.add("Vinodha");
	l.add("Kaththalingam");
	
	//add the value using index
	l.add(1, "Shanthi");
	//get the value using index
	System.out.println(l.get(1));
	//replace the value
	l.set(0, "Hemavathi");
	System.out.println(l);
	//remove the value using index
	l.remove(3);
	//check if Hemavathi presents or not
	System.out.println(l.contains("Hemavathi"));
	
	//give the index of the given value Dhanvin
	System.out.println(l.indexOf("Dhanvin"));
	
	
	List<Object> l1=new Vector<Object>();    //Vector list
	l1.add("Ponpandiyan");
	l1.add("Velkani");
	l1.add("Hemavathi");
	

		
	//it will return only the duplicate values in 2 lists
	l.retainAll(l1);
	System.out.println(l);
	
	//add 2 lists but now we have in "l" list is only Hemavathi
	l.addAll(l1);
	System.out.println(l);
	
	
	//it will remove the values in duplicates
	l1.removeAll(l);
	System.out.println(l1);
	
}
}
