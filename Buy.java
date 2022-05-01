package stocksimulator;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Buy extends Trade {
    DecimalFormat df = new DecimalFormat("#.00");

    public Buy(Account ac) {
        super(ac);
        try {
            Scanner user_input = new Scanner(System.in);

            System.out.println("Enter stock symbol you would like to trade: ");
            symbol = user_input.nextLine();

            int stockIndex = ac.find(symbol, StockSimulator.stocks, "");

            if (stockIndex == -1) {
                System.out.println("Sorry that stock is not trading.");
            } else {
                Stock stockTrade = StockSimulator.stocks[stockIndex];

                System.out.println("How many shares would you like to trade: ");
                quantity = user_input.nextInt();

                if (sharesAvailable(stockTrade, quantity)) {
                    double totalPrice = stockTrade.getPrice() * quantity;
                    if (hasEnoughCash(totalPrice)) {
                        System.out.println("The total comes to: \u00A3" + df.format(totalPrice));
                        stockTrade.setQuantity(quantity);
                        stockTrade.updateSharesLeft(quantity);
                        stockTrade.setType("buy");
                        ac.addStock(stockTrade, "buy");
                        ac.updateCash(totalPrice, "buy");
                    } else {
                        System.out.println("Sorry, not enough cash.");
                    }
                } else {
                    System.out.println("Sorry not enough shares available.");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error trade not gone through");
        }
    }
}
