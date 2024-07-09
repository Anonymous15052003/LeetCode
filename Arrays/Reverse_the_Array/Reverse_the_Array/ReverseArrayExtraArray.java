// import java.util.*;
package Reverse_the_Array;

class ReverseArrayExtraArray{
    public static void reverseArrayExtraArray(int [] original){
        int [] arr = new int[original.length];
        int j=0;
        for (int i=original.length-1;i>=0;i--){
            arr[j]=original[i];
            j++;
        }
        for (int k:arr){
            System.out.print(k+" ");
        }
    }

    public static void main(String[] args) {
        int [] original={1,2,3,4,5};
        reverseArrayExtraArray(original);
    }
}