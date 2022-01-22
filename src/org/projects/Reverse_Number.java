package org.projects;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = 0, r1;
		System.out.println("Enter the Number: " + n);
		while (n > 0) {
			r1 = n % 10;
			r = (r * 10) + r1;
			n = n / 10;
		}
		System.out.println(r);
	}

}
