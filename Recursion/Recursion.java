import java.util.Scanner;


public class Recursion {


	public static int fact(int num) throws InvalidInputException{
		if(num < 0){
			InvalidInputException e = new InvalidInputException();
			throw e;
		}
		
		if(num == 0){
			return 1;
		}

		return num*fact(num - 1);
	}


	public static int fib(int n){
		if(n==1 || n==2){
			return 1;
		}

		return fib(n-1) + fib(n-2);

	}


	public static String helper(int n){
		if(n == 1){
			return "one";
		}
		else if(n == 2){
			return "two";
		}
		else if(n==3){
			return "three";
		}
		else{
			return "";
		}
	}


	public static String helper1(int num){
		String ans ="";
		switch(num) {
		case 1 :
			ans = "one";
			break;
		case 2 :
			ans = "two";
			break;
		default :
			ans = "";
		}

		return ans;
	}

	public static String numberToWords(int num){
		if(num < 10){
			return helper(num);
		}

		String smallOutput = numberToWords(num/10);
		int lastDigit = num % 10;
		String wordForLastDigit = helper(lastDigit);
		String ans = smallOutput + " " + wordForLastDigit;
		return ans;
	}


	public static boolean checkSorted(int[] input){
		if(input.length == 1 || input.length == 0){
			return true;
		}

		if(input[0] > input[1]){
			return false;
		}
		int[] smallInput = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i-1] = input[i];
		}

		boolean smallOutput = checkSorted(smallInput);
		return smallOutput;
	}


	// check if an array is sorted from beginIndex to length - 1
	public static boolean checkSorted1(int[] input, int beginIndex){
		if(beginIndex >= input.length-1){
			return true;
		}
		if(input[beginIndex] > input[beginIndex + 1]){
			return false;
		}

		boolean smallOutput = checkSorted1(input, beginIndex+ 1);
		return smallOutput;


	}


	public static int lastIndexOf(int input[],int beginIndex,int num){
		if(beginIndex > input.length-1){
			return -1;
		}

		int smallAns = lastIndexOf(input, beginIndex+1, num);
		if(smallAns == -1){
			if(input[beginIndex] == num){
				return beginIndex;
			}
			else{
				return -1;
			}
		}
		return smallAns;

	}



	public static int[] returnAllIndices(int[] input,int beginIndex,int num){
		if(beginIndex > input.length-1){
			int output[] = new int[0] ;
			return output;
		}

		int[] smallOutput = returnAllIndices(input, beginIndex+1, num);

		if(input[beginIndex] == num){
			int[] output = new int[smallOutput.length + 1];
			int i;
			output[0] = beginIndex;
			for(i = 0; i < smallOutput.length; i++){
				output[i+1] = smallOutput[i];
			}
			//output[i] = beginIndex;
			return output;
		}
		else{
			return smallOutput;
		}
	}


	public static void returnAllIndices(int[] input,int beginIndex,
			int[] output,int nextIndex,int num){

		if(beginIndex > input.length-1){
			return;
		}

		if(input[beginIndex] == num){
			output[nextIndex++] = beginIndex;
			//nextIndex++;
		}
		returnAllIndices(input, beginIndex+1, output, nextIndex, num);
	}

	public static void selectionSortR(int[] input, int beginIndex){

		if(beginIndex >= input.length-1){
			return;
		}

		int min = input[beginIndex];
		int minPos = beginIndex;

		for(int i = beginIndex+1; i < input.length; i++){
			if(input[i] < min){
				min = input[i];
				minPos = i;
			}
		}
		if(minPos != beginIndex){
			input[minPos] = input[beginIndex];
			input[beginIndex] = min;
		}

		selectionSortR(input, beginIndex+1);
	}

	
	
	
	public static String[] subSequences(String input){
		if(input.length() == 0){
			String output[] = new String[1];
			output[0] = "";
			return output;
		}
		
		String smallOutput[] = subSequences(input.substring(1));
		String output[] = new String[2*smallOutput.length];
		
		for(int i =0; i < smallOutput.length; i++){
			output[i] = smallOutput[i];
		}
		for(int i = 0; i <smallOutput.length;i++){
			output[smallOutput.length+i] = input.charAt(0)+smallOutput[i];
		}
		
		return output;
		
	}

	public static void mergeSort(int[] input){
		if(input.length <= 1){
			return;
		}
		int mid = input.length/2;
		int[] part1 = new int[mid];
		int[] part2 = new int[input.length - mid];
		for(int i = 0; i < mid; i++){
			part1[i] = input[i];
		}
		
		for(int i = mid; i < input.length; i++){
			part2[i - mid] = input[i];
		}
		mergeSort(part1);
		mergeSort(part2);
		merge(part1, part2, input);
	}
	
	public static void merge(int input1[],int[] input2,int[] output){
		int i=0,j=0,k=0;
		//int output[] = new int[input1.length + input2.length];
		
		while(i < input1.length && j < input2.length){
			if(input1[i] < input2[j]){
				output[k] = input1[i];
				i++;
				k++;
			}
			else{
				output[k] = input2[j];
				j++;
				k++;
			}
		}
		while(i < input1.length){
			output[k] = input1[i];
			i++;
			k++;
		}
		while(j < input2.length){
			output[k] = input2[j];
			j++;
			k++;
		}
		//return output;
	}
	
	
	public static String noX(String input){
		if(input.length()==0){
			return input;
		}
		
		String smallOutput = noX(input.substring(1));
		if(input.charAt(0) == 'x'){
			return smallOutput;
		}
		else{
			return input.charAt(0) + smallOutput;
		}
	}
	
	public static String noX_2(String input, int beginIndex){
		if(beginIndex >= input.length()){
			return "";
		}
		
		if(input.charAt(beginIndex) == 'x'){
			return noX_2(input, beginIndex+1);
		}
		
		else{
			return input.charAt(beginIndex) + noX_2(input, beginIndex+1);
		}
		
	}
	
	
	public static void quickSort(int[] input, int beginIndex, int endIndex){
		if(beginIndex>= endIndex){
			return;
		}
		
		int pivotIndex = pivot(input, beginIndex, endIndex);
		quickSort(input, beginIndex, pivotIndex-1);
		quickSort(input, pivotIndex+1, endIndex);
		
	}
	
	public static int pivot(int[] input, int bI, int eI){
		
	
		return bI;
	}
	

	
	public static String keypadHelper(int num) {
		switch(num){
		case 2:
			return "abc";
		case 3:
			return "def";	
		default :
			return "";

		}
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int ans = fact(5);
		//	System.out.println(ans);
		//	System.out.println(fib(3));
		/*int input1[] = {1,3,5,0,2,9};
		int input2[] = {2,4,6};
*/
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println(fact(-1));
			System.out.println("After try");
			
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			System.out.println("Inside catch");
			return;
		} finally{
			System.out.println("Inside finally");
		}
		
		
		System.out.println("Outside try catch");
	//	int[][] input = {{1,2,3},{4,5,6}};
		
		/*int[][] input = new int[3][];
		
		input[0] = new int[2];
		input[1] = new int[3];
		input[2] = new int[4];
		
		for(int i =0; i<input.length;i++){
			for(int j = 0; j < input[i].length;j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}*/
		
		
		/*	int[] output = returnAllIndices(input, 0, 2);

		for(int i =0; i < output.length; i++){
			System.out.println(output[i]);
		}
		 */		

		/*int output[] = new int[input.length];
		for(int i =0; i < output.length;i++){
			output[i] = -1;
		}

		returnAllIndices(input, 0, output, 0, 2);
		for(int i =0; i < output.length; i++){
			System.out.println(output[i]);
		}*/
		/*
		selectionSortR(input, 0);
		for(int i =0; i < input.length;i++){
			System.out.println(input[i]);
		}*/

		//	System.out.println(lastIndexOf(input, 0, 2));
		/*	boolean ans = checkSorted(input);
		System.out.println(checkSorted1(input, 0));*/

		/*int[] output = merge(input1, input2);
		for(int i = 0; i < output.length; i++){
			System.out.print(output[i] +" ");
		}*/
		
		/*mergeSort(input1);
		for(int i = 0; i < input1.length; i++){
			System.out.print(input1[i] +" ");
		}*/
		
		/*String output[] = subSequences("abc");
		for(int i = 0; i < output.length; i++){
			System.out.println(output[i] +" ");
		}*/
		
	}

}
