package Container_With_Most_Water;

public class bruteforce {
    public static int answer(int [] arr){
        int n = arr.length;
        int area;
        int ans=Integer.MIN_VALUE;
        
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                area = (j-i)*(Math.min(arr[i], arr[j]));
                ans = Math.max(ans, area);
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
