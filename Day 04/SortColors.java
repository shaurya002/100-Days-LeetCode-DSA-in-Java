// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
// with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.
// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]


public void sortColors(int[] nums) {
        int r = 0;
        int w = 0;
        int b = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                r++;
            }else if(nums[i]==1){
                w++;
            }else{
                b++;
            }
        }
        int i;
        for( i=0; i<r; i++){
            
                nums[i]=0;
        }
        
        for( i=r; i<nums.length-b; i++){
            
                nums[i]=1;
        }
        
        for(i=r+w; i<nums.length; i++){
            
                nums[i]=2;
        }
        

    }
