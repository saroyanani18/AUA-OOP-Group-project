package app;

import controller.EnterAccountController;
import controller.PrincipalController;
import java.awt.Color;
import java.util.List;
import java.util.Arrays;
import model.Account;
import model.Stock;
import view.EnterAccount;
import view.Principal;

public class Main {
    
//    Existing accounts
    public static List<Account> accounts = Arrays.asList(new Account("Test 1", 500),
                                                         new Account("Test 2", 300));
    
//    Existing stocks
    public static List<Stock> stocks = Arrays.asList(new Stock("AAPL", "Apple Inc, designs, manufactures and markets mobile communication and media devices, personal computers and portable digital music players worldwide.", 122.02, 100000000), new Stock("MSFT", "Microsoft Corp, develops, licenses, markets and supports software, services and devices worldwide.", 42.60, 200000000),
                                                     new Stock("FB", "Facebook, online social networking service", 81.67, 100000000),
                                                     new Stock("TWTR", "Twitter, online social networking service, that a user sends and reads short messages", 50.47, 100000000),
                                                     new Stock("PG", "Procter and Gamble co, is an American multinational consumer goods company", 82.83, 100000000),
                                                     new Stock("JD", "JD, is engaged in the sale of electronics products and general merchandise products", 29.22, 100000000),
                                                     new Stock("GOOG", "Google, is an American multinational corporation specialising in Internet-related services", 542.56, 100000000),
                                                     new Stock("WMT", "Walmart, is a retail corporation that operates a chain of discount stores", 80.71, 100000000),
                                                     new Stock("TSCO", "Tesco, a british multinational grocery and general merchandise retailer", 242.13, 100000000),
                                                     new Stock("VA", "Virgin America, a United States based airline", 30.36, 100000000),
                                                     new Stock("BT", "Bt Group, is a British multinational telecommunications service", 65.65, 100000000),
                                                     new Stock("HSBA", "HSBC, a British multinational banking and financial services company", 581.08, 100000000));
    
//    Account selected or created by the user
    public static Account actualAccount;
    
    /**
     * Main method.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
//        Instantiating the views
        var p = new Principal();
        var ea = new EnterAccount(p, true);
        
//        Instantiating the controllers of the views
        var pc = new PrincipalController(p);
        var eac = new EnterAccountController(ea);
        
//        Displaying the program
        p.setVisible(true);
        ea.setVisible(true);
        
    }
}
