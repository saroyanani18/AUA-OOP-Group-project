

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

    public Trade() {
    }

    public Trade(Account acc, Stock sto, int quantityToTrade) {
        this.acc = acc;
        this.sto = sto;
        this.quantityToTrade = quantityToTrade;
    }

    public Account getAcc() {
        return this.acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public Stock getSto() {
        return this.sto;
    }

    public void setSto(Stock sto) {
        this.sto = sto;
    }

    public int getQuantityToTrade() {
        return this.quantityToTrade;
    }

    public void setQuantityToTrade(int quantityToTrade) {
        this.quantityToTrade = quantityToTrade;
    }

    public double getTotalValue() {
        return this.sto.getCurrentPrice() * (double)this.quantityToTrade;
    }

    public boolean sharesAvailable() {
        return this.quantityToTrade <= this.sto.getSharesLeft() && this.quantityToTrade > 0;
    }

    public boolean hashEnoughCash() {
        return this.acc.getAccountCash() > this.sto.getCurrentPrice() * (double)this.quantityToTrade;
    }

    public boolean haveStock(Stock sto, int stock) {
        Optional<Stock> stockSearched = this.acc.getStock().stream().filter((x) -> {
            return x.getSymbol().equals(sto.getSymbol());
        }).findFirst();
        return stockSearched.isPresent() && ((Stock)stockSearched.get()).getQuantity() >= stock;
    }
}
