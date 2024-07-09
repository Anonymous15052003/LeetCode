public class test3 {
    public static int [] reversed(int [] arr){
        int n = arr.length;
        int l = 0;
        int r = n-1;
        
        while (l<r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int [] ans = reversed(nums);
        System.out.print("[");
        for (int a : ans){
            System.out.print(a+" ");
        }
        System.out.print("]");
    }
}