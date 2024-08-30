// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// Example 1:

// Input: nums = [3,2,3]
// Output: 3

public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int majVal = nums.length/2;
        for(int i=0; i<nums.length; i++){
            if(!hMap.containsKey(nums[i])){
                hMap.put(nums[i], 1);
            }else{
                hMap.put(nums[i], hMap.get(nums[i])+1);
            }  
        }
        for(int i=0; i<nums.length; i++){
            if(hMap.get(nums[i])>majVal){
                return nums[i];
            }
        }
        return -1;
        
    }
