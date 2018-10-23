import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jump = 0;

        int i = 0;
        while( i < c.length-1 ){
            if( i+2 < c.length && c[i+2] ==0 ){
                jump ++;
                i= i+2;
            } else {
                i++;
                jump++;
            }
        }
        return jump;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int[] c = {0, 0 ,0, 0 ,1, 0};
        
        //int[] c = {0, 0 ,0, 1 ,0, 0};

        
        int result = jumpingOnClouds(c);
        System.out.println(result);

        
    }
}
