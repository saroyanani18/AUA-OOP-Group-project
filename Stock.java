package stocksimulator;

import java.io.Serializable;

public class Stock implements Serializable {
    private final String symbol, description;
    private final int totalShares;
    private int sharesLeft, quantity;
    private String type;
    private double currentPrice, dayChange, yearHigh, yearLow;

    public Stock(String symbol, String description, double currentPrice, int totalShares) {
        this.symbol = symbol;
        this.description = description;
        this.currentPrice = currentPrice;
        this.totalShares = totalShares;
        sharesLeft = totalShares;
        type = "stock";
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return currentPrice;
    }

    public void setPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getSharesLeft() {
        return sharesLeft;
    }

    public void updateSharesLeft(int quantity) {
        sharesLeft -= quantity;
    }

    public void updateSharesLeft(int quantity, String transaction) {
        sharesLeft += quantity;
    }

    public int getTotalShares() {
        return totalShares;
    }

}
