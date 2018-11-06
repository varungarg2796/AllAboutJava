import java.util.*;

class Solution {
    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n;) {
            System.out.println("A " + A[k]);
            System.out.println("B " + B[i]);
            if (i < m - 1 && B[i] < A[k])
                i += 1; else{k++;}
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a ={1};
        //int[] a = {3,4,5};
       //int[] b = {1,2,3};
        //int[] a = {1,2,3,4,5};
        int[] b = {2,2,3,4,1};
        //int[] a ={1,3,2,1};
        //int[] b = {4,2,5,3,2};        
        //int[] a = {0,0,1};

        System.out.println(solution(a,b));
    }
}




// for (int k = 0; k < n; ) {
//     System.out.println("A " + A[k]);
//     System.out.println("B " + B[i]);
//     System.out.println(B[i] < A[k]);
//     if (i < m - 1 && B[i] < A[k]){
//         i++;    //i += 1;
//     } else{
//         k++;
//     }
//     if (A[k] == B[i])
//         return A[k];
// }
// return -1;