package org.projects;

public class UserDefined_ProgB {
	
	//must be throws Throwable
	private static void cred(String a, String b) throws Throwable  {
		//if false then go to user defined exception
		if (a == "Hema1") {
			System.out.println("Correct");
		}
		else
		{
			//call the prog A default constructor
			throw new UserDefined_Exception_ProgA("Not matched");
		}
			
	}

	private static void age(int a) throws Throwable {
		if (a >= 18) {
			System.out.println("Vote");
		} else {
			throw new UserDefined_Exception_ProgA("Not Vote");
		}
	}
	
	//must give Throwable
	public static void main(String[] args) throws Throwable {
		cred("Hema", "Hemap");  //declare method as static so no need to create an object
		age(18);    //declare method as static so no need to create an object
	}
}
