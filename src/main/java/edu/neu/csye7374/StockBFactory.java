package edu.neu.csye7374;

public class StockBFactory extends StockFactory {

    public static StockFactory getInstance() {
        return new StockBFactory();
    }

    @Override
    public StockAPI createStock(String id, double price, String description) {
        return new StockB(id, price, description);
    }
}
 