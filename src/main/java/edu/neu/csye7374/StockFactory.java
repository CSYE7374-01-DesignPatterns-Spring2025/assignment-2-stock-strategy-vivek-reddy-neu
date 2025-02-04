package edu.neu.csye7374;

public abstract class StockFactory {
  abstract StockAPI createStock(String id, double price, String description);
}