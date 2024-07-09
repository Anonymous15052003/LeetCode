package Chocolate_Distribute;

import java.util.*;

public class test {
    public static int chocolateDistribution(int [] arr, int m){
        if (m==0 || arr.length==0){
            return 0;
        }
        if (arr.length-1<m){
            return -1;
        }

        Arrays.sort(arr);

        int mini = 0;

        int diff = Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            int j = i+m-1;

            if (j>=arr.length){
                break;
            }
            
            mini = arr[j] - arr[i];
            diff =  Math.min(diff,mini);
        }
        return diff;
    }
    public static void main(String[] args) {
        // Example input
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
 
        // Calculate the result using the chocolateDistribution method
        int result = chocolateDistribution(arr, m);
 
        // Print the result or indicate an invalid input
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
