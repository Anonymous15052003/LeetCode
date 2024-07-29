package Computing_Power;

public class optimal_iterative {
    public static int power(int a,int n){
        int temp = 1;
        while (n>0){
            if (n%2!=0){
                temp = temp*a;
            }
            a=a*a;
            n=n/2;
        }
        return temp;
    }
    public static void main(String[] args) {
        int a = 5;
        int n = 3;
        System.out.println(power(a, n));
    }
}