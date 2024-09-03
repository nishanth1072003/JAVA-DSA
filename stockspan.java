/*
 Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class stockspan {

    public static int maxprofit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int maxprofit = 0;
        int minprices = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int currentprice = prices[i];
            minprices = Math.min(minprices, currentprice);
            maxprofit = Math.max(maxprofit, currentprice - minprices);

        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int maxdifference = maxprofit(prices);
        System.out.println(maxdifference);
    }

}
