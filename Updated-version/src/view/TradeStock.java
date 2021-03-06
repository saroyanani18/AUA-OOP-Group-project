
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class TradeStock extends JDialog {
    private JPanel body;
    public JButton btnBack;
    public JButton btnPerform;
    public JComboBox<String> cbOperations;
    public JComboBox<String> cbStocks;
    private JLabel lbOperation;
    private JLabel lbShares;
    private JLabel lbStock;
    private JLabel lbTitle;
    private JPanel mainPanel;
    private JPanel pBody;
    private JPanel pBorder;
    private JPanel pTitle;
    public JSpinner spinnerShares;
    private JPanel title;

    public TradeStock(Frame parent, boolean modal) {
        super(parent, modal);
        this.initComponents();
        this.setTitle("Trade stock");
        this.setLocationRelativeTo((Component)null);
    }

    private void initComponents() {
        this.mainPanel = new JPanel();
        this.title = new JPanel();
        this.body = new JPanel();
        this.pTitle = new JPanel();
        this.lbTitle = new JLabel();
        this.pBody = new JPanel();
        this.pBorder = new JPanel();
        this.lbStock = new JLabel();
        this.cbStocks = new JComboBox();
        this.lbShares = new JLabel();
        this.spinnerShares = new JSpinner();
        this.lbOperation = new JLabel();
        this.cbOperations = new JComboBox();
        this.btnBack = new JButton();
        this.btnPerform = new JButton();
        this.setDefaultCloseOperation(2);
        this.setMinimumSize(new Dimension(600, 450));
        this.setResizable(false);
        this.mainPanel.setBackground(new Color(217, 219, 226));
        this.mainPanel.setLayout(new BorderLayout());
        this.title.setBackground(new Color(35, 44, 64));
        this.title.setPreferredSize(new Dimension(80, 300));
        GroupLayout titleLayout = new GroupLayout(this.title);
        this.title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(titleLayout.createParallelGroup(Alignment.LEADING).addGap(0, 80, 32767));
        titleLayout.setVerticalGroup(titleLayout.createParallelGroup(Alignment.LEADING).addGap(0, 450, 32767));
        this.mainPanel.add(this.title, "Before");
        this.body.setOpaque(false);
        this.body.setPreferredSize(new Dimension(420, 300));
        this.body.setLayout(new BoxLayout(this.body, 3));
        this.pTitle.setOpaque(false);
        this.pTitle.setPreferredSize(new Dimension(420, 70));
        this.pTitle.setLayout(new FlowLayout(0, 15, 15));
        this.lbTitle.setFont(new Font("Roboto", 3, 36));
        this.lbTitle.setForeground(new Color(35, 44, 64));
        this.lbTitle.setText("Trade stock");
        this.pTitle.add(this.lbTitle);
        this.body.add(this.pTitle);
        this.pBody.setOpaque(false);
        this.pBody.setPreferredSize(new Dimension(420, 503));
        this.pBody.setLayout(new GridBagLayout());
        this.pBorder.setBorder(BorderFactory.createTitledBorder((Border)null, "Trade Settings", 0, 0, new Font("Roboto", 2, 14), new Color(67, 80, 100)));
        this.pBorder.setForeground(new Color(67, 80, 100));
        this.pBorder.setOpaque(false);
        this.pBorder.setLayout(new GridBagLayout());
        this.lbStock.setFont(new Font("Roboto", 0, 14));
        this.lbStock.setForeground(new Color(0, 0, 0));
        this.lbStock.setText("Enter stock symbol you would like to trade:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0D;
        gridBagConstraints.weighty = 1.0D;
        gridBagConstraints.insets = new Insets(20, 20, 5, 20);
        this.pBorder.add(this.lbStock, gridBagConstraints);
        this.cbStocks.setFont(new Font("Roboto", 0, 12));
        this.cbStocks.setModel(new DefaultComboBoxModel(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        this.cbStocks.setPreferredSize(new Dimension(72, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(0, 20, 10, 20);
        this.pBorder.add(this.cbStocks, gridBagConstraints);
        this.lbShares.setFont(new Font("Roboto", 0, 14));
        this.lbShares.setForeground(new Color(0, 0, 0));
        this.lbShares.setText("How many shares would you like to trade:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(10, 20, 5, 20);
        this.pBorder.add(this.lbShares, gridBagConstraints);
        this.spinnerShares.setPreferredSize(new Dimension(64, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(0, 20, 10, 20);
        this.pBorder.add(this.spinnerShares, gridBagConstraints);
        this.lbOperation.setFont(new Font("Roboto", 0, 14));
        this.lbOperation.setForeground(new Color(0, 0, 0));
        this.lbOperation.setText("Select an operation you want to perform:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(10, 20, 5, 20);
        this.pBorder.add(this.lbOperation, gridBagConstraints);
        this.cbOperations.setFont(new Font("Roboto", 0, 12));
        this.cbOperations.setModel(new DefaultComboBoxModel(new String[]{"Buy", "Sell", "Sell short", "Buy to cover"}));
        this.cbOperations.setPreferredSize(new Dimension(72, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(0, 20, 30, 20);
        this.pBorder.add(this.cbOperations, gridBagConstraints);
        this.btnBack.setBackground(new Color(66, 78, 100));
        this.btnBack.setFont(new Font("Roboto", 1, 18));
        this.btnBack.setForeground(new Color(255, 255, 255));
        this.btnBack.setText("Cancel operation");
        this.btnBack.setBorder(new LineBorder(new Color(67, 79, 100), 1, true));
        this.btnBack.setCursor(new Cursor(12));
        this.btnBack.setMargin(new Insets(0, 0, 0, 0));
        this.btnBack.setOpaque(true);
        this.btnBack.setPreferredSize(new Dimension(75, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(20, 5, 20, 20);
        this.pBorder.add(this.btnBack, gridBagConstraints);
        this.btnPerform.setBackground(new Color(66, 78, 100));
        this.btnPerform.setFont(new Font("Roboto", 1, 18));
        this.btnPerform.setForeground(new Color(255, 255, 255));
        this.btnPerform.setText("Perform operation");
        this.btnPerform.setBorder(new LineBorder(new Color(67, 79, 100), 1, true));
        this.btnPerform.setCursor(new Cursor(12));
        this.btnPerform.setMargin(new Insets(0, 0, 0, 0));
        this.btnPerform.setOpaque(true);
        this.btnPerform.setPreferredSize(new Dimension(75, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(20, 20, 20, 5);
        this.pBorder.add(this.btnPerform, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.weighty = 0.5D;
        gridBagConstraints.insets = new Insets(0, 15, 15, 15);
        this.pBody.add(this.pBorder, gridBagConstraints);
        this.body.add(this.pBody);
        this.mainPanel.add(this.body, "Center");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.mainPanel, -1, 1200, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.mainPanel, -1, 450, 32767));
        this.pack();
    }
}
