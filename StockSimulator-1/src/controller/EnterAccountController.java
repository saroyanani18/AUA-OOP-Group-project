package controller;

import app.Main;
import exception.InvalidValueException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import javax.swing.JOptionPane;
import model.Account;
import view.EnterAccount;

/**
 * This class is in charge of controlling the actions of
 * the JDialog 'EnterAccounts'
 */
public class EnterAccountController implements ActionListener{

    private EnterAccount ea;
    
    /**
     * Constructor.
     * 
     * @param ea = EnterAccounts JDialog to control
     */
    public EnterAccountController(EnterAccount ea){
        this.ea = ea;
        
        ea.rbYes.addActionListener(this);
        ea.rbNo.addActionListener(this);
        ea.btnLogin.addActionListener(this);
        ea.btnExit.addActionListener(this);
    }
    
    /**
     * Actions.
     * 
     * @param e = event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*
         * Controls the actions of the 'Yes' radio button
         */
        if(e.getSource() == ea.rbYes){
            ea.lbStartingMoney.setForeground(Main.LIGHT_GRAY);
            ea.lbE.setForeground(Main.LIGHT_GRAY);
            ea.tfStartingMoney.setText("");
            ea.tfStartingMoney.setEnabled(false);
        }
       
        /**
         * Controls the actions of the 'No' radio button
         */
        if(e.getSource() == ea.rbNo){
            ea.lbStartingMoney.setForeground(Color.BLACK);
            ea.lbE.setForeground(Main.RED);
            ea.tfStartingMoney.setEnabled(true);
        }
        
        /*
         * Control the actions of the login button
         */
        if(e.getSource() == ea.btnLogin){
            if(ea.rbYes.isSelected())
            {
                // Code to log-in with existing account
                Optional<Account> acc = Main.accounts.stream()
                                                     .filter(x -> x.getAccountName().equals(ea.tfAccountName.getText()))
                                                     .findFirst();
                
                acc.ifPresentOrElse(value -> {
                                                Main.actualAccount = acc.get();
                                                JOptionPane.showMessageDialog(ea, "Welcome again "+value.getAccountName()+"!", "Successful login", JOptionPane.INFORMATION_MESSAGE);
                                                ea.dispose();
                                             },
                                       () -> JOptionPane.showMessageDialog(ea, "The account was not found, check the data or create a new one", "Error", JOptionPane.ERROR_MESSAGE));
                
            }
            else
            {
                // Code to log-in with new account
                try{
                    String accountName = ea.tfAccountName.getText();
                    double accountCash = Double.parseDouble(ea.tfStartingMoney.getText());
                    
                    if(!accountName.equals(""))
                    {
                        Main.actualAccount = new Account(accountName, accountCash);
                        JOptionPane.showMessageDialog(ea, "Account Created successfully", "Successful login", JOptionPane.INFORMATION_MESSAGE);
                        ea.dispose();
                    }
                    else
                    {
                        throw new InvalidValueException("You must enter an account name");
                    }
                    
                }
                catch(NumberFormatException ne){
                    JOptionPane.showMessageDialog(ea, "Some of the data entered is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(InvalidValueException in){
                    JOptionPane.showMessageDialog(ea, in.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        /*
         * Control the actions of the exit button
         */
        if(e.getSource() == ea.btnExit){
            int confirm = JOptionPane.showConfirmDialog(ea, "Are you sure you want to exit the program?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(JOptionPane.YES_OPTION == confirm){
                System.exit(0);
            }
        }
        
    }
    
}
