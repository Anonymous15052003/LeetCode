package Chocolate_Distribute;

import java.util.*;

public class sol {
    public static int chocolateDistribution(int [] arr, int m){
        if (arr.length==0 || m==0){
            return 0;
        }

        Arrays.sort(arr);

        if (arr.length<m){
            return -1;
        }

        int min_diff = Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            int window = i+m-1;
            if (window>=arr.length)break;
            int diff = arr[window]-arr[i];
            min_diff=Math.min(diff,min_diff);
        }
        return min_diff;

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