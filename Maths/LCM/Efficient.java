package LCM;

public class Efficient {
    public static int lcm(int a, int b){
        int mul = a*b;
        int ans = gcd(a,b);
        return (mul/ans);
    }
    public static int gcd(int a, int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        System.out.println(lcm(a,b));
    }
}
