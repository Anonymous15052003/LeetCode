package Prime_Factors;

public class Naive {
    public static void primeFactors(int n){
        for (int i=2;i<n;i++){
            if (isPrime(i)){
                int x=i;
                while (n%x==0){
                    System.out.println(x);
                    x=x*i;
                }
            }
        }
    }
    static boolean isPrime(int N){
        // code here
        if (N==1) return false;
        if (N==2 || N==3) return true;
        if (N%2==0 || N%3==0) return false;
        for (int i=5;i*i<=N;i=i+6){
            if (N%i==0 || N%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 12;
        primeFactors(n);
    }
}