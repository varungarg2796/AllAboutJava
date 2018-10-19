public class quickSort{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        int a[] = {10,9,76,73,100};
        printArray(a);
    }    
}