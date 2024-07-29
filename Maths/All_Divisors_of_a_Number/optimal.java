package All_Divisors_of_a_Number;

public class optimal {
    public static void divisors(int n){
        int i=1;
        for (i=1;i*i<n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
        for (;i>0;i--){
            if (n%i==0){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args){
        int n = 100;
        divisors(n);
    }
}