//Logic- Find(SELECT) the minimum from the array by comparing each element to the starting element and then SWAP that element to the front. We compare a lot and make less swaps
//Quadratic Sorting algorithm (As complexity is O(n^2))
//Space Complexity O(1)
/******
 * Time complexity
 * Best Case- O(n^2)
 * Average Case- O(n^2)
 * Worst Case- O(n^2)
*******/

public class selectionSort{

    public static int[] Sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                //if the element we assume is smallest, is greater than next element,
                //then that element becomes the minimum
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //we are swapping outside the loop so that the array can be traversed and the smallest element from the whole array becomes the min 
            //Below block of code shows that we should only swap if min has changed that is if we have discovered a new mimimum
            if(min!= i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        printArray(arr);
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
    }
    
   
    public static void main(String[] args){
        int a[] = {1,10,12,13,3,4,5,6,7,8,9,2};
        Sort(a);
    }
}



// public static void swap(int[] arr, int index1, int index2){
//     int temp = arr[index1];
//     arr[index1] = arr[index2];
//     arr[index2] = temp;
// }