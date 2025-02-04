package edu.neu.csye7374;

public abstract class StockAPI implements Tradable {
  private String id;
  private double price;
  private String description;
  private MarketStrategy strategy;

  public StockAPI(String id, double price, String description) {
    this.id = id;
    this.price = price;
    this.description = description;
  }

  
  public void setStrategy(MarketStrategy strategy) {
      this.strategy = strategy;
  }
  
  public MarketStrategy getStrategy() {
  	return this.strategy;
  }
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "" + id + " [Price=" + price + ", Description=" + description + "]";
  }
}
