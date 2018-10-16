import java.lang.*;
public class SearchingAlgos{

    //A BASIC LINEAR SEARCH
    // *****Time complexity O(n)******
    public static int linearSearch(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }


    //BINARY SEARCH //1 means found and -1 means not found
    //REQUIRES a sorted array to work
    //We divide the array into half after each iteration

    //*****Time complexity O(n) = logn*******
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
        System.out.println("Element not present");
        return -1;
    }


    //Naive String matching
    //For small string matching
    // Best case O(n)
    // Worst case O(m*(n-m+1))
    public static void naiveSearch(String longString, String shortString){
        int count = 0;
        for ( int i =0; i<longString.length(); i++){
            for(int j=0; j<shortString.length(); j++){
                System.out.print(longString.charAt(i+j));
                System.out.println(shortString.charAt(j));
                if(shortString.charAt(j)!= longString.charAt(i+j)){
                    System.out.println("BREAK");
                    break;
                }
                if(j == shortString.length() - 1){
                    System.out.println("FOUND ONE");
                    count++;
                }
            }
        }
        System.out.println("No. of patterns matching are:" + count);
    }



    //KNP STRING SEARCH LEFT 

    public static void main (String[] args){
        int a[] = {1,3,4,5,6,7,8,9};    //for both cases below
        //System.out.println(linearSearch(a, 5));
        //System.out.println(binarySearch(a, 8));

        //For naive string search below
        String longString = "lorie loled";
        String shortString = "lol";
        naiveSearch(longString, shortString);
    }
}