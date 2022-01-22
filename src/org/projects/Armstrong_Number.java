package org.projects;

import java.util.Scanner;

public class Armstrong_Number {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Number");
	int a = s.nextInt();
	int temp=a;
	int j=0;
	while(temp>0) {
		int i=temp%10;
		j=j+(i*i*i);
	    temp=temp/10;
	}
	if(j==a)
	System.out.println("Armstrong No");
	else
		System.out.println("Not a Armstrong No");
}
}
