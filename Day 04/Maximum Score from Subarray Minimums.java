// Given an array arr[], with 0-based indexing, select any two indexes, i and j such that i < j. From the subarray arr[i...j],
// select the smallest and second smallest numbers and add them, you will get the score for that subarray.
// Return the maximum possible score across all the subarrays of array arr[].

// Examples :

// Input : arr[] = [4, 3, 1, 5, 6]
// Output : 11

// https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays

public int pairWithMaxSum(List<Integer> arr) {
         int n=arr.size();
        int maxsum=arr.get(0)+arr.get(1);
        for(int i=1;i<n-1;i++){
            int sum=arr.get(i)+arr.get(i+1);
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
