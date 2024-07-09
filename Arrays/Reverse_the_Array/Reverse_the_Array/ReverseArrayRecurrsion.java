package Reverse_the_Array;

public class ReverseArrayRecurrsion {
    public static void reverseArr(int [] original, int start, int stop){
        int temp;
        if (start>=stop){
            return;
        }
        temp=original[start];
        original[start]=original[stop];
        original[stop]=temp;
        reverseArr(original, start+1, stop-1);
    }

    public static void main(String[] args) {
        int [] original = {1,2,3,4,5};
        reverseArr(original,0,4);
        for (int k:original){
            System.out.print(k+" ");
        }
    }
}
