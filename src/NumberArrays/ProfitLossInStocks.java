package NumberArrays;
import java.text.DecimalFormat;
public class ProfitLossInStocks {

	public static void main(String[] args) {
		double[] inputDayPrices = { 95.11, 38.88, 51.00, 87.99, 79.00 };
		String result = maxPnLChecker(inputDayPrices);
		System.out.println("Maxmimum possible Profit/Loss for the day = " + result);
	}

	public static String maxPnLChecker(double[] dayStockPrices) {
		int len = dayStockPrices.length;
		if (len <= 1 || dayStockPrices == null)
			return "Invalid Input - Atleast 2 price point inputs needed";

		if (len > 1) {
			for (double pricePoint : dayStockPrices) {
				if (pricePoint < 0)
					return "Invalid Input - Stock price cannot have negative values";
			}
		}

		DecimalFormat twoDecimal = new DecimalFormat("#.##");
		double minPrice = dayStockPrices[0];
		double maxPrice = dayStockPrices[0];
		double maxPosPriceDiff = dayStockPrices[1] - dayStockPrices[0];
		double maxNegPriceDiff = dayStockPrices[0] - dayStockPrices[1];
		int minPOS = 0, maxPOS = 0;
		for (int i = 1; i < len; i++) {
			if (dayStockPrices[i] - minPrice > maxPosPriceDiff)
				maxPosPriceDiff = dayStockPrices[i] - minPrice;
			if (dayStockPrices[i] < minPrice) {
				minPrice = dayStockPrices[i];
				minPOS = i;
			}

			if (maxPOS < minPOS)
				maxNegPriceDiff = minPrice - maxPrice;
			if (dayStockPrices[i] > maxPrice) {
				maxPrice = dayStockPrices[i];
				maxPOS = i;
			}
		}

		return "$" + Double.valueOf(twoDecimal.format(maxPosPriceDiff)) + " / $"
				+ Double.valueOf(twoDecimal.format(maxNegPriceDiff));
	}
}

// for (int i = 1; i < len; i++) {
// // if (maxPrice - dayStockPrices[i] < maxNegPriceDiff)
// maxNegPriceDiff = minPrice - maxPrice;
// if (dayStockPrices[i] > maxPrice)
// maxPrice = dayStockPrices[i];
// if (dayStockPrices[i] < minPrice)
// minPrice = dayStockPrices[i];
// }