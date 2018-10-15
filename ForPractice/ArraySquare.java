// To return true if every value in array has its corresponding value squared in the second array
// The frequency of the values must be the same

import java.util.HashMap;
import java.util.Map;

public class ArraySquare {
	
	static boolean SearchC(int[] arr1, int[] arr2) {
        
        // Check if both values have equal numbers
        if(arr1.length != arr2.length){
            return false;
        }

        //Populate the two maps using arrays
        Map<Integer, Integer> charFreq1 =  new HashMap<Integer, Integer>();
		Map<Integer, Integer> charFreq2 =  new HashMap<Integer, Integer>();        
        for( int i=0; i< arr1.length ; i++){
            int there = arr1[i];
            if(charFreq1.containsKey(there)){
                charFreq1.put(there, charFreq1.get(there) + 1);
            } else{
                charFreq1.put(there, 1);
            }
        }
        for( int i=0; i< arr2.length ; i++){
            int there = arr2[i];
            if(charFreq2.containsKey(there)){
                charFreq2.put(there, charFreq2.get(there) + 1);
            } else{
                charFreq2.put(there, 1);
            }
        }
        System.out.println(charFreq1.toString());
        System.out.println(charFreq2.toString());

        // To check if key of first map is present in the second and if the frequency is the same
        for (Integer key : charFreq1.keySet()) {
            if(!charFreq2.containsKey(key*key)){
                //System.out.println("key1: " + name); 
                //System.out.println("found");
                return false;
            } 
            if(charFreq1.containsValue(key)!=charFreq2.containsValue(key*key)){
                //System.out.println("values match");
                return false;
            }
        }
        return true;
	}
	
	public static void main (String[] args) {
		int arr1[] = { 1, 4, 4 , 4 };
        int arr2[] = { 1, 16, 16, 16 };
        System.out.println(SearchC(arr1, arr2));
    }
    
    //for ( Character key : map.keySet()){
   //     System.out.println("Character : '"+key+"' Count :"+map.get(key));
    //}

    // using values() for iteration over keys 
        // for (Integer url : charFreq1.values()) {
        //     System.out.println("value: " + url); 
        // } 
}


//Time complexity of below is O(nlogn)
/*
import java.util.Arrays;

public class SquaredArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 4 };
		int arr2[] = { 1, 16, 16 };

		System.out.println(check(arr1, arr2));
	}

	static boolean check(int arr1[], int arr2[]) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			int num1 = arr1[i];
			int num2 = arr2[i];
			if (num1 * num1 != num2) {
				return false;
			}
		}
		return true;
	}

}

*/