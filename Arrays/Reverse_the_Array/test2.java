public class test2 {
    public static void reverseArrayExtraArray(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        for (int i=0;i<n;i++){
            ans[i] = arr[n-i-1];
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
