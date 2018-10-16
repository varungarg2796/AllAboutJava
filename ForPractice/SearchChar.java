//Searching characters in hashMap



import java.util.HashMap;
import java.util.Map;

public class SearchChar {
	
	static String SearchC(String s) {
		Map<Character, Integer> charFreq =  new HashMap<Character, Integer>();
        for( int i=0; i< s.length() ; i++){
            char there = s.charAt(i);
            if(charFreq.containsKey(there)){
                charFreq.put(there, charFreq.get(there) + 1);
            } else{
                charFreq.put(there, 1);
            }
        }
        return charFreq.toString();
	}
	
	public static void main (String[] args) {
		System.out.println(SearchC("whatsup"));
		// {w =1 , h = 1 and so on}
    }
    
    //for ( Character key : map.keySet()){
   //     System.out.println("Character : '"+key+"' Count :"+map.get(key));
    //}
}
