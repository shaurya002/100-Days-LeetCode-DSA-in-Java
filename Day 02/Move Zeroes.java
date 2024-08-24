// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

//    https://leetcode.com/problems/move-zeroes/description/

public void moveZeroes(int[] nums) {
      int l = 0;
      for(int r=0; r<nums.length; r++){
        if(nums[r]!=0){
            swap(nums, l, r);
            l++;
        }
      }  
    }
    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r]=temp;
    }
