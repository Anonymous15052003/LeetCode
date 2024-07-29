package All_Divisors_of_a_Number;

public class basic {
    public static void divisors(int n){
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        int n = 100;
        divisors(n);
    }
}