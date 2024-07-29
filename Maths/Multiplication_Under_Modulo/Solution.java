package Multiplication_Under_Modulo;

public class Solution {
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        long mod = 1000000007;
        long ans = ((a%mod)*(b%mod))%mod;
        return ans;
    }
}