

public class factorialRecursive{

    //Iterative Factorial
    public static void factorial(int num){
        int total=1;
        for(int i = num; i>0;i--){
            total *= i;
        }
        System.out.println(total);
    }

    //Recursive Factorial
    public static int factorialRecurs(int num){
        if(num < 0){
            return 0;
        }
        if(num ==1){
            return 1;
        }
        return num * factorialRecurs(num -1);
    }

    //Power factorial
    public static int power(int num, int pow){
        if(pow == 0){
            return 1;
        }
        return num * power(num,pow-1);
    }

    //Product of elements of array
    public static int productOfArray(int[] arr, int n){
        if(n==0){
            return arr[n];
        }
        return arr[n] * productOfArray(arr, n-1);
    }

    //Recursive fibonacci

    public static int fibonacciFactorial(int num){
        if(num <=2){
            return 1;
        }
        return fibonacciFactorial(num-1) + fibonacciFactorial(num-2);
    }


    public static void main(String[] args){
        factorial(5);
        System.out.println(factorialRecurs(5));
        System.out.println(power(5,3));
    
        int arr[] = { 1, 4, 4 , 4 };
        System.out.println(productOfArray(arr, arr.length-1));
        System.out.println(fibonacciFactorial(3));
        
    }
}