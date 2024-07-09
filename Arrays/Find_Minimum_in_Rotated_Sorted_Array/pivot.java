package Find_Minimum_in_Rotated_Sorted_Array;

public class pivot {
    public static int findMin(int[] arr) {
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                return arr[i+1];
            }
        }
        return arr[0];
    }
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        int ans = findMin(nums);
        System.out.println(ans);
    }
}
