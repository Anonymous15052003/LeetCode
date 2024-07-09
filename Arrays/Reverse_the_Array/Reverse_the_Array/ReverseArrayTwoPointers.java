package Reverse_the_Array;

public class ReverseArrayTwoPointers {
    public static void reverseArray(int [] original){
        int i=0,j=original.length-1;
        int temp;
        while (i<j){
            temp=original[i];
            original[i]=original[j];
            original[j]=temp;
            i++;
            j--;
        }

        for (int k:original){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int [] original = {1,2,3,4,5};
        reverseArray(original);
    }
}
