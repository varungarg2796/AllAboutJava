package OOPS;

import java.util.Scanner;

public class Student {

	private  String name ;
	private int rollNo;
	String address;
	private static int numStudents;
	Batch b;

	Student(String sname, Batch b){
		name = sname;
		numStudents++;
		rollNo = b.getBatchId()*100 + numStudents;
		this.b = b;
	}

	public void print() {
		System.out.println(name +" "+rollNo);
		
	}





	/*
	public String getName(){
		return name;
	}
	public void setName(){
		//name = "";
	}

	public void setRollNo(int r){
		rollNo = r;
	}

	public static void setNumStudents(){
//	System.out.println(rollNo);
		numStudents++;
	}

	public  int getNumStudents(){
		return numStudents;
	}*/

}
