/* 
John works at a clothing store. 
He has a large pile of socks that he must pair by color for sale.
Given an array of integers representing the color of each sock, 
determine how many pairs of socks with matching colors there are.

Input
9 (number of socks)
10 20 20 10 10 30 50 10 20 (socks)
 
Output 
3
*/
import java.util.HashMap;
import java.util.Map;

public class sockMerchant {

    // Complete the sockMerchant function below.
    static int SockMerchant(int n, int[] ar) {
        Map<Integer, Integer> charFreq =  new HashMap<Integer, Integer>();
        int pairs = 0;
        for( int i=0; i< ar.length ; i++){
            int there = ar[i];
            if(charFreq.containsKey(there)){
                pairs ++ ;
                charFreq.remove(there);
            } else{
                charFreq.put(there, 1);
            }
        }
        return pairs;
    }


    public static void main(String[] args) {
        
        int[] arr = {10,20,20 ,10, 10 ,30, 50, 10, 20};

        int result = SockMerchant(9, arr);

        System.out.println(result);
        
    }
}
