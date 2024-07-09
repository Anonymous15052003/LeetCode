import java.util.Arrays;
import java.util.Vector;

class TypeII {
    static long getMaximumProfitUtil(long[] Arr, int ind, int buy, int n, Vector<Vector<Long>> dp) {
        // Base case
        if (ind == n)
            return 0;

        if (dp.get(ind).get(buy) != -1)
            return dp.get(ind).get(buy);

        long profit=0;

        if (buy == 0) {
            profit = Math.max(0 + getMaximumProfitUtil(Arr, ind + 1, 0, n, dp),
                    -Arr[ind] + getMaximumProfitUtil(Arr, ind + 1, 1, n, dp));
        }

        if (buy == 1) { // We can sell the stock
            profit = Math.max(0 + getMaximumProfitUtil(Arr, ind + 1, 1, n, dp),
                    Arr[ind] + getMaximumProfitUtil(Arr, ind + 1, 0, n, dp));
        }

        dp.get(ind).set(buy, profit);
        return profit;
    }

    static long getMaximumProfit(long[] Arr, int n) {
        Vector<Vector<Long>> dp = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            Vector<Long> row = new Vector<>(2);
            row.addAll(Arrays.asList(-1L, -1L));
            dp.add(row);
        }

        if (n == 0)
            return 0;

        long ans = getMaximumProfitUtil(Arr, 0, 0, n, dp);
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        long[] Arr = {7, 1, 5, 3, 6, 4};

        System.out.println("The maximum profit that can be generated is " + getMaximumProfit(Arr, n));
    }
}


