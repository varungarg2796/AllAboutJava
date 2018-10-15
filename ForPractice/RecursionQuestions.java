public class RecursionQuestions{


    //Reverse a string
    // reverse("abcd") --> 'dcba'
    public static String reverse(String s){

        if((null == s) || s.length()<=1){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    //isPalindrome('awesome')  // false
    //isPalindrome('tacocat') // true
    public static boolean isPalindrome(String s){
        if(s.length() == 0 || s.length() ==1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1, s.length()-1));
        }
        return false;
    }
    //Given a String print all the subsequences .e.g. for input=abc you need to 
    // print “”,a, b, c, ab, ac, bc, abc

    public static String printSub(String s){
        if(s.length() == 1){
            return s;
        }
        return "bogus";

    }

    //Given a string, compute recursively(noloops) a new string where
    //all appearances of "pi" have been replaced by "3.14".

    public static String replacePi(String s){
        if(s.length() < 2){
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            return "3.14" + replacePi(s.substring(2));
        }
        return s.charAt(0) + replacePi(s.substring(1));
    }

    public static void main(String[] args){
        String s = "abpiaba";
        //System.out.println(s.length());
        //System.out.println(reverse(s));
        //System.out.println(isPalindrome(s));
        System.out.println(replacePi(s));

    } 
}