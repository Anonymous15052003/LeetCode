public class TypeI {
    public static int maxprofit(int [] arr){
        int mini = arr[0];
        int profit = 0;
        for (int i=1;i<arr.length;i++){
            int currProfit = arr[i]-mini;
            profit = Math.max(currProfit,profit);
            mini = Math.min(arr[i],mini);
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};
        System.out.print("The maximum profit by selling the stock is "+maxprofit(nums));
    }
}