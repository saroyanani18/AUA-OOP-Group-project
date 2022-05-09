package view;

public class SearchStock extends javax.swing.JDialog {

    public SearchStock(java.awt.Frame parent, boolean modal) {
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
        pSearch = new javax.swing.JPanel();
        lbSearch = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        separator = new javax.swing.JLabel();
        pTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStocks = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search stock");

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
            .addGap(0, 512, Short.MAX_VALUE)
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
        lbTitle.setText("Search stock");
        pTitle.add(lbTitle);

        body.add(pTitle, java.awt.BorderLayout.PAGE_START);

        pBody.setOpaque(false);
        pBody.setPreferredSize(new java.awt.Dimension(632, 400));
        pBody.setLayout(new javax.swing.BoxLayout(pBody, javax.swing.BoxLayout.PAGE_AXIS));

        pSearch.setOpaque(false);
        pSearch.setPreferredSize(new java.awt.Dimension(0, 40));
        pSearch.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));

        lbSearch.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbSearch.setForeground(new java.awt.Color(0, 0, 0));
        lbSearch.setText("Search:");
        pSearch.add(lbSearch);

        tfSearch.setMinimumSize(new java.awt.Dimension(100, 20));
        tfSearch.setPreferredSize(new java.awt.Dimension(200, 25));
        pSearch.add(tfSearch);
        pSearch.add(separator);

        pBody.add(pSearch);

        pTable.setOpaque(false);
        pTable.setLayout(new java.awt.GridBagLayout());

        tbStocks.setModel(new javax.swing.table.DefaultTableModel(
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
        tbStocks.setGridColor(new java.awt.Color(51, 51, 51));
        tbStocks.setSelectionBackground(new java.awt.Color(138, 201, 38));
        tbStocks.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbStocks);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 20);
        pTable.add(jScrollPane1, gridBagConstraints);

        pBody.add(pTable);

        body.add(pBody, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pSearch;
    private javax.swing.JPanel pTable;
    private javax.swing.JPanel pTitle;
    private javax.swing.JLabel separator;
    public javax.swing.JTable tbStocks;
    public javax.swing.JTextField tfSearch;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
