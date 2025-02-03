package edu.neu.csye7374;

public interface MarketStrategy {
	double getNewPrice(double stockSpecificFactor, double price);
}
