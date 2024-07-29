package Sum_of_Digit_is_Pallindrome_or_not;

public class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        while (n>0){
            sum += n%10;
            n=n/10;
        }
        
        String newS=Integer.toString(sum);
        int i=0;
        int j=newS.length()-1;
        while (i<j){
            if (newS.charAt(i)!=newS.charAt(j))return 0;
            i++;
            j--;
        } 
        
        return 1;
    }
}