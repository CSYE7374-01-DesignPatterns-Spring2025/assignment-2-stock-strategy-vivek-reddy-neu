package edu.neu.csye7374;

public class StockAFactory extends StockFactory {

    public static StockFactory getInstance() {
        return new StockAFactory();
    }
    @Override
    public StockAPI createStock(String id, double price, String description) {
        return new StockA(id, price, description);
    }
}
 