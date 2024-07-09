package Trapping_Rain_Water;

public class test {
    public static int trap(int [] arr){
        int water = 0;
        int left = 0;
        int right = arr.length-1;

        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;

        while (left<=right){
            if (arr[left]<=arr[right]){
                if (arr[left]>maxLeft){
                    maxLeft = arr[left];
                }
                else{
                    water += maxLeft - arr[left];
                }
                left++;
            }
            else{
                if (arr[right]>maxRight){
                    maxRight = arr[right];
                }
                else{
                    water += maxRight - arr[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String args[]) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The water that can be trapped is " + trap(arr));
    }
}
