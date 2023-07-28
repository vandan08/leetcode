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



class Solution {
  
   public static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = search(arr,target,true);
        int end = search(arr,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function will return the first index and last index of taget element
    static int search(int[] arr, int target, boolean findFitstIndex){
        int ans = -1;
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid  +1;
            } else {
                ans = mid;
                if (findFitstIndex){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
