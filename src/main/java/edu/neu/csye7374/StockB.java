package edu.neu.csye7374;

public class StockB extends StockAPI implements Tradable {
  private int metric;
  private int buyCount;
  private int sellCount;
  private static final double stockSpecificFactor = 1.13;

  public StockB(String id, double price, String description) {
    super(id, price, description);
    this.metric = 5;
    this.buyCount = 0;
    this.sellCount = 0;
  }

  @Override
  public void setBid(String bid) {
    double bidPrice = Double.parseDouble(bid);
    if (bidPrice > 0) { // Buy
      buyCount++;
      metric += 3;
    } else { // Sell
      sellCount++;
      metric -= 1;
    }

    
    MarketStrategy strategy = this.getStrategy();
	double newPrice = strategy.getNewPrice(stockSpecificFactor, this.getPrice());
	this.setPrice(newPrice);
  }


  @Override
  public int getMetric() {
    int tempDiff = buyCount - sellCount;
    if (tempDiff == 0) {
      return 0;
    }
    metric /= tempDiff;
    metric = (int) metric;
    return metric;
  }
}