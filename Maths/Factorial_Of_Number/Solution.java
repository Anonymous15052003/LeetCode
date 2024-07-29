package Factorial_Of_Number;

public class Solution {
    public long factorial(int N) {
        // Your code here
        if (N==1 || N==0){
            return 1;
        }
        return N*factorial(N-1);
    }
}