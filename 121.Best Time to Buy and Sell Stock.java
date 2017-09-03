public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0, diff = 0, len = prices.length;
        if (len > 0) {
            int max = prices[len - 1];
            for (int i = len - 2; i >= 0; i--) {
                diff = max - prices[i];
                if (prices[i] > max) {
                    max = prices[i];
                }
                if (diff > result) {
                    result = diff;
                }
            }
        }
        return result;
    }
}