package Digits_In_Factorial;

public class Solution {
    public int digitsInFactorial(int N){
        // code here
        if (N==0 || N==1){
            return 1;
        }
        double sum=0.0;
        for (int i=2;i<=N;i++){
            sum+=Math.log10(i);
        }
        return (int)(sum+1);
    }
}