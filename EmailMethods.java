package javaApp;

import java.util.Scanner; //package for scanner class

public class EmailMethods{
	//create private variables so that these data members cannot be accessed by any other class.(encapsulation) 
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private int passwordLength=10;
	private int mailCapacity=500;
	private String alternateEmail;
	private String email;
	private String companySuffix="company.com";
	
	//create constructor for getting the user name.
	public EmailMethods(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		//call the departmentName method to get the department.
		this.department = departmentName();
		System.out.println("\nDepartment : "+this.department);
		//call the randomPassword method to get the password.
		this.password=randomPassword(passwordLength);
		//structure your email as "firstname.lastname@department.company.com".
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
		
	}
	//method to get the department from the user.
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
	
	//method to generate random password for your mail ID.
	private String randomPassword(int length) {
		String randompassword ="ABCDEFGHILMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random() * randompassword.length());
			password[i]= randompassword.charAt(rand);
		}
		return new String(password);
	}
	
	//this method is to SET variables to their values.
	public void setMethod(int capacity,String altEmail,String password) {
		this.mailCapacity = capacity;
		this.alternateEmail = altEmail;
		this.password = password;
	}
	
	//the following methods is used to GET the attributes from the set method.
	public int getMailCapacity() {return mailCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	//method to display your name,password and mailcapacity.
	public String showInfo() {
		return "Display Name : "+firstname+" "+lastname+
				"\nCompany Email : "+email+
				"\nPassword : "+password+
				"\nMailBox Capacity : "+mailCapacity+ "mb";
	}
	
	
}
