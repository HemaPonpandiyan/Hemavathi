package org.projects;

public class String_Method {
	public static void main(String[] args) {
	String a="Dhanvin";
	String b="Vinodha";
	String c="Dhanvin";
	String d="He ma";
    System.out.println(a.length());
    System.out.println(a.isEmpty());
    if(a.equals(c))
    {
    	System.out.println("Equals");
    }
    else
    {
      	System.out.println("Not Equals");
    }
    System.out.println(a.contains("an"));
    System.out.println(a.toUpperCase());
    System.out.println(a.toLowerCase());
    System.out.println(a.indexOf('n'));
    System.out.println(b.charAt(0));
    System.out.println(a.replace('v', 'w'));
    System.out.println(a.substring(4));
    String[] s=a.split("vin");
    for(String st:s)
    {
    	System.out.println(st);
	}
    System.out.println(d.trim());
	}
	}
