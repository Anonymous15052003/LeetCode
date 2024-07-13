package Chocolate_Distribute;

import java.util.*;

public class test1 {
    public static int chocolateDistribution(int [] arr, int m){
        if (arr.length==0 || m==0){
            return 0;
        }
        if (arr.length<m){
            return -1;
        }
        Arrays.sort(arr);

        int res = Integer.MAX_VALUE;

        for (int i=0;i<arr.length-1;i++){
            int window = i+m-1;
            if (window>=arr.length)break;
            int diff = arr[window]-arr[i];
            res = Math.min(diff,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
 
        int result = chocolateDistribution(arr, m);

        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}