//LOGIC- Take one element at a time and INSERT it to the correct (sorted) spot.


public class insertionSort{

    public static int[] Sort(int[] arr){
        for(int i=1 ; i < arr.length; i++){
            int currentValue = arr[i];
            int j= i-1;
            /* Move elements of arr[0..i-1],
             that are greater than currentValue, to one position ahead 
               of their current position */
            while(j>=0 && arr[j] > currentValue){
                arr[j+1] = arr[j];
                j--;
            }
            printArray(arr);
            //the position after the sorted part becomes the new currentValue
            arr[j+1] = currentValue;
        }
        printArray(arr);
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        int a[] = {1,10,12,13,3,4,5,6,7,8,9,2};
        Sort(a);
    }
}
