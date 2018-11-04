/**
URLify: Write a method to replace all spaces in a string with '%20':
You may assume that the string has sufficient space at the end 
to hold the additional characters, and that you are given the "true" 
length of the string. (Note: if implementing in Java, please use a character
array so that you can perform this operation in place.)

EXAMPLE
Input: "Mr John Smith    ", 13 Output: "Mr%20John%20Smith"

 */

 public class Urlify{

    static void URL(char[] str, int trueLength){
        int spaceCount = 0, index;
        for(int i = 0; i<trueLength;i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
        
        index = trueLength + (spaceCount*2); //17
        System.out.println(str[trueLength]);
        if(trueLength < str.length){
            str[trueLength] = '\0';
        }

        for(int i = trueLength - 1; i >=0 ; i--){
            if(str[i] == ' '){
                str[index - 1] = '0'; 
                str[index - 2] = '2'; 
                str[index - 3] = '%'; 
                index =index - 3;
                //System.out.println("i "+i);
                //System.out.println("If "+index);
            } else{
                str[index-1] = str[i];
                index--;
                System.out.print(str[i]);
                //System.out.println("Else "+index);            
            }
        }

        

    }


    public static void main (String[] args){
        String s= "Mr John Smith      ";
        char[] charArray = s.toCharArray();
        // for(int i = 0 ; i<charArray.length;i++){
        //     System.out.println(charArray[i]);
        // }
       // System.out.println(charArray.length);
        int trueLength = 13;
        URL(charArray,trueLength);
    }
 }