// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]

//  https://leetcode.com/problems/rotate-array/description/


public void rotate(int[] nums, int k) {
        k %= nums.length;
        rev(nums, 0, nums.length-1);
        rev(nums, 0, k-1);
        rev(nums, k, nums.length-1);
    }
    public void rev(int[] arr, int s, int e) {
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
