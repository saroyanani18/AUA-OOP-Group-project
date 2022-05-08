package view;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class EnterAccount extends javax.swing.JDialog {

    public EnterAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        /* Some elements config */
        optionsGroup.add(rbYes);
        optionsGroup.add(rbNo);
        
        UIManager.put("TitledBorder.border", new LineBorder(new Color(255, 255, 255), 1));
        
        /* JDialog config */
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        optionsGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();
        optionPanel = new javax.swing.JPanel();
        lbHaveAccount = new javax.swing.JLabel();
        rbYes = new javax.swing.JRadioButton();
        rbNo = new javax.swing.JRadioButton();
        inputsPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lbAccountName = new javax.swing.JLabel();
        tfAccountName = new javax.swing.JTextField();
        lbStartingMoney = new javax.swing.JLabel();
        lbE = new javax.swing.JLabel();
        tfStartingMoney = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 370));
        setPreferredSize(new java.awt.Dimension(500, 370));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 202, 58));
        mainPanel.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(106, 76, 147));
        header.setPreferredSize(new java.awt.Dimension(500, 50));
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        lbTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(237, 246, 249));
        lbTitle.setText("Enter your account");
        header.add(lbTitle);

        mainPanel.add(header, java.awt.BorderLayout.PAGE_START);

        body.setOpaque(false);
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.PAGE_AXIS));

        bodyPanel.setOpaque(false);
        bodyPanel.setLayout(new java.awt.GridBagLayout());

        optionPanel.setBackground(new java.awt.Color(255, 255, 255));
        optionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select an option", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(255, 89, 94))); // NOI18N
        optionPanel.setOpaque(false);
        optionPanel.setPreferredSize(new java.awt.Dimension(450, 100));
        optionPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 25));

        lbHaveAccount.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbHaveAccount.setForeground(new java.awt.Color(0, 0, 0));
        lbHaveAccount.setText("Do you have an account?");
        optionPanel.add(lbHaveAccount);

        rbYes.setBackground(new java.awt.Color(255, 202, 58));
        rbYes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rbYes.setForeground(new java.awt.Color(0, 0, 0));
        rbYes.setSelected(true);
        rbYes.setText("Yes");
        optionPanel.add(rbYes);

        rbNo.setBackground(new java.awt.Color(255, 202, 58));
        rbNo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rbNo.setForeground(new java.awt.Color(0, 0, 0));
        rbNo.setText("No");
        optionPanel.add(rbNo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 30);
        bodyPanel.add(optionPanel, gridBagConstraints);

        body.add(bodyPanel);

        inputsPanel.setOpaque(false);
        inputsPanel.setPreferredSize(new java.awt.Dimension(500, 150));
        inputsPanel.setLayout(new java.awt.GridBagLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 89, 94));
        jSeparator1.setForeground(new java.awt.Color(255, 89, 94));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 30);
        inputsPanel.add(jSeparator1, gridBagConstraints);

        lbAccountName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbAccountName.setForeground(new java.awt.Color(0, 0, 0));
        lbAccountName.setText("Enter your account name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 10);
        inputsPanel.add(lbAccountName, gridBagConstraints);

        tfAccountName.setPreferredSize(new java.awt.Dimension(64, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 10);
        inputsPanel.add(tfAccountName, gridBagConstraints);

        lbStartingMoney.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbStartingMoney.setForeground(new java.awt.Color(102, 102, 102));
        lbStartingMoney.setText("Enter starting money:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 30);
        inputsPanel.add(lbStartingMoney, gridBagConstraints);

        lbE.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbE.setForeground(new java.awt.Color(102, 102, 102));
        lbE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbE.setText("£");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputsPanel.add(lbE, gridBagConstraints);

        tfStartingMoney.setEnabled(false);
        tfStartingMoney.setPreferredSize(new java.awt.Dimension(64, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        inputsPanel.add(tfStartingMoney, gridBagConstraints);

        jSeparator2.setBackground(new java.awt.Color(255, 89, 94));
        jSeparator2.setForeground(new java.awt.Color(255, 89, 94));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 5, 30);
        inputsPanel.add(jSeparator2, gridBagConstraints);

        btnLogin.setBackground(new java.awt.Color(25, 130, 196));
        btnLogin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login to the system");
        btnLogin.setBorderPainted(false);
        btnLogin.setPreferredSize(new java.awt.Dimension(75, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 10, 10);
        inputsPanel.add(btnLogin, gridBagConstraints);

        btnExit.setBackground(new java.awt.Color(25, 130, 196));
        btnExit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Get out of the system");
        btnExit.setBorderPainted(false);
        btnExit.setPreferredSize(new java.awt.Dimension(75, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 30);
        inputsPanel.add(btnExit, gridBagConstraints);

        body.add(inputsPanel);

        mainPanel.add(body, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JPanel body;
    private javax.swing.JPanel bodyPanel;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnLogin;
    private javax.swing.JPanel header;
    private javax.swing.JPanel inputsPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbAccountName;
    public javax.swing.JLabel lbE;
    private javax.swing.JLabel lbHaveAccount;
    public javax.swing.JLabel lbStartingMoney;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel optionPanel;
    private javax.swing.ButtonGroup optionsGroup;
    public javax.swing.JRadioButton rbNo;
    public javax.swing.JRadioButton rbYes;
    public javax.swing.JTextField tfAccountName;
    public javax.swing.JTextField tfStartingMoney;
    // End of variables declaration//GEN-END:variables
}
