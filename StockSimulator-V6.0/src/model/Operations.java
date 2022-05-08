package model;

import app.Main;
import java.util.Optional;

public class Operations {
    
    public static int buy(Trade t){
        if(t.sharesAvailable() && t.hashEnoughCash())
        {
            Stock sto = t.getSto();
            
            Main.stocks.stream()
                    .filter(item -> item.getSymbol().equals(sto.getSymbol()))
                    .forEach(item -> {
                        item.setSharesLeft(item.getSharesLeft() - t.getQuantityToTrade());
                    });

            sto.setQuantity(t.getQuantityToTrade());
            Main.actualAccount.addStock(sto);
            Main.actualAccount.setAccountCash(Main.actualAccount.getAccountCash() - t.getTotalValue());
            
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    public static int sell(Trade t){
        if(t.sharesAvailable() && t.haveStock(t.getSto(), t.getQuantityToTrade()))
        {
            Stock sto = t.getSto();
            
            Main.stocks.stream()
                    .filter(item -> item.getSymbol().equals(sto.getSymbol()))
                    .forEach(item -> {
                        item.setSharesLeft(item.getSharesLeft() + t.getQuantityToTrade());
                    });
            
            Main.actualAccount.removeStock(sto, t.getQuantityToTrade());
            Main.actualAccount.setAccountCash(Main.actualAccount.getAccountCash() + (sto.getCurrentPrice() * sto.getQuantity()));

            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    public static int sellShort(Trade t){
        Stock sto = t.getSto();
        
        if((t.getQuantityToTrade() + sto.getSharesLeft()) <= sto.getTotalShares())
        {
            Main.stocks.stream()
                    .filter(item -> item.getSymbol().equals(sto.getSymbol()))
                    .forEach(item -> {
                        item.setSharesLeft(item.getSharesLeft() + t.getQuantityToTrade());
                    });
            
            Main.actualAccount.addShortingStock(sto, t.getQuantityToTrade());
            Main.actualAccount.setAccountCash(Main.actualAccount.getAccountCash() + (sto.getCurrentPrice() * sto.getQuantity()));
            
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    public static int buyToCover(Trade t){
        Stock sto = t.getSto();
        Account acc = t.getAcc();
        
        Optional<Stock> shortingStockSearched = acc.getShortingStock().stream()
                .filter(item -> item.getSymbol().equals(sto.getSymbol()))
                .findFirst();
        
        if(shortingStockSearched.isPresent() && t.sharesAvailable())
        {
            acc.getShortingStock().stream()
                    .filter(item -> item.getSymbol().equals(sto.getSymbol()))
                    .forEach(item -> {
                        item.setSharesLeft(item.getSharesLeft() - t.getQuantityToTrade());
                        item.setQuantity(item.getQuantity() - t.getQuantityToTrade());
                    });
            
            acc.removeShortingStock(sto, t.getQuantityToTrade());
            acc.setAccountCash(acc.getAccountCash() - t.getTotalValue());
            
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
