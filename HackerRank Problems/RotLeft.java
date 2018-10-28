
/**

Input-
5 1
1 2 3 4 5

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.
Output- 
2 3 4 5 1
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RotLeft {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        for(int i = 0; i<d;i++){
            int temp = a[0];
            for (int j=1; j<a.length;j++){
                a[j-1] = a[j];
            }
            a[a.length-1] = temp;
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }

        scanner.close();
    }
}
