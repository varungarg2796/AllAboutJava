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

    public static int sumRange(int num){
        if(num==1){
            return 1;
        }
        return num + sumRange(num-1);
    }

    
    public static void main (String[] args){
        //countdown(5);
        System.out.println(sumRange(5));
    }
}