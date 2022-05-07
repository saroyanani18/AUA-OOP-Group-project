package controller;

import app.Main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import model.Stock;
import view.SearchStock;

public class SearchStockController implements KeyListener{
    
    private SearchStock ss;
    private DefaultTableModel model;
    
    /**
     * Constructor.
     * 
     * @param ss = search stock view
     */
    public SearchStockController(SearchStock ss){
        this.ss = ss;
        
        ss.tfSearch.addKeyListener(this);
        
        model = new DefaultTableModel();
        model.addColumn("Stock symbol");
        model.addColumn("Description");
        model.addColumn("Price");
        model.addColumn("Total");
        
        loadStocks(Main.stocks);
        
        ss.tbStocks.setModel(model);
    }

    /**
     * Load all existing stock to a JTable
     * 
     * @param existingStocks = List of stocks to load
     */
    private void loadStocks(List<Stock> existingStocks){
        existingStocks.forEach(item -> {
            Object[] row = new Object[4];
            row[0] = item.getSymbol();
            row[1] = item.getDescription();
            row[2] = item.getCurrentPrice();
            row[3] = item.getSharesLeft();

            model.addRow(row);
        });
    }
    
    /**
     * Key actions.
     * 
     * @param e = event
     */
    @Override
    public void keyTyped(KeyEvent e) {
        List<Stock> searchs = Main.stocks.stream()
                                         .filter(x -> x.getSymbol().contains(ss.tfSearch.getText().toUpperCase()))
                                         .collect(Collectors.toList());
        
        DefaultTableModel model = (DefaultTableModel) ss.tbStocks.getModel();
        int rowCount = ss.tbStocks.getRowCount();
        for (int i=0 ; rowCount>i ; i++)
        {
            model.removeRow(0);
        }

        loadStocks(searchs);
    }

    /**
     * Key actions.
     * 
     * @param e = event
     */
    @Override
    public void keyPressed(KeyEvent e) {}

    /**
     * Key actions.
     * 
     * @param e = event
     */
    @Override
    public void keyReleased(KeyEvent e) {}
    
}
