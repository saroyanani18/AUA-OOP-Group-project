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

    private EnterAccount enterAccount;
    
    private final Color DEACTIVATED = new Color(102,102,102);
    private final Color ACTIVATED = new Color(67,80,100);
    
    /**
     * Constructor.
     * 
     * @param enterAccount = EnterAccounts JDialog to control
     */
    public EnterAccountController(EnterAccount enterAccount){
        this.enterAccount = enterAccount;
        
        enterAccount.rbYes.addActionListener(this);
        enterAccount.rbNo.addActionListener(this);
        enterAccount.btnLogin.addActionListener(this);
        enterAccount.btnExit.addActionListener(this);
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
        if(e.getSource() == enterAccount.rbYes){
            enterAccount.lbStartingMoney.setForeground(DEACTIVATED);
            enterAccount.lbE.setForeground(DEACTIVATED);
            enterAccount.tfStartingMoney.setText("");
            enterAccount.tfStartingMoney.setEnabled(false);
        }
       
        /**
         * Controls the actions of the 'No' radio button
         */
        if(e.getSource() == enterAccount.rbNo){
            enterAccount.lbStartingMoney.setForeground(ACTIVATED);
            enterAccount.lbE.setForeground(ACTIVATED);
            enterAccount.tfStartingMoney.setEnabled(true);
        }
        
        /*
         * Control the actions of the login button
         */
        if(e.getSource() == enterAccount.btnLogin){
            if(enterAccount.rbYes.isSelected())
            {
                // Code to log-in with existing account
                Optional<Account> acc = Main.accounts.stream()
                                                     .filter(x -> x.getAccountName().equals(enterAccount.tfAccountName.getText()))
                                                     .findFirst();
                
                acc.ifPresentOrElse(value -> {
                                                Main.actualAccount = acc.get();
                                                JOptionPane.showMessageDialog(enterAccount, "Welcome again "+value.getAccountName()+"!", "Successful login", JOptionPane.INFORMATION_MESSAGE);
                                                enterAccount.dispose();
                                             },
                                       () -> JOptionPane.showMessageDialog(enterAccount, "The account was not found, check the data or create a new one", "Error", JOptionPane.ERROR_MESSAGE));
                
            }
            else
            {
                // Code to log-in with new account
                try{
                    String accountName = enterAccount.tfAccountName.getText();
                    double accountCash = Double.parseDouble(enterAccount.tfStartingMoney.getText());
                    
                    if(!accountName.equals(""))
                    {
                        Main.actualAccount = new Account(accountName, accountCash);
                        JOptionPane.showMessageDialog(enterAccount, "Account Created successfully", "Successful login", JOptionPane.INFORMATION_MESSAGE);
                        enterAccount.dispose();
                    }
                    else
                    {
                        throw new InvalidValueException("You must enter an account name");
                    }
                    
                }
                catch(NumberFormatException ne){
                    JOptionPane.showMessageDialog(enterAccount, "Some of the data entered is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(InvalidValueException in){
                    JOptionPane.showMessageDialog(enterAccount, in.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        /*
         * Control the actions of the exit button
         */
        if(e.getSource() == enterAccount.btnExit){
            int confirm = JOptionPane.showConfirmDialog(enterAccount, "Are you sure you want to exit the program?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(JOptionPane.YES_OPTION == confirm){
                System.exit(0);
            }
        }
        
    }
    
}
