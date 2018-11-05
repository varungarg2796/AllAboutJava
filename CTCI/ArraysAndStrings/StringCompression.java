/**
 String Compression: Implement a method to perform basic
  string compression using the counts of repeated characters. For example, 
  the string aabcccccaaa would become a2blc5a3. If the "compressed"string 
  would not become smaller than the original string, your method should return 
  the original string. You can assume the string has only uppercase and lowercase 
  letters (a - z).
 */


public class StringCompression{
    static String compress(String s){

        StringBuilder compressed = new StringBuilder();
        int consecutiveCount = 0;

        for(int i=0 ; i<s.length();i++){
            consecutiveCount++;
            if( i+1>=s.length() || s.charAt(i)!=s.charAt(i+1) ){
                compressed.append(s.charAt(i));
                compressed.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }
        if(compressed.length() >= s.length()){
            return s;
        }
        return compressed.toString();
    }
    public static void main(String[] args){
        String s = "aabaaaaab";
        System.out.println(compress(s));

    }
}