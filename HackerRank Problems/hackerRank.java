//https://www.hackerrank.com/challenges/30-review-loop/problem

/* Sample Input
2
Hacker
Rank
*/

/* Sample Output 
Hce akr
Rn ak */


import java.util.Scanner;

public class hackerRank{

    static void Solution(String str){
        for(int i= 0; i<str.length(); i++){
            if(i % 2 == 0){
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(" ");
        for(int i= 0; i<str.length(); i++){
            if(i % 2 !=0){
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }


    public static void main( String[] args){
        //Because this is static, only static method will run in this.
        // If we want to run a non static method, then we need to make an object of that class
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        in.nextLine();
        //hackerRank obj = new hackerRank();
        String s[] = new String[a];
        for (int i=0; i<a; i++) {
            //Enter a string
            s[i] = in.nextLine();
        }
        for(int i=0; i<s.length; i++){
            Solution(s[i]);
        }
        in.close();
    }
}