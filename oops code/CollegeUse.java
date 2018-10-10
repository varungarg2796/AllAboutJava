package OOPS;

import java.util.Scanner;

public class CollegeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\n");
		System.out.println("Enter name :");
		String name = s.next();
		System.out.println("Enter max number of batches ");
		int maxBatches = s.nextInt();
		
		College c = new College(name, maxBatches);
		
		char ans = 'y';
		String bName, sName;
		int size;
		
		while(ans == 'y'){
			System.out.println("1. Enter Batch");
			System.out.println("2. Enter a student");
			System.out.println("3. View all Batches");
			System.out.println("4. View Students in a batch");
			int choice = s.nextInt();
			switch(choice){
			case 1 :
				System.out.println("Enter name of batch ");
				bName = s.next();
				System.out.println("Enter max size ");
				size = s.nextInt();
				boolean result = c.addBatch(bName,size);
				if(result){
					System.out.println("Batch added successfully  !!");
				}
				else{
					System.out.println("Can't add batch");
				}
				break;
				
			case 2 :
				System.out.println("Enter name ");
				sName = s.next();
				System.out.println("Enter batch ");
				bName = s.next();
				if(c.addStudentToBatch(sName,bName)){
					System.out.println("Student added !!");
				}
				else{
					System.out.println("Can't add ");
				}
				break;
			
			case 3 :
				c.printBatches();
				break;
					
			case 4 :
				System.out.println("Enter name of batch ");
				bName = s.next();
				c.printStudentsInBatch(bName);
				break;		
			}
	
			System.out.println("Want to continue : y/n");
			ans = s.next().charAt(0);
		}
		
		

	}

}
