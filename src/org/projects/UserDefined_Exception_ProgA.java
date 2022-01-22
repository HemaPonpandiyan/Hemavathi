package org.projects;

//must be extends the sub class of Throwable
public class UserDefined_Exception_ProgA extends Exception {
	
	//non-parameterized constructor
	public UserDefined_Exception_ProgA(String s1) {
		System.out.println("This was Exception");
	}

}

//Object-->Throwable--->Exception--->ArithmenticExceptions...etc
