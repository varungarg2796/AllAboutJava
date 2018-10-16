


public class mergeSort{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }

    public static void merge(int[] arr1, int[] arr2){
        int[] results = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k =0;

        while(i<arr1.length && j < arr2.length){
            if(arr2[j] > arr1[i]){
                results[k] = arr1[i];
                i++;
                k++;
            }else{
                results[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            results[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            results[k] = arr2[j];
            j++;
            k++;
        }
        printArray(results);
    }
    public static void main(String[] args){
        int a[] = {1,10,15,20,35};
        int b[] = {2,11,18,30};

        merge(a,b);
    }
}
