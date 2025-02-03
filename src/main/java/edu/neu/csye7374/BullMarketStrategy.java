package edu.neu.csye7374;

public class BullMarketStrategy implements MarketStrategy{
	private static double bullMarketRise = 0.27;
	
	@Override
	public double getNewPrice(double stockSpecificFactor, double price) {
		return price+(stockSpecificFactor*bullMarketRise*price);
	}
}
