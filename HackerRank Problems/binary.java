import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class binary {

    static String toBinary(int n){
        String str = "";
        while(n > 0){
         int y = n % 2;
         str = y + str;
         n = n / 2;
         //System.out.println("y=" +y);
         //System.out.println("string=" +str);
         //System.out.println("n="+n);
        }
        return str;
    }

    /* Explanation for below
    List l = ["a", "b", "c"]
    for (String s : l)
    print (s); 

    Output: a b c

    String[] ones = Integer.toBinaryString(n).split("[0]+");
    It is spliting the string in terms of zero, i.e, suppose 
    the number was 111011 the the array will be {"111","11"}
    */
    static void easyWay(int n){
        String[] ones = Integer.toBinaryString(n).split("[0]+");
        int max = 0;
        for (String s : ones) {
            if (s.length() > max)
                max = s.length();
        }
        System.out.println(max);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String str = toBinary(n);
        int mainCount = 0  ;
        System.out.println(str);
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)=='1'){
                mainCount ++; 
                break;
            }
        }
        if(mainCount!=0){
            int maxCount = mainCount;
            int currentCount = mainCount;
            for(int i=0; i<str.length()-1;i++){
                if(str.charAt(i) =='1' && str.charAt(i+1)=='1'){
                    currentCount ++;
                }
                else if(str.charAt(i) =='1' && str.charAt(i+1)=='0'){
                    if(currentCount> maxCount){
                        maxCount = currentCount;
                    }
                    currentCount = mainCount;
                }
            }
            if(currentCount> maxCount){
                maxCount = currentCount;
            }
            System.out.println(maxCount);
        }

        easyWay(n);
            
        scanner.close();
    }
}
