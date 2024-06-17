package com.StockMarket.main;

import com.Stock.model.Stock;
import com.StockMarket.model.StockMarket;

public class Main {
	public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket(10);

        // Create some stocks
        Stock stock1 = new Stock("BAJ", "Bajaj Finance", 190.50, 800);
        Stock stock2 = new Stock("KIA", "Kia Motors Pvt Limited", 3200.00, 900);
        Stock stock3 = new Stock("MYN", "Myntra.com", 3400.00, 300);

        // Add stocks
        stockMarket.addStock(stock1);
        stockMarket.addStock(stock2);
        stockMarket.addStock(stock3);

        // List all stocks
        System.out.println("Listing all stocks:");
        stockMarket.listAllStocks();

        // Get a stock
        System.out.println("\nGetting stock with symbol KIA:");
        System.out.println(stockMarket.getStock("KIA"));

        // Update a stock
        Stock updatedStock = new Stock("BAJ", "Bajaj Finance", 250.50, 1000);
        stockMarket.updateStock("BAJ", updatedStock);
        System.out.println("\nAfter updating BAJ:");
        stockMarket.listAllStocks();

        // Delete a stock
        stockMarket.deleteStock("MYN");
        System.out.println("\nAfter deleting MYN:");
        stockMarket.listAllStocks();
    }
}

