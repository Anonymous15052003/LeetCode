public class test4 {
    public static void reversed(int [] arr, int start, int end){
        if (start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reversed(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        reversed(nums,0,nums.length-1);
        System.out.print("[");
        for (int a : nums){
            System.out.print(a+" ");
        }
        System.out.print("]");
    }
}
