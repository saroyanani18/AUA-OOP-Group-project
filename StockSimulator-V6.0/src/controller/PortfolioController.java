package controller;

import app.Main;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Stock;
import view.Portfolio;

public class PortfolioController{
    
    private Portfolio portfolio;
    
    /**
     * Constructor.
     * 
     * @param portfolio = portfolio view
     */
    public PortfolioController(Portfolio portfolio){
        this.portfolio = portfolio;
        
        loadPortfolio();
        loadShortingStock();
        
        portfolio.lbAccValue.setText("Account value: £"+String.format("%.2f", Main.actualAccount.getAccountValue()));
        portfolio.lbCash.setText("Cash: £"+String.format("%.2f", Main.actualAccount.getAccountCash()));
    }
    
    /**
     * Load all the stock of a user in a JTable
     */
    private void loadPortfolio(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Stock symbol");
        model.addColumn("Description");
        model.addColumn("Price");
        model.addColumn("Quantity");
        model.addColumn("Total");
                
        List<Stock> userStocks = Main.actualAccount.getStock();
        
        if(!userStocks.isEmpty())
        {
            userStocks.forEach(stock -> {
                Object[] row = new Object[5];
                row[0] = stock.getSymbol();
                row[1] = stock.getDescription();
                row[2] = stock.getCurrentPrice();
                row[3] = stock.getQuantity();
                row[4] = stock.getCurrentPrice() * stock.getQuantity();

                model.addRow(row);
            });
        }
        
        portfolio.tbPortfolio.setModel(model);
    }
    
    /**
     * Load all the shorting stock of a user in a JTable
     */
    private void loadShortingStock(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Stock symbol");
        model.addColumn("Description");
        model.addColumn("Price");
        model.addColumn("Quantity");
        model.addColumn("Total");
                
        List<Stock> userStocks = Main.actualAccount.getShortingStock();
        
        if(!userStocks.isEmpty())
        {
            userStocks.forEach(stock -> {
                Object[] row = new Object[5];
                row[0] = stock.getSymbol();
                row[1] = stock.getDescription();
                row[2] = stock.getCurrentPrice();
                row[3] = stock.getQuantity();
                row[4] = stock.getCurrentPrice() * stock.getQuantity();

                model.addRow(row);
            });
        }
        
        portfolio.tbPortfolioShorting.setModel(model);
    }
}
