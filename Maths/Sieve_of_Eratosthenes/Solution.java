package Sieve_of_Eratosthenes;

import java.util.*;

public class Solution {
    public static void seive(int n){
        boolean [] arr = new boolean[n+1];
        Arrays.fill(arr,true);

        for (int i=2;i*i<=n;i++){
            if (arr[i]){
                for (int j=i*2;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if (arr[i]){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 12;
        seive(n);
    }
}