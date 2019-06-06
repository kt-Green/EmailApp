package javaApp;

import java.util.Scanner;

public class EmailApplication {
	public static void main(String[]args) {
		String firstname;
		String lastname;
		Scanner name=new Scanner(System.in);
		System.out.println("Enter your First name:");
		firstname=name.next();
		System.out.println("Enter your Last name:");
		lastname=name.next();
		EmailMethods em=new EmailMethods(firstname,lastname);
		System.out.println(em.showInfo());
	
	}
}
