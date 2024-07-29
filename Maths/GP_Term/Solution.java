package GP_Term;

public class Solution {
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        if (N==1) return A;
        double r = (double) B/A;
        return (A*Math.pow(r,N-1));
    }
}