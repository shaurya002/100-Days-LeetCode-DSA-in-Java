// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// Example 1:
// Input: nums = [3,0,1]
// Output: 2

//  https://leetcode.com/problems/missing-number/description/

public int missingNumber(int[] nums) {
        sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    public void sort(int [] arr){
        int i = 0;
        while(i<arr.length){
            int crctIdx = arr[i];
            if(arr[i]<arr.length && arr[crctIdx]!=arr[i]){
                swap(arr, crctIdx, i);
            }else{
                i++;
            }
        }
    }

    public void swap(int [] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
