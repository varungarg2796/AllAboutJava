import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long[] arr = new long[n];
        char[] charArray = s.toCharArray();
        int i = 0;
        int charArraylen = charArray.length;
        while(i < arr.length){
            i++;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();

        long result = repeatedString(s, n);
        System.out.println(result);
    }
}
