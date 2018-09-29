package emailApplication;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String companySuffix = "milltown.com";
	
	//Constructor to recieve first and last name
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Crated: "+ this.firstName + " " + this.lastName);
		
		//calls a method for asking a departemnt --returns string
		this.department = setDepartment();
		//System.out.println("Department:"+this.department);
		
		//call a method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your new password is " + this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; 
		//System.out.println("Your email is:" + email);
	}
	
	
	//Ask for Department (private so that it is only accessible to the IT guy
	private String setDepartment() {
		System.out.print("New worker:" +firstName+". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for nothing ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales";
		} else if(depChoice == 2) {
			return "dev";
		} else if(depChoice ==3) {
			return "acct";
		} else {
			return "";
		}
		
	}
	
	//Generate a random password 
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJLMNOPQRSTUVWXYZ0123456789@#$%^";
		char[] password = new char[length];
		
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password); //so that it creates a brand new copy all the time
	}
	
	
	//Set the mailbox capacity
	//Encapsulation happening below
	
	public void setMailBoxCapacity (int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//set an alternate email
	public void setAlternateEmail (String altEmail) {
		this.alternateEmail = altEmail; //this not needed here but still is a good practice to write it this way
	}
	
	//change password
	public void changePassword (String password) {
		this.password = password;
	}
	
	//encapsulation and data binding through get methods
	public int getMailboxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	//get the relevant info
	public String showInfo() {
		return "Display Name: " +firstName + " " + lastName +
				"\nCompany Email: " +email +
				"\nMailbox Capacity:" + mailBoxCapacity ;
	}
	
}
