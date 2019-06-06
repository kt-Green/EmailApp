package javaApp;

import java.util.Scanner;

public class EmailMethods{
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private int passwordLength=10;
	private int mailCapacity=500;
	private String alternateEmail;
	private String email;
	private String companySuffix="company.com";
	
	public EmailMethods(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.department = departmentName();
		System.out.println("\nDepartment : "+this.department);
		
		this.password=randomPassword(passwordLength);
		
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
		
	}
	
	private String departmentName() {
		System.out.println("New Worker : "+firstname+"\nDepartment Codes:\n1.for Sales\n2.for Development\n3.for Support\n0.for none");
		System.out.println("Enter the Department code : ");
		Scanner in= new Scanner(System.in);
		int deparmentChoice=in.nextInt();
		if(deparmentChoice==1) {return "Sales";}
		else if(deparmentChoice==2) {return "Development";}
		else if(deparmentChoice==3) {return "Support";}
		else {return "None choosen";}
	}
	
	private String randomPassword(int length) {
		String randompassword ="ABCDEFGHILMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random() * randompassword.length());
			password[i]= randompassword.charAt(rand);
		}
		return new String(password);
	}
	public void setMethod(int capacity,String altEmail,String password) {
		this.mailCapacity = capacity;
		this.alternateEmail = altEmail;
		this.password = password;
	}
	public int getMailCapacity() {return mailCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Display Name : "+firstname+" "+lastname+
				"\nCompany Email : "+email+
				"\nPassword : "+password+
				"\nMailBox Capacity : "+mailCapacity+ "mb";
	}
	
	
}
