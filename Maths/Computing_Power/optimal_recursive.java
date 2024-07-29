package Computing_Power;

public class optimal_recursive {
    public static int power(int a,int n){
        if (n==0) return 1;

        int temp = power(a,n/2);

        temp = temp * temp;

        if (n%2==0){
            return temp;
        }
        else{
            return temp*a;
        }
    }
    public static void main(String[] args) {
        int a = 5;
        int n = 3;
        System.out.println(power(a, n));
    }
}