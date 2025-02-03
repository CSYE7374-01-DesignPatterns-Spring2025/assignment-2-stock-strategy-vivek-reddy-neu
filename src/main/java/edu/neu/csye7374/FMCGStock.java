package edu.neu.csye7374;

public class FMCGStock extends Stock{
	private static final String type = "FMCG";
	private static final double stockSpecificFactor = 1.07;

	public FMCGStock(String name, double price, String ticker) {
		super(name, price, type, ticker);
		
	}
	
	@Override
	public void updatePrice() {
		MarketStrategy strategy = this.getStrategy();
		double newPrice = strategy.getNewPrice(stockSpecificFactor, this.getPrice());
		this.setPrice(newPrice);
	}
}
