package stocksimulator;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account implements Serializable {
    private final String accountName;
    private double accountValue, cash;
    private ArrayList<Stock> heldStocks = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("#.00");

    public Account(String accountName, double cash) {
        this.accountName = accountName;
        this.cash = cash;
    }

    public String getName() {
        return accountName;
    }

    public double getCash() {
        return cash;
    }

    public void updateCash(double cash, String trade) {
        switch (trade) {
            case "buy":
                this.cash -= cash;
                break;
            case "sell":
                this.cash += cash;
                break;
            default:
                System.out.println("Error, trade required.");
                break;
        }
    }

    public void addStock(Stock s, String type) {
        int index = -1;
        for (int i = 0; i < heldStocks.size(); i++) {
            Stock stock = heldStocks.get(i);
            if (stock.getSymbol().equals(s.getSymbol()) && (stock.getType().equals(s.getType()))) {
                index = i;
            }
        }
        if (index == -1) {
            heldStocks.add(s);
        } else {
            Stock stock = heldStocks.get(index);
            int quantity = stock.getQuantity() + s.getQuantity();
            stock.setQuantity(quantity);
        }
    }

    public void deleteStock(int index) {
        heldStocks.remove(index);
    }

    public void displayPortfolio() {
        System.out.println(accountName + "'s Portfolio");
        System.out.println("---------------------------");
        accountValue = getAccountValue();
        System.out.println("\n Account Value: \u00A3" + df.format(accountValue) + "      Cash: \u00A3" + df.format(cash) + "\n");

        int numOfShorts = 0;

        for (Stock stock : heldStocks) {
            if (!stock.getType().equals("short")) {
                System.out.println("Stock Symbol: " + stock.getSymbol() + "\n" + "Description: " + stock.getDescription() + "\n" + "Price: \u00A3" + df.format(stock.getPrice()) + "\n" + "Quantity: " + (int) (stock.getQuantity()) + "\n" + "Total: \u00A3" + df.format(stock.getPrice() * stock.getQuantity()) + "\n");
            } else {
                numOfShorts++;
            }
        }

        if (!(numOfShorts == 0)) {
            System.out.println("Shorting Stocks");
            System.out.println("-----------------");
            for (Stock stock : heldStocks) {
                if (stock.getType().equals("short")) {
                    System.out.println("Stock Symbol: " + stock.getSymbol() + "\n" + "Description: " + stock.getDescription() + "\n" + "Price: \u00A3" + df.format(stock.getPrice()) + "\n" + "Quantity: " + (int) (stock.getQuantity()) + "\n" + "Total: \u00A3" + df.format(stock.getPrice() * stock.getQuantity()) + "\n");
                }
            }
        }
    }

    public void reduceStock(int index, int quantity) {
        Stock stock = heldStocks.get(index);
        stock.setQuantity((stock.getQuantity() - quantity));
    }

    public double getAccountValue() {
        double totalValue = 0;

        for (Stock s : heldStocks) {
            totalValue += (s.getPrice() * s.getQuantity());
        }

        return totalValue + cash;
    }

    public int find(String symbol, Stock[] stocks, String type) {
        for (int i = 0; i < stocks.length; i++) {
            if ((stocks[i].getSymbol().equals(symbol)) && !(stocks[i].getType().equals(type))) {
                return i;
            }
        }
        return -1;
    }
}
