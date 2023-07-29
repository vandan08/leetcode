/*
An array arr is a mountain if the following properties hold:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
You must solve it in O(log(arr.length)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1


*/

public static int peakIndexInMountainArray(int[] arr){
        //we are going to do binary search for this problem !!
        int start =0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end-start) /2 ;
            /* here we will check that if the middle element is greater
            than we are in decreasing part of the array so we will
            make do end = mid bcuz might be this will be or answer */
            if (arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
        }

    public static void main(String[] args) {
        int[] arr ={0,2,1,0};
//        System.out.println(binary(arr,2));
//        System.out.println("Abdc");
        System.out.println(peakIndexInMountainArray(arr));
    }
