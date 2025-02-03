package edu.neu.csye7374;

public class BearMarketStrategy implements MarketStrategy{
	private static double bearMarketDecline = 0.22;
	
	@Override
	public double getNewPrice(double stockSpecificFactor, double price) {
		return price-(stockSpecificFactor*bearMarketDecline*price);
	}
}
