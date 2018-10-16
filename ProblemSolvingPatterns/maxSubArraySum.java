//SLIDING WINDOW PATTERN

//Accepts array of integers and a number called n.
//function should maximum sum of n consecutive integers.


//The complexity of the working below is O(n) --quite efficient
//It has 2 independent for loops instead of 2 nested for loop in which case it would have been O(n^2)
import java.lang.*;
import java.util.Arrays;

public class maxSubArraySum {

    static int slidingWindow(int arr[], int num) {
        int maxSum = 0;
        int tempSum = 0;

        //Calculate the sum of first 3 numbers
        for(int i=0; i< num; i++){
            maxSum += arr[i];
        }
        tempSum = maxSum;

        //subtract the first number and add the new number thus creating a window.
        for(int i=3; i< arr.length; i++){
            tempSum = tempSum - arr[i-num] + arr[i];
            maxSum = Math.max(tempSum, maxSum);
        }
        return maxSum;
	}
	public static void main(String[] args) {
		int[] arr = { 1,4,4,2,2,3,4,5,6,7 };
		System.out.println(slidingWindow(arr,3));
	}

}
