package model;

import app.Main;
import java.util.Vector;

public class Stock {
    
    private String symbol;
    private String description;
    private int totalShares;
    private int sharesLeft;
    private int quantity;
    private double currentPrice;
    
    /**
     * Constructor.
     * 
     * @param symbol = action symbol
     * @param description = description symbol
     * @param currentPrice = current price of the action
     * @param totalShares = total shares of the action
     */
    public Stock(String symbol, String description, double currentPrice, int totalShares) {
        this.symbol = symbol;
        this.description = description;
        this.currentPrice = currentPrice;
        this.totalShares = totalShares;
        sharesLeft = totalShares;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public int getSharesLeft() {
        return sharesLeft;
    }

    public void setSharesLeft(int sharesLeft) {
        this.sharesLeft = sharesLeft;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return symbol+" - "+description+" - Trading at: "+currentPrice;
    }
    
    /**
     * Returns all the elements of the stock list in a
     * vector to be able to display them in a jcombobox
     * 
     * @return vector of stocks
     */
    public static Vector<Stock> getStocksToVector(){
        Vector<Stock> actualStocks = new Vector();
        
        Main.stocks.stream()
                .forEach(item -> {
                    actualStocks.add(item);
                });
        
        return actualStocks;
    }
    
}
