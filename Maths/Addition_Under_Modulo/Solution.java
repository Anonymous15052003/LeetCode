package Addition_Under_Modulo;

public class Solution {
    public static long sumUnderModulo(long a, long b){
        // code here
        long MOD = 1000000007L; // 10^9 + 7
        return (a % MOD + b % MOD) % MOD;
    }   
}