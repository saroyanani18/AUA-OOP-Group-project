package model;

import java.util.Optional;

public class Trade {
    
    public static final int OPERATION_BUY = 1;
    public static final int OPERATION_SELL = 2;
    public static final int OPERATION_SELL_SHORT = 3;
    public static final int OPERATION_BUY_TO_COVER = 4;
    
    private Account acc;
    private Stock sto;
    private int quantityToTrade;
    
    /**
     * Constructor.
     */
    public Trade(){}
    
    /**
     * Constructor.
     * 
     * @param acc = account to operate
     * @param sto = stock to operate
     * @param quantityToTrade = quantity to operate
     */
    public Trade(Account acc, Stock sto, int quantityToTrade) {
        this.acc = acc;
        this.sto = sto;
        this.quantityToTrade = quantityToTrade;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public Stock getSto() {
        return sto;
    }

    public void setSto(Stock sto) {
        this.sto = sto;
    }

    public int getQuantityToTrade() {
        return quantityToTrade;
    }

    public void setQuantityToTrade(int quantityToTrade) {
        this.quantityToTrade = quantityToTrade;
    }

    public double getTotalValue(){
        return (sto.getCurrentPrice() * quantityToTrade);
    }
    
    public boolean sharesAvailable() {
        return (quantityToTrade <= sto.getSharesLeft())
                && (quantityToTrade > 0);
    }
    
    public boolean hashEnoughCash(){
        return (acc.getAccountCash() > (sto.getCurrentPrice() * quantityToTrade));
    }
    
    public boolean haveStock(Stock sto, int stock){
        Optional<Stock> stockSearched = Optional.empty();
        for (Stock x : acc.getStock())
            if (x.getSymbol().equals(sto.getSymbol())) {
                stockSearched = Optional.of(x);
                break;
            }

        return stockSearched.isPresent() && stockSearched.get().getQuantity() >= stock;
    }
    
}
