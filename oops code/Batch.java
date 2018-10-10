package OOPS;

public class Batch {

	private String name;
	Student[] students;
	private int maxSize;
	int numStudents;  // Number of students in the batch
	private static int numBatches;
	
	Batch(String name, int maxSize){
		this.name = name;
		this.maxSize = maxSize;
		students = new Student[maxSize];
		numStudents = 0;
		numBatches++;
	}
	
	public String getName(){
		return name;
	}
	
	public int getBatchId(){
		return numBatches;
	}
	
	public int getSize(){
		return numStudents;
	}

	public boolean addStudent(String sName) {
		if(numStudents == maxSize){
			return false;
		}
		Student s = new Student(sName, this);
		students[numStudents] = s;
		numStudents++;
		return true;
		
	}

	public void printStudents() {
		for(int i =0; i < numStudents; i++){
			students[i].print();
		}
		
	}
	
}
