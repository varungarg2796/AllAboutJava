

import java.io.*;


public class countingValleys {

    // Complete the countingValleys function below.
    static int CountingValleys(int n, String s) {
        char U = 'U';
        char D = 'D';
        int count = 0;
        int valley = 0;
        for( int i = 0; i<n ; i++){
            if(s.charAt(i) == U){
                count ++;
            }
            else if(s.charAt(i)== D){
                count --;
            }
            if(count == 0 && s.charAt(i) == U){
                valley ++;
            }
            System.out.println("Character: " + s.charAt(i) );
            System.out.println("Count: " + count );
            System.out.println("Valley: " + valley );

        }
        return valley;

    }

   
    public static void main(String[] args) throws IOException {
        int n = 12;
        String s = "DDUUDDUDUUUD";
        int result = CountingValleys(n, s);

        System.out.println(result);
    }
}
