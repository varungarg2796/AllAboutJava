import java.lang.*;
public class SearchingAlgos{

    //A BASIC LINEAR SEARCH
    // Time complexity O(n)
    public static int linearSearch(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }


    //BINARY SEARCH
    //We divide the array into half after each iteration
    public static int binarySearch(int[] arr, int num){
        int start = 0;
        int end = arr.length - 1;
        int middle = (int)Math.floor(start + end) / 2;
        while(arr[middle]!= num){
            if(num < arr[middle]){
                end = middle - 1;
            } else{
                start = middle + 1;
            }
            middle = (int)Math.floor(start + end) / 2;
        }
        if(arr[middle] == num){
            System.out.println("Found at index " + middle);
            return 1;
        }
        return -1;
    }
    public static void main (String[] args){
        int a[] = {1,3,4,5,6,7,8,9};
        //System.out.println(linearSearch(a, 5));
        System.out.println(binarySearch(a, 8));
    }
}