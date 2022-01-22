package org.projects;

public class Static_Keywords {
public static void main(String[] args) {
	meth();   //no need to create an object due to used the keyword static
}
static {                               //static keyword run first
	System.out.println("Hi Hema");
}
static private void meth() {           //static keyword used to call or invoke the meth without creating obj
System.out.println("Welcome");
}
}
