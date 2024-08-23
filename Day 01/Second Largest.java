// Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

// Examples:

// Input: arr = [12, 35, 1, 10, 34, 1]
// Output: 34




public int print2largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int ele: arr){
            if(ele>largest){
                largest = ele;
            }
        }
        int secLargest = Integer.MIN_VALUE;
        for(int ele: arr){
            if(ele>secLargest && ele!=largest){
                secLargest = ele;
            }
        }
        return secLargest;
    }
