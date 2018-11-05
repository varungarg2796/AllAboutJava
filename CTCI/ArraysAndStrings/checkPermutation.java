//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
//"Varun" and "Nurav" will be false! (as it is case sensitive)
// "varun" and "nurav" will be true!

/**
Approach taken according to CTCI and me- Time complexity O(n)
We can also use the definition of a permutation-two words with t
he same character counts-to imple- ment this algorithm.
We simply iterate through this code, counting how many times each character appears.
Then, afterwards, we compare the two arrays.
*/

//If we want to use a DS, we can use Maps.



public class checkPermutation{

    public static boolean permutation(String a, String b){

        //if both are not of the same length, cancel it out
        if(a.length() != b.length()){
            return false;
        }

        //create an array of l=256 (so that it can accomodate all the ASCII chars)
        int[] arr = new int[256];


        //take one string and store the occurences of each char at an index of arr
        for(int i = 0; i<a.length(); i++){
            char value = a.charAt(i);
            arr[value] ++;
        }

        //subtract the occurunces if each char in second string and if any index is < 0
        // then return false. Otherwise, return true.
        for (int i=0; i< b.length(); i++) {
			int value = b.charAt(i);
			if (--arr[value] < 0) {
				return false;
			}
		}
		return true;

    
    }
    public static void main (String[] args){
        String a = "varun";
        String b = "nurav";
        System.out.println(permutation(a,b));
    }
}
/**
 Alternate solution according to CTCI

 If two strings are permutations, 
 then we know they have the same characters, but in different orders.
  Therefore, sorting the strings will put the characters from two 
  permutations in the same order. We just need to compare the sorted 
  versions of the strings.
 */