package Palindrome_Number;

public class Solution {
    public boolean isPalindrome(int x) {
        int res=0;
        int temp=x;
        while (temp>0){
            int a=temp%10;
            res=res*10+a;
            temp=temp/10;
        }
        return res==x;
    }
}