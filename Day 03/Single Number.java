// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
// Example 1:
// Input: nums = [2,2,1]
// Output: 1
//   https://leetcode.com/problems/single-number/description/

  
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
       }
       for(int i=0; i<nums.length; i++){
        if(map.get(nums[i])==1){
            return nums[i];
        }
       }
       return -1;

        
    }
