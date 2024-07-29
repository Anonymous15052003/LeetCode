package GCD;

public class Naive {
    int gcd(int a, int b){
        int mini=Math.min(a,b);
        while (mini>0){
            if (a%mini==0 && b%mini==0){
                break;
            }
            mini--;
        }
        return mini;
    }
}