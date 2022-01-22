package org.projects;

//Array is the collection of elements
//support only similar data types
//memory wastage--if value not given-it will assign 0(zero)
//we can overcome this using collections

public class Array_Ex {
public static void main(String[] args) {
	int a[][]=new int[2][2];
	a[0][1]=5;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[i][j]);	
		}
	}
}
}
