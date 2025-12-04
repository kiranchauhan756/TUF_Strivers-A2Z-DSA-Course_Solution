package org.example;
/*

Given an array of integers nums, return the value of the largest element in the array

Examples:
Input: nums = [3, 3, 6, 1]
Output: 6
Explanation: The largest element in array is 6

Input: nums = [3, 3, 0, 99, -40]
Output: 99

Explanation: The largest element in array is 99


 */
public class Largest_Ele_In_Array {
    public static int findLargestElementInArray(int arr[]){
        int max=arr[0];
        for(int x:arr){
            if(x>max)max=x;
        }
        return max;
    }
}
