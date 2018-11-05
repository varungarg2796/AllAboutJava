
// Say you have an array for which the ith element is the price of a given stock on day i.

// If you were only permitted to complete at most one transaction 
// (ie, buy one and sell one share of the stock), 
// design an algorithm to find the maximum profit.

// Example 1:
// Input: [7, 1, 5, 3, 6, 4]
// Output: 5

// max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
// Example 2:
// Input: [7, 6, 4, 3, 1]
// Output: 0

public class BestTimeToBuyAndSellStock{

    static int MaxProfit(int[] arr){
        int min = arr[0]; //current prices of stock
        int max = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[i] > min){ //If stock price of next year is greater than the current stock price
                max = Math.max(max, arr[i]-min); // find out whether the profit gained is greater than the current max profit
            } else{
                min = arr[i]; // if you reach here, this means that the stock price of next year will be even lower than the current one and hence will become the new point of purchase (current stock which is min)
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};

        System.out.println(MaxProfit(arr));
    }
}