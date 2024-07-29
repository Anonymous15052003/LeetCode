package LCM;

public class Naive {
    public int lcm(int a, int b){
        int maxi = Math.max(a,b);
        while (true){
            if (maxi%a==0 && maxi%b==0){
                break;
            }
            maxi++;
        }
        return maxi;
    }
}