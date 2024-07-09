package Container_With_Most_Water;

public class twoPointer {
    public static int answer(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans = Integer.MIN_VALUE;
        int area;

        while (left<right){
            area = (right-left)*(Math.min(arr[left], arr[right]));
            ans = Math.max(ans,area);

            if (arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] heights = {1,8,6,2,5,4,8,3,7};
        int ans = answer(heights);
        System.out.println(ans);
    }
}
