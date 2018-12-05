//To calculate pascal's triangle.
// See how binomial coeffecient works!

public class pascalsTriangle{
    static int binomialCoeffecient(int n, int k) { 
        int res = 1; 
          
        if (k > n - k) 
        k = n - k; 
              
        for (int i = 0; i < k; ++i) { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
        return res; 
    } 
      
    static void printPascal(int n){

        for(int line = 0; line< n; line++){
            //In every line, number of integers = number of lines
            for(int i = 0; i<=line; i++){
                System.out.print(binomialCoeffecient(line, i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 7;
        printPascal(n);
        
    }
}