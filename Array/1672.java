/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

*/



public class no {
//    public static int maximumWealth(int[][] arr) {
//
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            int ans=0;
//            for (int j=0;j<arr[i].length;j++){
//                ans += arr[i][j];
//            }
//            if (sum<ans) {
//                sum = ans;
//            }
//        }
////        System.out.println(sum);
//        
//        return sum;
//    }
    public static void main(String[] args) {

     int[][] arr= {{2, 4,23, 8},
                     {3,4,33,5},
                     {4,2,5,500}
     };

int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int ans=0;
            for (int j=0;j<arr[i].length;j++){
                 ans += arr[i][j];
            }
            if (sum<ans) {
                sum = ans;
            }
        }
        System.out.println(sum);

//        System.out.println(maximumWealth(arr)) ;

    }
}
