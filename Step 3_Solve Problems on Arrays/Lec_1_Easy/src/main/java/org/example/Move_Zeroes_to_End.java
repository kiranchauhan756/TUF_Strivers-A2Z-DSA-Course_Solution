package org.example;
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

 */

public class Move_Zeroes_to_End {
    public static void moveZerosToEnd(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
             arr[count++]=arr[i];
            }
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
        for(int x:arr) System.out.print(x+" ");
    }
}
