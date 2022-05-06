package view;

public class TradeStock extends javax.swing.JDialog {

    public TradeStock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setTitle("Trade stock");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        pBody = new javax.swing.JPanel();
        pBorder = new javax.swing.JPanel();
        lbStock = new javax.swing.JLabel();
        cbStocks = new javax.swing.JComboBox<>();
        lbShares = new javax.swing.JLabel();
        spinnerShares = new javax.swing.JSpinner();
        lbOperation = new javax.swing.JLabel();
        cbOperations = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnPerform = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 202, 58));
        mainPanel.setLayout(new java.awt.BorderLayout());

        title.setBackground(new java.awt.Color(106, 76, 147));
        title.setPreferredSize(new java.awt.Dimension(80, 300));

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        mainPanel.add(title, java.awt.BorderLayout.LINE_START);

        body.setOpaque(false);
        body.setPreferredSize(new java.awt.Dimension(420, 300));
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.PAGE_AXIS));

        pTitle.setOpaque(false);
        pTitle.setPreferredSize(new java.awt.Dimension(420, 70));
        pTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 15));

        lbTitle.setFont(new java.awt.Font("Roboto", 3, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 89, 94));
        lbTitle.setText("Trade stock");
        pTitle.add(lbTitle);

        body.add(pTitle);

        pBody.setOpaque(false);
        pBody.setPreferredSize(new java.awt.Dimension(420, 503));
        pBody.setLayout(new java.awt.GridBagLayout());

        pBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trade Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 2, 14), new java.awt.Color(255, 89, 94))); // NOI18N
        pBorder.setForeground(new java.awt.Color(255, 89, 94));
        pBorder.setOpaque(false);
        pBorder.setLayout(new java.awt.GridBagLayout());

        lbStock.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbStock.setForeground(new java.awt.Color(0, 0, 0));
        lbStock.setText("Enter stock symbol you would like to trade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 20);
        pBorder.add(lbStock, gridBagConstraints);

        cbStocks.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbStocks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbStocks.setPreferredSize(new java.awt.Dimension(72, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 20);
        pBorder.add(cbStocks, gridBagConstraints);

        lbShares.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbShares.setForeground(new java.awt.Color(0, 0, 0));
        lbShares.setText("How many shares would you like to trade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 5, 20);
        pBorder.add(lbShares, gridBagConstraints);

        spinnerShares.setPreferredSize(new java.awt.Dimension(64, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 20);
        pBorder.add(spinnerShares, gridBagConstraints);

        lbOperation.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbOperation.setForeground(new java.awt.Color(0, 0, 0));
        lbOperation.setText("Select an operation you want to perform:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 5, 20);
        pBorder.add(lbOperation, gridBagConstraints);

        cbOperations.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbOperations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buy", "Sell", "Sell short", "Buy to cover" }));
        cbOperations.setPreferredSize(new java.awt.Dimension(72, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 30, 20);
        pBorder.add(cbOperations, gridBagConstraints);

        btnBack.setBackground(new java.awt.Color(25, 130, 196));
        btnBack.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setPreferredSize(new java.awt.Dimension(75, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 20, 20);
        pBorder.add(btnBack, gridBagConstraints);

        btnPerform.setBackground(new java.awt.Color(25, 130, 196));
        btnPerform.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnPerform.setForeground(new java.awt.Color(255, 255, 255));
        btnPerform.setText("Perform operation");
        btnPerform.setPreferredSize(new java.awt.Dimension(75, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 5);
        pBorder.add(btnPerform, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 15, 15);
        pBody.add(pBorder, gridBagConstraints);

        body.add(pBody);

        mainPanel.add(body, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    public javax.swing.JButton btnBack;
    public javax.swing.JButton btnPerform;
    public javax.swing.JComboBox<String> cbOperations;
    public javax.swing.JComboBox<String> cbStocks;
    private javax.swing.JLabel lbOperation;
    private javax.swing.JLabel lbShares;
    private javax.swing.JLabel lbStock;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pBorder;
    private javax.swing.JPanel pTitle;
    public javax.swing.JSpinner spinnerShares;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
