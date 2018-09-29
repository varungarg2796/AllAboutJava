package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses ="" ;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000; //static means true for the class
	
	
	//Constructor prompt to enter student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name:");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name:");
		this.lastName = in.nextLine();
		
		System.out.print("1- Freshmen\n2- Sophmore\n3- Junior\n4- Sophmore\nEnter Student Class Level");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " "+ studentID);
		
		
	}
	
	
	//Generate an ID
	private void setStudentID() {
		
		//Grade Level + ID
		id ++;
		this.studentID = gradeYear + "" + id;
		
		
	}
	//Enroll in course
	
	public void enroll() {
		
		do {
			System.out.print("Enter courses to enroll (Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}else {
				break;
			}
		} while(1!=0);
		
		System.out.println("ENROLLED IN:" + courses);
		System.out.println("Tuition Balance:" + tuitionBalance);
		
	}
	
	//View balances
	public void viewBalance() {
		System.out.println("Your balance is $:");
	}
	
	//Pay tuition
	
	//Show status
	

}
