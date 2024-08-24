// Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.
// Example 1:
// Input:
// N = 5, K = 6
// arr[] = {1,2,3,4,6}
// Output: 1
// Complete the function searchInSorted() which takes the sorted array arr[], its size N and the element K as input parameters and
// returns 1 if K is present in the array, else it returns -1. 
//  https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win

 static int searchInSorted(int arr[], int N, int K) {
        int s = 0;
        int e = N-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==K){
                return 1;
            }else if(arr[m]<K){
                s=m+1;
            }else{
                e = m-1;
            }
        }
        return -1;   
    }

