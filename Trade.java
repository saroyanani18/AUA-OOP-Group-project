package stocksimulator;

public class Trade {
    String symbol;
    int quantity;
    final Account ac;

    public Trade(Account ac) {
        this.ac = ac;
    }

    public boolean sharesAvailable(Stock s, int quantity) {
        return (quantity <= s.getSharesLeft()) && (quantity > 0);
    }

    public boolean hasEnoughCash(double total) {
        return total <= ac.getCash();
    }
}
