package org.projects;

import java.util.Scanner;

public class Switch_St {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int h = s.nextInt();
	switch(h)
	{
	case 1:
		System.out.println("A");
		break;
	case 2:
		System.out.println("B");
		break;
	default:
		System.out.println("etc");
		break;
	}
	
}
}
