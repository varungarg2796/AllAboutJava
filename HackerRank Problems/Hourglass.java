
//https://www.hackerrank.com/challenges/30-2d-arrays/problem
/*
Input-
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Output - 19

Explanation- 
There are following possible combinations 

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

The highest one is-
2 4 4
  2
1 2 4

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hourglass {

    public static void main(String[] args) {
        int maxVal = Integer.MIN_VALUE;
        
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                int glassSum = 
                    arr[i][j]   + arr[i][j+1]   + arr[i][j+2]
                                + arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                if(glassSum > maxVal) maxVal = glassSum;
                
            }
        }
        
        System.out.print(maxVal);
    }
}