//    https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
// Given two sorted arrays of size n and m respectively, find their union.
//The Union of two arrays can be defined as the common and distinct elements in the two arrays. 
//Return the elements in sorted order.

// Example 1:

// Input: 
// n = 5, arr1[] = {1, 2, 3, 4, 5}  
// m = 5, arr2 [] = {1, 2, 3, 6, 7}
// Output: 
// 1 2 3 4 5 6 7


public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        Set<Integer> set = new HashSet<>();
        for(int ele: arr1){
            set.add(ele);
        }
        for(int ele: arr2){
            set.add(ele);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int ele: set){
            list.add(ele);
        }
        Collections.sort(list);
        return list;
    }
