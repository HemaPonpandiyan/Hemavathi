package org.projects;

public class Construct {
public static void main(String[] args) throws Throwable{
	//call the constructor when we create a object
	Construct d=new Construct("Hema");
	//used to clear the memory
//	d.finalize();
}
public Construct(String n) //signature part
{
	this(28);    //used to call other constructor and this is used to call constructor easily without memory wastage
	System.out.println(n);   //implementation part
}
public Construct(int a)
{
	System.out.println(a);
}
}
