//Not used a lot
//Used only when there is nearly sorted data
//***Time Complexity O(n^2) */

public class bubbleSort{

    public static int[] Sort(int[] arr){
        boolean noSwaps = true;
        for(int i=arr.length ; i>0; i--){
            for(int j=0 ; j<i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    noSwaps = false;
                }
            }
            //Below line will prevent us from running the code even after the array is sorted
            if(noSwaps){
                break;
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
    
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args){
        int a[] = {1,10,12,13,3,4,5,6,7,8,9,2};
        Sort(a);
    }
}