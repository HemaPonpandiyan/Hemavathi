package org.projects;

public class Reverse_No {
public static void main(String[] args) {
	int no=6785;
	int reverse=0;
	int temp;
	while(no>0)
	{
	temp=no%10;
	reverse=(reverse*10)+temp;
	no=no/10;
}
	System.out.println(reverse);
}
}
