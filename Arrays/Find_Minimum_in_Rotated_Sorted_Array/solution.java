package Find_Minimum_in_Rotated_Sorted_Array;

public class solution {
    public static int answer(int [] arr){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int right = n-1;

        while (left<=right){
            int mid = (left+right)/2;
            if (arr[left]<=arr[mid]){
                ans = Math.min(arr[left], ans);
                left = mid+1;
            }
            else {
                ans = Math.min(arr[mid],ans);
                right = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        int ans = answer(nums);
        System.out.println(ans);
    }
}
