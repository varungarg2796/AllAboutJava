

//https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

/** Input
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
 */

/** Output
sam=99912222
Not found
harry=12299933
 */

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;

public class dictionariesAndMaps{

    public static void main(String[] args){
        Map<String, Integer> dictMap =  new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                System.out.println("inner");
                in.nextLine();
                dictMap.put(name,phone);
            }
                // Write code here
            while(true){
                String s = in.next();
                if(dictMap.get(s) == null)
                System.out.println("Not found");
                else {
                    System.out.println(s + "=" + dictMap.get(s));
                }
                System.out.println("outer");
                // Write code here
            }
            
            
        }
    
}