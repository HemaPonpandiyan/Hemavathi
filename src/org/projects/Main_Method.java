package org.projects;

public class Main_Method {
	
	//we can use the access specifier as public only in main method due to it was only having the global level access
	//static--not given prog not working due to static help to call the main method without creating object
	//void--does not having any return type--empty space
	//main method is use to starting point of the prog and JVM first search or run the static block then run the main method.
	//comment line argument string[] only working
	//args--can give anything in args
public static void main(String hema[]) {
	System.out.println("Hello Hema");
}
}
//Main method-we can overload because i can given hema[] and anything is possible to working but we cannot override-due to static keyword