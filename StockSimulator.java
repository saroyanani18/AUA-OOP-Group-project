package stocksimulator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockSimulator {
    private Scanner user_input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    static ArrayList<Account> accounts = new ArrayList<>();

    Account ac;

    static Stock[] stocks;

    public StockSimulator() {

        System.out.print("Enter an Account Name: ");
        String accountName = user_input.next();
        System.out.print("Enter Starting Money: \u00A3");
        int startingMoney = user_input.nextInt();
        ac = new Account(accountName, startingMoney);
        accounts.add(ac);

        run();
    }

    public StockSimulator(Account ac) {
        this.ac = ac;
        run();
    }
    private void run() {
        stocks = ADDSTOCKS.stocks;
        while (true) {
            showMenu(ac);
        }
    }

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Starting Stock Simulator");
        System.out.println("------------------------");

        System.out.println("Do you have an account: <y/n> ");
        String answer = user_input.nextLine();

        if (answer.equals("y") || answer.equals("Y")) {
            System.out.println("Enter your account name: ");
            String accountName = user_input.nextLine();
            int accountIndex = searchAccounts(accountName);

            if (accountIndex == -1) {
                System.out.println("Sorry, there is no account by that name. Please set up an account");
                StockSimulator ss = new StockSimulator();
            } else {
                StockSimulator ss = new StockSimulator(accounts.get(accountIndex));
            }
        } else {
            StockSimulator ss = new StockSimulator();
        }
    }

    public void showMenu(Account ac) {
        Market thread = new Market();
        thread.start();

        System.out.println("\nSelect an option: \n" + " 1. Portfolio\n" + " 2. Search Stock\n" + " 3. Trade stock\n" + " 4. Exit\n");
        int selection;
        try {
            selection = user_input.nextInt();
        } catch (InputMismatchException ex) {
            selection = 5;
        }
        user_input.nextLine();

        switch (selection) {
            case 1:
                ac.displayPortfolio();
                break;
            case 2:
                searchStock(ac);
                break;
            case 3:
                decideTransaction(ac);
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Invalid selection. Try Again.");
                break;
        }
    }

    public void decideTransaction(Account ac) {

        System.out.println("\nSelect an option: \n" + " 1. Buy\n" + " 2. Sell\n" + " 3. Sell Short\n" + " 4. Buy to Cover\n" + " 5. Back\n");
        int selection;
        try {
            selection = user_input.nextInt();
        } catch (InputMismatchException ex) {
            selection = 5;
        }
        user_input.nextLine();

        switch (selection) {
            case 1:
                new Buy(ac);
                break;
            case 2:
                new Sell(ac);
                break;
            case 3:
                new SellShort(ac);
                break;
            case 4:
                new BuytoCover(ac);
                break;
            default:
                System.out.println("Invalid Selection. Go back to main menu.");
            {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(StockSimulator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
        }
    }

    public void searchStock(Account ac) {
        System.out.println("Enter stock name: ");
        String stockSymbol = user_input.nextLine();

        int position = ac.find(stockSymbol, stocks, "");
        if (position == -1) {
            System.out.println("Sorry that stock is not trading");
        } else {
            System.out.println(stocks[position].getSymbol() + ", " + stocks[position].getDescription() + " trading at: \u00A3" + df.format(stocks[position].getPrice()));
        }
    }

    public static int searchAccounts(String accountName) {
        int index = -1;
        for (int i = 0; i < accounts.size(); i++) {
            Account ac = accounts.get(i);
            if (accountName.equals(ac.getName())) {
                index = i;
            }
        }
        return index;
    }


    public void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }
}
