
//MULTIPLE POINTERS PATTERN

//implement a function
  //which accepts sorted array
  //counts unique value in array
  //there can be negative values

 // ****Time complexity for this case is o(n)//
  import java.util.HashMap;
  import java.util.Map;
  
  public class countUniqueValues {
      
      static int unique(int[] arr) {
        int base = 0;
        int scout = 1;
        if(arr.length == 0){
            return 0;
        }
        System.out.println(arr.length);
        while(scout < arr.length){
            System.out.println(arr[base] +" "+  arr[scout] );
            if(arr[base]==arr[scout]){
                scout++;
            }else{
                base++;
                arr[base] = arr[scout];
            }
        }
        int result = base + 1;
        System.out.println("unique values are " + result);
        return result;
          
      }
      
      public static void main (String[] args) {
          int arr1[] = { 1, 4, 4 , 4 ,5,6,7,8};
          System.out.println(unique(arr1));
      }
      
      //for ( Character key : map.keySet()){
     //     System.out.println("Character : '"+key+"' Count :"+map.get(key));
      //}
  }
  