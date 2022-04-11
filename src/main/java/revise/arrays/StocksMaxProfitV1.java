package revise.arrays;

public class StocksMaxProfitV1 {
  public static int maxProfit(int[] stockPrices) {
    int maxProfit = 0;
    int minSoFar = stockPrices[0];

    for (int i = 0; i < stockPrices.length; i++) {
      minSoFar = Math.min(minSoFar, stockPrices[i]);
      int profit = stockPrices[i] - minSoFar;
      maxProfit = Math.max(maxProfit, profit);
    }
    return maxProfit;
  }
}
