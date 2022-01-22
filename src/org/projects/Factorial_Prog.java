package org.projects;

import java.util.Scanner;

public class Factorial_Prog {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),fact=1;
	System.out.println("Enter the no: "+n);
	for (int i = 1; i <= n; i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
