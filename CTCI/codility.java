import java.util.Arrays; 
class codility {

    static int solution(String S, int K){

        String str = S;
        int k = K;
        String[] splited = str.split("\\s+");
        int maxLenWord = splited[0].length();
        System.out.println(maxLenWord);
        for(int i =0; i<splited.length;i++){
            if(splited[i].length()> maxLenWord){
                maxLenWord= splited[i].length();
            }
        }
        if(k<maxLenWord){
            return -1;
            //System.out.println("hah"); 
        }

        int index= 0;
        int count = 0; 
        int orignalLength = str.length();
        while(index<=orignalLength){
            System.out.println(index);
            if(k >= str.length()){
                count++;
                System.out.println("Final count:" + count);
                return count;
            }
            else if((str.charAt(k) == ' ' && str.charAt(k-1)!= ' ' && str.charAt(k+1)!= ' ')){
            count ++;
            String word = str.substring(0,k);
            str = str.substring(k);
            index = index+k;
            if(str.charAt(0) == ' '){
                str = str.trim();
            }
            System.out.println("Word Taken Out: "+ word );
            System.out.println("i: " + index);
            System.out.println("Count: " + count);
            System.out.println("Remaining String: " + str);
            System.out.println("Length of remaining string: " + str.length());
        } else{
            for(int i = 0 ;i <str.length() ; i++){
                if(str.charAt(i) == ' '){
                    String word = str.substring(0,i);
                    str = str.substring(i);
                    count++;
                    index=index+i;
                    if(str.charAt(0) == ' '){
                        str = str.trim();
                    }
                    System.out.println("Word taken out: " + word);
                    System.out.println("i: " + index);
                    System.out.println("Count: " + count);
                    System.out.println("Remaining String: " + str);
                    System.out.println("Length of remaining string: " + str.length());
                    break;
                }
            }
        }
    }
        return 0;
    }
    public static void main (String[] args){
       // String S = "SMS messages are really short";
        String S = "SMS  messages are really short";
        int k = 12;
        System.out.println(solution(S,k));
        int length = S.replaceAll("[^ ]", "").length();
        System.err.println(length);
    }
}


   