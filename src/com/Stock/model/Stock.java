package com.Stock.model;

public class Stock {
	 private String symbol;
	 private String company;
	 private double price_per_share;
	 private int shares;
	 
	 public Stock(String symbol, String company, double price_per_share, int shares) {
		super();
		this.symbol = symbol;
		this.company = company;
		this.price_per_share = price_per_share;
		this.shares = shares;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice_per_share() {
		return price_per_share;
	}

	public void setPrice_per_share(double price_per_share) {
		this.price_per_share = price_per_share;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", company=" + company + ", price_per_share=" + price_per_share + ", shares="
				+ shares + "]";
	}
	 
}
