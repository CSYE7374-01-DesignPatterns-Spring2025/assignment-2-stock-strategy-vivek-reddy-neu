package edu.neu.csye7374;

public abstract class Stock {
    private String name;
    private double price;
    private String type;
    private String ticker;
    private MarketStrategy strategy;
    
    
    public Stock(String name, double price, String type, String ticker) {
        
        this.name = name;
        this.price = price;
        this.type = type;
        this.ticker = ticker;
    }
    
    public void setStrategy(MarketStrategy strategy) {
        this.strategy = strategy;
    }
    
    public MarketStrategy getStrategy() {
    	return this.strategy;
    }
    
    public void updatePrice() {};
    
    public double getPrice() {
    	return this.price;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public String getStockInfo() {
    	return "name: " + name +
              ", price: $" + String.format("%.2f", price)  +
              ", type: " + type +
              ", ticker: " + ticker;
    }
    
    public static void demo() {
    	
    	Stock walmart = new FMCGStock("WALMART", 110.20, "WMT");
        Stock morgStan = new BFSIStock("Morgan Stanley", 150.00, "MS");

        
        MarketStrategy bullMarket = new BullMarketStrategy();
        MarketStrategy bearMarket = new BearMarketStrategy();

        
        System.out.println("Initial State\n");
        System.out.println(walmart.getStockInfo()+"\n");
        System.out.println(morgStan.getStockInfo()+"\n");

        
        System.out.println("Stocks in Bull Market\n");
        
        walmart.setStrategy(bullMarket);    
        morgStan.setStrategy(bullMarket);  
        
        walmart.updatePrice();
        morgStan.updatePrice();
        
        System.out.println(walmart.getStockInfo()+"\n");
        System.out.println(morgStan.getStockInfo()+"\n");

        
        System.out.println("Stocks in Bear Market\n");
        
        walmart.setStrategy(bearMarket);
        morgStan.setStrategy(bearMarket);   
        
        walmart.updatePrice();
        morgStan.updatePrice();
        
        System.out.println(walmart.getStockInfo()+"\n");
        System.out.println(morgStan.getStockInfo()+"\n");

    }
    
}

