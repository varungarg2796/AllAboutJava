//MEDIUM DIFFICULTY



import java.io.*;

public class minimumSwaps {

    // Complete the minimumSwaps function below.
    static int minSwaps(int[] arr) {
            int swaps = 0;

            for (int i = 0; i < arr.length -1; i++)
            {
            
                while((i + 1) != arr[i])
                {
                    // swap
                    int correctPos = arr[i] - 1;
                    int temp = arr[correctPos];
                    arr[correctPos] = arr[i];
                    arr[i] = temp;
                    swaps++;
                }

            }
            return swaps;
        }

    public static void main(String[] args) throws IOException {
       
    
        int[] arr = {2,3,4,5,1} ;

        System.out.println(arr.length);

        int res = minSwaps(arr);
        System.out.println(res);
        
    }
}
