package Kth_Largest_Element_in_an_Array;

import java.util.*;

public class bruteforce {
    public static int answer(int [] arr, int k){
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n-k];
    } 
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        int k=2;
        int ans = answer(nums,k);
        System.out.println(ans);
    }
}
