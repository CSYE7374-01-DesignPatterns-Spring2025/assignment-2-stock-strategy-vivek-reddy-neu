package edu.neu.csye7374;

public class EagerStockAFactory extends StockFactory {
  private static final StockFactory instance = new EagerStockAFactory();

  private EagerStockAFactory() {}

  public static StockFactory getInstance() {
      return instance;
  }

  @Override
  public StockAPI createStock(String id, double price, String description) {
      return new StockA(id, price, description);
  }
}