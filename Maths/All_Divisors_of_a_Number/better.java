package All_Divisors_of_a_Number;

public class better {
    public static void divisors(int n){
        System.out.println(1);
        
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                System.out.println(i);
                if (i!=(n/i)){
                    System.out.println(n/i);
                }
            }
        }
        System.out.println(n);
    }
    public static void main(String[] args){
        int n = 100;
        divisors(n);
    }
}