package org.projects;

import java.util.Scanner;

public class TryCatch {
public static void main(String[] args) {
	int a=10;
	try {
		//Arithmetic exception
		System.out.println(a/0);   //Arith exception occurs
	}
	catch(Exception e){
		e.printStackTrace();   //used to print the error
	}
	finally {     //if error occurs or not it will be printed
		System.out.println("Process completed");
	}
	Scanner s=new Scanner(System.in);
	System.out.println("No:");
	try {
		int n = s.nextInt();    //input mismatch exception
	} catch (Exception e) {
		e.printStackTrace();
	}	
System.out.println("gone next row even exception occurs");

}
}
