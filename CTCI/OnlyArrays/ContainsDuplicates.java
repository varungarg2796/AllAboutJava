//Given an array of integers and an integer k, find out whether there are two
// distinct indices i and 
//j in the array such that nums[i] = nums[j] and the absolute difference 
//between i and j is at most k.

//Input-
//{1,0,1,1,0,0} , 3

//Output- 
//true


import java.util.HashMap;
import java.util.Map;

class ContainsDuplicates {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }
        
        return false;
    }

    public static void main (String[] args){
        int[] a = {1,0,1,1,0,0};
        System.out.println(containsNearbyDuplicate(a, 3));
        
    }
}