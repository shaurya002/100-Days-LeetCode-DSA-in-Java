// Given an array, arr. The task is to find the largest element in it.

// Examples:

// Input: arr = [1, 8, 7, 56, 90]
// Output: 90

// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/iption&utm_campaign=largest-element-in-array

public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int ele: arr){
            if(ele>largest){
                largest = ele;
            }
        }
        return largest;
    }
