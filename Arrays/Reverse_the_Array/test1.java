import java.util.*;

public class test1 {
    public static void reverseArrayExtraArray(int [] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=arr.length-1;i>=0;i--){
            ans.add(arr[i]);
        }
        System.out.print("[");
        for (int a : ans){
            System.out.print(a+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int [] original={1,2,3,4,5};
        reverseArrayExtraArray(original);
    }
}
