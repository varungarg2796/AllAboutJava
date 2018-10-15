
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

    public static void main (String[] args){
        int a[] = {1,3,4,5,6};
        System.out.println(linearSearch(a, 5));
    }
}