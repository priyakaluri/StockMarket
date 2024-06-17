package com.StockMarket.model;

import com.Stock.model.Stock;

public class StockMarket {
    private Stock[] stocks;
    private int count;

    // Constructor
    public StockMarket(int capacity) {
        stocks = new Stock[capacity];
        count = 0;
    }

    // Add a new stock
    public void addStock(Stock stock) {
        if (count < stocks.length) {
            stocks[count] = stock;
            count++;
        } else {
            System.out.println("Stock market is full. Cannot add more stocks.");
        }
    }

    // Retrieve a stock's information by its symbol
    public Stock getStock(String symbol) {
        for (int i = 0; i < count; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                return stocks[i];
            }
        }
        return null;
    }

    // Update the details of an existing stock
    public void updateStock(String symbol, Stock updatedStock) {
        for (int i = 0; i < count; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                stocks[i] = updatedStock;
                return;
            }
        }
        System.out.println("Stock not found.");
    }

    // Remove a stock from the stock market
    public void deleteStock(String symbol) {
        for (int i = 0; i < count; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                for (int j = i; j < count - 1; j++) {
                    stocks[j] = stocks[j + 1];
                }
                stocks[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Stock not found.");
    }

    // List all stocks in the stock market
    public void listAllStocks() {
        for (int i = 0; i < count; i++) {
            System.out.println(stocks[i]);
        }
    }
}
