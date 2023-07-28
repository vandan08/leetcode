/* 
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

 

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
*/






public class leetcode {

    public static void searchRange(int[] arr, int target) {
//
        int n = 10;
        int[] ans = new int[n];
        int a=0;

        for (int i=0;i< arr.length;i++){

            if (target == arr[i]){
                ans[a] = i;
                a++;
            }
        }

        int i=0;
        while (ans[i] != 0){


            if (ans[1]==0){
                System.out.print("["+ans[i]+","+ans[i]);
                break;
            }

            if (ans[i+1]==0){
                System.out.print(ans[i]);
            } else if (i==0){
                System.out.print("[" + ans[i] + ",");
            } else {
                System.out.print(ans[i]+",");
            }
            i++;
        }

        if (ans[0]==0){
            System.out.print("[-1,-1");
        }

        System.out.print("]");
//        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,2,2,3,6,7,8};
        searchRange(arr,2);
    }
}
