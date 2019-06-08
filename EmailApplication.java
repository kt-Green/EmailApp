package javaApp;

import java.util.Scanner; //package for SCanner calss.

//in this class we are calling the class EmailMethods just by passing the firstname and lastname attributes.
public class EmailApplication {
	public static void main(String[]args) {
		String firstname;
		String lastname;
		Scanner name=new Scanner(System.in);
		System.out.println("Enter your First name:");
		firstname=name.next();
		System.out.println("Enter your Last name:");
		lastname=name.next();
		//create an object for your class to acces the class members.
		EmailMethods em=new EmailMethods(firstname,lastname);
		//print your EmailId and password details by calling the showInfo through the object created.
		System.out.println(em.showInfo());
	
	}
}
