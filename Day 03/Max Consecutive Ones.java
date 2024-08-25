// Given a binary array nums, return the maximum number of consecutive 1's in the array.
// Example 1:
// Input: nums = [1,1,0,1,1,1]
// Output: 3
//  https://leetcode.com/problems/max-consecutive-ones/description/

public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        for(int ele: nums){
            if(ele==1){
                count++;
                if(count>maxCount){
                    maxCount = count;
                }
            }else{
                count=0;
            }
        }
        if(maxCount==-2147483648){
            return 0;
        }
        return maxCount;
    }
