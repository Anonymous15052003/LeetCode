package GCD;

public class Educlidean {
    public static int gcd(int a, int b) {
        // code here
        while (a!=b){
            if (a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
}