package Computing_Power;

public class Naive {
    public static int power(int a,int n){
        int x=1;
        for (int i=0;i<n;i++){
            x=x*a;
        }
        return x;
    }
    public static void main(String[] args) {
        int a = 5;
        int n = 3;
        System.out.println(power(a, n));
    }
}