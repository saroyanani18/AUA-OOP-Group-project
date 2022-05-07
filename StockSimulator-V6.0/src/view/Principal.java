package view;

import javax.swing.*;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        decorative1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        btnPortfolio = new javax.swing.JButton();
        btnSearchStock = new javax.swing.JButton();
        btnTradeStock = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        decorative2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock Simulator");
        setMinimumSize(new java.awt.Dimension(800, 600));

        mainPanel.setBackground(new java.awt.Color(217, 219, 225));
        mainPanel.setLayout(new java.awt.BorderLayout());

        decorative1.setBackground(new java.awt.Color(35, 45, 63));
        decorative1.setPreferredSize(new java.awt.Dimension(700, 50));

        javax.swing.GroupLayout decorative1Layout = new javax.swing.GroupLayout(decorative1);
        decorative1.setLayout(decorative1Layout);
        decorative1Layout.setHorizontalGroup(
            decorative1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        decorative1Layout.setVerticalGroup(
            decorative1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        mainPanel.add(decorative1, java.awt.BorderLayout.PAGE_START);

        panel.setOpaque(false);
        panel.setLayout(new java.awt.GridBagLayout());

        btnPortfolio.setBackground(new java.awt.Color(66, 78, 100));
        btnPortfolio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnPortfolio.setForeground(new java.awt.Color(255, 255, 255));
        btnPortfolio.setText("Portfolio");
        btnPortfolio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 79, 100), 1, true));
        btnPortfolio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPortfolio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPortfolio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPortfolio.setOpaque(true);
        btnPortfolio.setPreferredSize(new java.awt.Dimension(150, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(btnPortfolio, gridBagConstraints);

        btnSearchStock.setBackground(new java.awt.Color(66, 78, 100));
        btnSearchStock.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSearchStock.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchStock.setText("Search stock");
        btnSearchStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 79, 100), 1, true));
        btnSearchStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchStock.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSearchStock.setOpaque(true);
        btnSearchStock.setPreferredSize(new java.awt.Dimension(150, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(btnSearchStock, gridBagConstraints);

        btnTradeStock.setBackground(new java.awt.Color(66, 78, 100));
        btnTradeStock.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnTradeStock.setForeground(new java.awt.Color(255, 255, 255));
        btnTradeStock.setText("Trade stock");
        btnTradeStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 79, 100), 1, true));
        btnTradeStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTradeStock.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTradeStock.setOpaque(true);
        btnTradeStock.setPreferredSize(new java.awt.Dimension(150, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(btnTradeStock, gridBagConstraints);

        btnExit.setBackground(new java.awt.Color(66, 78, 100));
        btnExit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Sign out");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 79, 100), 1, true));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnExit.setOpaque(true);
        btnExit.setPreferredSize(new java.awt.Dimension(150, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(btnExit, gridBagConstraints);

        mainPanel.add(panel, java.awt.BorderLayout.CENTER);

        decorative2.setBackground(new java.awt.Color(35, 45, 63));
        decorative2.setPreferredSize(new java.awt.Dimension(700, 50));

        javax.swing.GroupLayout decorative2Layout = new javax.swing.GroupLayout(decorative2);
        decorative2.setLayout(decorative2Layout);
        decorative2Layout.setHorizontalGroup(
            decorative2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        decorative2Layout.setVerticalGroup(
            decorative2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        mainPanel.add(decorative2, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnPortfolio;
    public javax.swing.JButton btnSearchStock;
    public javax.swing.JButton btnTradeStock;
    private javax.swing.JPanel decorative1;
    private javax.swing.JPanel decorative2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel groupName;
    // End of variables declaration//GEN-END:variables
}
