package Trapping_Rain_Water;

public class twopointers {
    public static int trap(int [] height){
        int n = height.length;
        int water = 0;
        int left = 0;
        int right = n-1;

        int maxLeft=0;
        int maxRight=0;
        while (left<=right){
            if (height[left]<=height[right]){
                if (height[left]>maxLeft){
                    maxLeft=height[left];
                }
                else{
                    water+=maxLeft-height[left];
                }
                left++;
            }
            else{
                if (height[right]>=maxRight){
                    maxRight=height[right];
                }
                else{
                    water+=maxRight-height[right];
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
