package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Portfolio;
import view.Principal;
import view.SearchStock;
import view.TradeStock;

/**
 * This class is in charge of controlling the actions of
 * the JFrame 'Principal'
 */
public class PrincipalController implements ActionListener{

    private final Principal p;
    
    /**
     * Constructor.
     * 
     * @param p = Principal view
     */
    public PrincipalController(Principal p){
        this.p = p;
        
        p.btnPortfolio.addActionListener(this);
        p.btnSearchStock.addActionListener(this);
        p.btnTradeStock.addActionListener(this);
        p.btnExit.addActionListener(this);
    }
    
    /**
     * Actions.
     * 
     * @param e = event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*
         * Open the user portfolio
         */
        if(e.getSource() == p.btnPortfolio){
            Portfolio pf = new Portfolio(p, true);
            PortfolioController pfc = new PortfolioController(pf);
            pf.setVisible(true);
        }
        
        /*
         * Open the existing stocks menu
         */
        if(e.getSource() == p.btnSearchStock){
            SearchStock ss = new SearchStock(p, true);
            SearchStockController ssc = new SearchStockController(ss);
            ss.setVisible(true);
        }
        
        /*
         * Control the actions of the 'Trade Stock' button
         */
        if(e.getSource() == p.btnTradeStock){
            TradeStock ts = new TradeStock(p, true);
            TradeStockController tsc = new TradeStockController(ts);
            ts.setVisible(true);
        }
        
        /*
         * Control the actions of the exit button
         */
        if(e.getSource() == p.btnExit){
            int confirm = JOptionPane.showConfirmDialog(p, "Are you sure you want to exit the program?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(JOptionPane.YES_OPTION == confirm){
                System.exit(0);
            }
        }
    }
    
}
