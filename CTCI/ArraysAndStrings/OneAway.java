/**
One Away: There are three types of edits that can be performed on strings: 
insert a character, remove a character, or replace a character. 
Given two strings, write a function to check if they are one edit (or zero edits)
away.

EXAMPLE
pale, ple -) true 
pales, pale - ) true 
pale, bale -) true 
pale, bae -) false
 */


 //Time complexity - O(n)

 //3 things possible
 /**
  1) replacement (length remains the same)
  2) Addition (length of first increases by 1) 
  3) Deletion (length of both decreases by 1)

*/

public class OneAway{

    static boolean oneaway(String first, String second){
        if(first.length() == second.length()){ //check for replacement if length of string is same
            return replacement(first,second);
        }
        if(first.length()+1 == second.length()){
            return OneAdd(first,second);
        }
        if(first.length()-1 == second.length()){
            return OneAdd(second,first);
        }
        return false;
    }

    static boolean replacement(String first, String second){
        int count = 0; //count no. of dissimilarities
        for(int i=0; i<first.length();i++){
            if(first.charAt(i)!=second.charAt(i)){
                count++;
            }
        }
        if(count > 1){ //if more than one dissimilar chars then print false
            return false;
        }
        else{
            return true;
        }
    }

    static boolean OneAdd(String first, String second){
        int index1 = 0;
        int index2 = 0;
        //pale
        //ale
        while(index1 < first.length() && index2 < second.length()){
            //If there is a dissimilarity and the indexes are different, return false
            if(first.charAt(index1)!=first.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            } else{
                index1++;
                index2++;
            }
        }
        //if you survive dissimilarity test, print false.
        return true;
    }

    public static void main(String[] args){
        String first = "paleee";
        String second = "ale";
        System.out.println(oneaway(first,second));

    }



}