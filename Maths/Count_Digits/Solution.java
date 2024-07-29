package Count_Digits;

public class Solution {
    static int evenlyDivides(int N){
        // code here
        int num=N;
        int c=0;
        while (num>0){
            int a=num%10;
            if (a!=0 && N%a==0) c++;
            num=num/10;
        }
        return c;
    }
}