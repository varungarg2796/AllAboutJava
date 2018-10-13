package OOPS;

public class College {
	private String name;
	private Batch[] batches;
	String address;
	private int numBatches;
	private int maxBatches;


	College(String name, int maxBatches){
		this.name = name;
		this.maxBatches = maxBatches;
		batches = new Batch[maxBatches];
		numBatches = 0;
	}


	public boolean  addBatch(String bName, int size) {
		if(numBatches == maxBatches){
			return false;
		}

		if(batchExists(bName)){
			return false;
		}
		Batch b = new Batch(bName, size);
		batches[numBatches] = b;
		numBatches++;
		return true;	
	}

	private boolean batchExists(String name) {
		for(int i = 0; i < numBatches; i++){
			if(batches[i].getName().equals(name)){
				return true;
			}
		}
		return false;
	}


	public boolean addStudentToBatch(String sName, String bName) {
		if(!batchExists(bName)){
			return false;
		}
		Batch b = getBatch(bName);
		return b.addStudent(sName);
	}


	private Batch getBatch(String bName) {
		for(int i = 0; i < numBatches; i++){
			if(batches[i].getName().equals(bName)){
				return batches[i];
			}
		}
		return null;
	}


	public void printBatches() {
		for(int i = 0; i < numBatches; i++){
			System.out.println(batches[i].getName());
		}
	}


	public void printStudentsInBatch(String bName) {
		if(!batchExists(bName)){
			return ;
		}

		Batch b = getBatch(bName);
		b.printStudents();
		
	}
}
