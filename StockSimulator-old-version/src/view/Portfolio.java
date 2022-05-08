package view;

public class Portfolio extends javax.swing.JDialog {

    public Portfolio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPortfolioShorting = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPortfolio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pFooter = new javax.swing.JPanel();
        lbAccValue = new javax.swing.JLabel();
        lbCash = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Portfolio");
        setMinimumSize(new java.awt.Dimension(712, 700));

        mainPanel.setBackground(new java.awt.Color(255, 202, 58));
        mainPanel.setLayout(new java.awt.BorderLayout());

        title.setBackground(new java.awt.Color(106, 76, 147));
        title.setPreferredSize(new java.awt.Dimension(80, 0));

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        mainPanel.add(title, java.awt.BorderLayout.LINE_START);

        body.setBackground(new java.awt.Color(0, 0, 0));
        body.setForeground(new java.awt.Color(0, 0, 0));
        body.setOpaque(false);
        body.setPreferredSize(new java.awt.Dimension(80, 380));
        body.setLayout(new java.awt.BorderLayout());

        pTitle.setOpaque(false);
        pTitle.setPreferredSize(new java.awt.Dimension(632, 70));
        pTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 15));

        lbTitle.setFont(new java.awt.Font("Roboto", 3, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 89, 94));
        lbTitle.setText("YOUR PORTFOLIO");
        pTitle.add(lbTitle);

        body.add(pTitle, java.awt.BorderLayout.PAGE_START);

        pBody.setOpaque(false);
        pBody.setPreferredSize(new java.awt.Dimension(632, 400));
        pBody.setLayout(new java.awt.GridBagLayout());

        tbPortfolioShorting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Stock symbol", "Description", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPortfolioShorting.setGridColor(new java.awt.Color(51, 51, 51));
        tbPortfolioShorting.setSelectionBackground(new java.awt.Color(138, 201, 38));
        tbPortfolioShorting.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tbPortfolioShorting);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 20);
        pBody.add(jScrollPane3, gridBagConstraints);

        tbPortfolio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Stock symbol", "Description", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPortfolio.setGridColor(new java.awt.Color(51, 51, 51));
        tbPortfolio.setSelectionBackground(new java.awt.Color(138, 201, 38));
        tbPortfolio.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbPortfolio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 20);
        pBody.add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 89, 94));
        jLabel1.setText("Shorting stocks");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 5, 20);
        pBody.add(jLabel1, gridBagConstraints);

        body.add(pBody, java.awt.BorderLayout.CENTER);

        pFooter.setBackground(new java.awt.Color(106, 76, 147));
        pFooter.setPreferredSize(new java.awt.Dimension(632, 60));
        pFooter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 20));

        lbAccValue.setBackground(new java.awt.Color(255, 255, 255));
        lbAccValue.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbAccValue.setForeground(new java.awt.Color(255, 255, 255));
        lbAccValue.setText("Account value: £");
        pFooter.add(lbAccValue);

        lbCash.setBackground(new java.awt.Color(255, 255, 255));
        lbCash.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbCash.setForeground(new java.awt.Color(255, 255, 255));
        lbCash.setText("Cash: £");
        pFooter.add(lbCash);

        body.add(pFooter, java.awt.BorderLayout.PAGE_END);

        mainPanel.add(body, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel lbAccValue;
    public javax.swing.JLabel lbCash;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pFooter;
    private javax.swing.JPanel pTitle;
    public javax.swing.JTable tbPortfolio;
    public javax.swing.JTable tbPortfolioShorting;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
