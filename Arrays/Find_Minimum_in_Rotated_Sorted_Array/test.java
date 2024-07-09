package Find_Minimum_in_Rotated_Sorted_Array;

public class test {
    public static int answer(int [] arr){
        int i = 0;
        int j = arr.length-1;
        int mini = Integer.MAX_VALUE;

         while (i<=j){
            int mid = (i+j)/2;
            
            if (arr[i]<=arr[mid]){
                mini = Math.min(mini,arr[i]);
                i = mid+1;
            }
            else{
                mini = Math.min(mini,arr[mid]);
                j = mid-1;
            }
         }
         return mini;
    }
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        int ans = answer(nums);
        System.out.println(ans);
    }
}
