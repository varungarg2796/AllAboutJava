//Recursive function

public class countdownRecursive{

    public static void countdown(int num){
        if(num<=0){
            System.out.println("All done!");
            return;
        }
        System.out.println(num);
        num--;
        countdown(num);
    }

    
    public static void main (String[] args){
        countdown(5);
    }
}