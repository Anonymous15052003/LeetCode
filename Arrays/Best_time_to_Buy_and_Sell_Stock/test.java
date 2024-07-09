public class test {
    public static int maxprofit(int [] arr){
        int mini = Integer.MAX_VALUE;
        int profit = 0;

        for (int i=0;i<arr.length;i++){
            int currProfit = arr[i]-mini;
            profit = Math.max(profit,currProfit);
            mini = Math.min(mini,arr[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};
        System.out.print("The maximum profit by selling the stock is "+maxprofit(nums));
    }
}
