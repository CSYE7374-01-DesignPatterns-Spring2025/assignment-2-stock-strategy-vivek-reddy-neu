package edu.neu.csye7374;

public class LazyStockBFactory extends StockFactory {
  private static StockFactory instance;

  private LazyStockBFactory() {}

  public static StockFactory getInstance() {
      if (instance == null) {
          instance = new LazyStockBFactory();
      }
      return instance;
  }

  @Override
  public StockAPI createStock(String id, double price, String description) {
      return new StockB(id, price, description);
  }
}