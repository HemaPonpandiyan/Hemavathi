package org.projects;

public class Array_Eg {
public static void main(String[] args) {
	int a[][]=new int[2][2];   //size 4 (2*2)
	a[0][1]=10;
	a[1][1]=20;
	try {
		a[1][2]=30;     //array index out of bound exception
	} catch (Exception e) {     //try and catch is used to go next line even occurs error
		e.printStackTrace();     //it shows what error occurs
	}
    for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {   //nested for
			System.out.println(a[i][j]);
		}
	}
}
}
//Array is the collection of elements
// Array support only similar data types
//Array is high memory wastage-if value not given-it will assign 0(zero)