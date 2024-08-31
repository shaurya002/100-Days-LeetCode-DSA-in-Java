//    https://leetcode.com/problems/binary-search/

// Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
  
public int search(int[] arr, int target) {
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr[m]==target){
                return m;
            }else if(arr[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return -1;
    }
