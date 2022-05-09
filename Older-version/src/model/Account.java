package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Account {
    
    private String accountName;
    private double accountValue;
    private double accountCash;
    private List<Stock> stock;
    private List<Stock> shortingStock;

    /**
     * Constructor.
     * 
     * @param accountName = Account Owner Name
     * @param accountCash = Initial account money
     */
    public Account(String accountName, double accountCash) {
        this.accountName = accountName;
        this.accountCash = accountCash;
        
        this.stock = new ArrayList();
        this.shortingStock = new ArrayList();
    }

    /**
     * Get the value of 'accountName'
     * 
     * @return account name
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountValue() {
        double totalValue = 0;

        for (Stock s : stock) {
            totalValue += (s.getCurrentPrice() * s.getQuantity());
        }

        return totalValue + accountCash;
    }

    public void setAccountValue(double accountValue) {
        this.accountValue = accountValue;
    }

    public double getAccountCash() {
        return accountCash;
    }

    public void setAccountCash(double accountCash) {
        this.accountCash = accountCash;
    }
    
    public List<Stock> getStock(){
        return stock;
    }
    
    public void addStock(Stock s){
        Optional<Stock> stockSearched = this.stock.stream()
                                          .filter(x -> x.getSymbol().equals(s.getSymbol()))
                                          .findAny();
        
        stockSearched.ifPresentOrElse(value -> {
                                            Stock sto = stockSearched.get();
                                            sto.setQuantity(sto.getQuantity() + s.getQuantity());
                                    }, () -> {
                                            this.stock.add(s);
                                    });
    }
    
    public void removeStock(Stock s, int quantityToSell){
        Optional<Stock> stockSearched = this.stock.stream()
                                          .filter(x -> x.getSymbol().equals(s.getSymbol()))
                                          .findAny();
        
        stockSearched.ifPresent(value -> {
                                            Stock sto = stockSearched.get();
                                            int actualQuantity = sto.getQuantity();
                                            
                                            if(actualQuantity == quantityToSell)
                                            {
                                                this.stock.remove(s);
                                            }
                                            else
                                            {
                                                sto.setQuantity(sto.getQuantity() - quantityToSell);
                                            }
                                    });
    }
    
    public List<Stock> getShortingStock(){
        return this.shortingStock;
    }
    
    public void addShortingStock(Stock s, int quantityToSell){
        Optional<Stock> stockSearched = this.stock.stream()
                                          .filter(x -> x.getSymbol().equals(s.getSymbol()))
                                          .findFirst();
        
        stockSearched.ifPresent(value -> {
                                    Stock sto = stockSearched.get();
                                    sto.setQuantity(sto.getQuantity() + quantityToSell);
                                    this.shortingStock.add(sto);
                                    this.stock.remove(sto);
                                });
    }
    
    public void removeShortingStock(Stock s, int quantityToSell){
        Optional<Stock> stockSearched = this.shortingStock.stream()
                                          .filter(x -> x.getSymbol().equals(s.getSymbol()))
                                          .findFirst();
        
        stockSearched.ifPresent(value -> {
                                            Stock sto = stockSearched.get();
                                            int actualQuantity = sto.getQuantity();
                                            
                                            if(actualQuantity == quantityToSell)
                                            {
                                                this.shortingStock.remove(s);
                                            }
                                            else
                                            {
                                                sto.setQuantity(sto.getQuantity() - quantityToSell);
                                            }
                                    });
    }

}
