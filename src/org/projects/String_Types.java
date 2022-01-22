package org.projects;

public class String_Types {
	public static void main(String[] args) {
		//this is immutable string
		//for duplicate--share the memory or the same memory for duplicate values
	String a="Hema";   //dup
	String b="Hema";   //dup  a==b
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	//same output
	System.out.println(System.identityHashCode(a+b));
	//different output --for add or concate it creates new memory
	
	
    //Mutable string
	//for duplicate--it will create new memory
	StringBuffer a1=new StringBuffer("Hema");   //dup
	StringBuffer b1=new StringBuffer("Hema");   //dup
	System.out.println(System.identityHashCode(a1));
	System.out.println(System.identityHashCode(b1));
	//different output
	System.out.println(System.identityHashCode(a1.append(b1)));
	//same output---for append, it will share the member
	}	
}
