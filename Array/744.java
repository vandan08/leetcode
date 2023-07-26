/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
*/


public class Main {
    public static char nextGreatestLetter(char[] arr,char target){
     int start =0 ;
     int end = arr.length-1;

     while (start<=end){
         //find the middle element
         int mid = start + (end - start)/2;

         if (target < arr[mid]){
             end = mid - 1;
         } else {
             start = mid + 1 ;
         }
     }
     return arr[start % arr.length];
    }
        public static void main(String[] args) {

        char[] arr = {'a','b','d','g','s'};
            System.out.println(nextGreatestLetter(arr,'d'));
        }
}
