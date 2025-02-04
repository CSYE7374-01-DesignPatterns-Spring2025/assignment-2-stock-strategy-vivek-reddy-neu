package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private static StockMarket instance;
    private List<String> bidHistory;

    private StockMarket() {
        this.bidHistory = new ArrayList<>();
    }

    public static StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    public void addBid(String bid) {
        bidHistory.add(bid);
    }

    public List<String> getBidHistory() {
        return bidHistory;
    }
    
    public static void demo() {
    	StockMarket stockMarket = StockMarket.getInstance();

        StockFactory stockAFactory = StockAFactory.getInstance();
        StockFactory stockBFactory = StockBFactory.getInstance();
        StockA gme = (StockA) stockAFactory.createStock("GameStop", 150.0, "GameStop Stock");
        StockB peloton = (StockB) stockBFactory.createStock("Peloton", 100.0, "Peloton Stock");

        
        gme.setStrategy(new BullMarketStrategy());    
        peloton.setStrategy(new BearMarketStrategy());

        String[] gmeBids = {"160.00", "-160.00", "-150.00", "140.00", "-150.00", "150.00"};
        String[] pelotonBids = {"105.00", "-95.00", "-110.00", "90.00", "115.00", "100.00"};
        
        
        System.out.println("===== Trade GameStop Stock ===== \n");
        for (String bid : gmeBids) {
            gme.setBid(bid);
            stockMarket.addBid("GameStop: " + bid);
            System.out.println("Name: GameStop,  " + "Bid: " + bid + ", Price: " + gme.getPrice() + "\n");
        }

   
        System.out.println("===== Trade Peloton Stock ===== \n");
        for (String bid : pelotonBids) {
        	peloton.setBid(bid);
        	stockMarket.addBid("Peloton: " + bid);
       
            System.out.println("Name: Peloton, " + "Bid: " + bid + ", Price: " + peloton.getPrice() + "\n");
        }
    }
}

