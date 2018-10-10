package OOPS;

import java.util.Scanner;

public class StudentUse {

/*	public static void demo(){
		Student s = new Student();
		System.out.println(s.name);
	}*/
	
	
	
	public static void main(String args[]){
		
		 Scanner console = new Scanner(System.in);
		
		 int i;
		// Student.getNumStudents();
		 Student s = new Student("abc",12);
		// Student s = new Student();
		 s.setRollNo(101);
	//	 s.name = "abc";
		 System.out.println(s.getName() + " "+ s.rollNo) ;
		 
		 
		 Student s1 = new Student("def",13);
		 System.out.println(s1.getName() + " "+ s1.rollNo) ;
	/*	 
		 System.out.println(s.name);
		 System.out.println(s1.name);
		 System.out.println(s.rollNo);
		 s.getNumStudents();*/
		 
	//	 System.out.println(i);
		 
		/*Student s = new Student();
		System.out.println("Enter name");
		s.name = console.nextLine();
		System.out.println(s.name);
		System.out.println();
	//	s.numStudents++;
		Student.incrementCount();
		Student s1 = new Student();
		s1.name = "Manisha";
		System.out.println(s1.name);
		Student.incrementCount();
		System.out.println(Student.getNumStudents());*/
	//	System.out.println(s1.numStudents);
		
		/*Student s1 = new Student();
		s1.name = "Nidhi";
		
		System.out.println(s.name);
		System.out.println(s1.name);*/
		
		
	}
}
