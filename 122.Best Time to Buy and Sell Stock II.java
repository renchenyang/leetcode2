public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0, max = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i + 1] - prices[i] > 0) {
                max += prices[i + 1] - prices[i];
            }
            if (result < max) {
                result = max;
            }
        }
        return result;
    }
}