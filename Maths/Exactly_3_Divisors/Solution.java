package Exactly_3_Divisors;

public class Solution {
    public int exactly3Divisors(int N)
    {
        //Your code here
        int c=0;
        for (int i=2;i*i<=N;i++){
            if (isPrime(i)) c++;
        }
        return c;
    }
    public static boolean isPrime(int N){
        if (N<=1) return false;
        for (int i=2;i<=Math.sqrt(N);i++){
            if (N%i==0) return false;
        }
        return true;
    }
}