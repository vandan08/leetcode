/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/


    public static int maxProfit(int[] arr) {
        int ans =0;
        int profit=0;
        for (int i=0;i<arr.length;i++){
//            ans=0;
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]-arr[j] <= 0 && ans < arr[j]-arr[i] ){
                    ans = arr[j]-arr[i];
                }
            }
        }
//        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
       int[] arr = {7,8,4,2,5,7,6,1,3,5,7,8,10};
        System.out.println( maxProfit(arr));
    }
}
