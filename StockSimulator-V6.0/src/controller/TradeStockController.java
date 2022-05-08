package controller;

import app.Main;
import exception.InvalidValueException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Operations;
import model.Stock;
import model.Trade;
import view.TradeStock;

public class TradeStockController implements ActionListener,
                                             ItemListener{
    
    private TradeStock ts;
    private Object selectedStock;
    private String selectedOperation;

    /**
     * Constructor.
     * 
     * @param ts = TradeStock view
     */
    public TradeStockController(TradeStock ts) {
        this.ts = ts;
        
        ts.btnPerform.addActionListener(this);
        ts.btnBack.addActionListener(this);
        ts.cbStocks.addItemListener(this);
        
        DefaultComboBoxModel model = new DefaultComboBoxModel(Stock.getStocksToVector());
        ts.cbStocks.setModel(model);
        
        selectedStock = ts.cbStocks.getItemAt(0);
        selectedOperation = String.valueOf(ts.cbOperations.getSelectedItem());
    }

    private boolean doOperation(){
        
        try{
//            Extracting values
            int sharesToTrade = Integer.parseInt(ts.spinnerShares.getValue().toString());
            String operation = String.valueOf(ts.cbOperations.getSelectedItem());
            
//            Validating quantity to trade
            if( sharesToTrade < 1 )
            {
                throw new InvalidValueException("The amount entered is invalid");
            }
            
//            Identifiying operation
            if( operation.equalsIgnoreCase("buy") )
            {
                int result = Operations.buy(new Trade(Main.actualAccount, (Stock) selectedStock, sharesToTrade));
                return result > 0;
            }
            
            else if( operation.equalsIgnoreCase("sell") )
            {
                int result = Operations.sell(new Trade(Main.actualAccount, (Stock) selectedStock, sharesToTrade));
                return result > 0;
            }
            
            else if( operation.equalsIgnoreCase("sell short") )
            {
                int result = Operations.sellShort(new Trade(Main.actualAccount, (Stock) selectedStock, sharesToTrade));
                return result > 0;
            }
            
            else if( operation.equalsIgnoreCase("buy to cover") ){
                int result = Operations.buyToCover(new Trade(Main.actualAccount, (Stock) selectedStock, sharesToTrade));
                return result > 0;
            }
            
            else { return false; }
            
        } catch (NumberFormatException | InvalidValueException ex){
            JOptionPane.showMessageDialog(ts, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
    /**
     * Actions
     * 
     * @param e = event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*
         * Control the actions of the perform action button
         */
        if(e.getSource() == ts.btnPerform){
            if(doOperation())
            {
                JOptionPane.showMessageDialog(ts, "Operation completed successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                ts.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(ts, "An error has occurred completing the operation, check your money or the data entered", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        /*
         * Control the actions of the back button
         */
        if(e.getSource() == ts.btnBack){
            int confirm = JOptionPane.showConfirmDialog(ts, "Are you sure you want to cancel the operation?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(JOptionPane.YES_OPTION == confirm){
                ts.dispose();
            }
        }
        
    }

    /**
     * State actions.
     * 
     * @param e = event
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
            selectedStock = (Stock) ts.cbStocks.getSelectedItem();
        }
    }
    
}
