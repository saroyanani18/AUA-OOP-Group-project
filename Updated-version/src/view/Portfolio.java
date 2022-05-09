
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

public class Portfolio extends JDialog {
    private JPanel body;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane3;
    public JLabel lbAccValue;
    public JLabel lbCash;
    private JLabel lbTitle;
    private JPanel mainPanel;
    private JPanel pBody;
    private JPanel pFooter;
    private JPanel pTitle;
    public JTable tbPortfolio;
    public JTable tbPortfolioShorting;
    private JPanel title;

    public Portfolio(Frame parent, boolean modal) {
        super(parent, modal);
        this.initComponents();
        this.setLocationRelativeTo((Component)null);
    }

    private void initComponents() {
        this.mainPanel = new JPanel();
        this.title = new JPanel();
        this.body = new JPanel();
        this.pTitle = new JPanel();
        this.lbTitle = new JLabel();
        this.pBody = new JPanel();
        this.jScrollPane3 = new JScrollPane();
        this.tbPortfolioShorting = new JTable();
        this.jScrollPane1 = new JScrollPane();
        this.tbPortfolio = new JTable();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.pFooter = new JPanel();
        this.lbAccValue = new JLabel();
        this.lbCash = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Portfolio");
        this.setMinimumSize(new Dimension(712, 700));
        this.mainPanel.setBackground(new Color(217, 219, 226));
        this.mainPanel.setLayout(new BorderLayout());
        this.title.setBackground(new Color(36, 45, 63));
        this.title.setPreferredSize(new Dimension(80, 0));
        GroupLayout titleLayout = new GroupLayout(this.title);
        this.title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(titleLayout.createParallelGroup(Alignment.LEADING).addGap(0, 80, 32767));
        titleLayout.setVerticalGroup(titleLayout.createParallelGroup(Alignment.LEADING).addGap(0, 700, 32767));
        this.mainPanel.add(this.title, "Before");
        this.body.setBackground(new Color(0, 0, 0));
        this.body.setForeground(new Color(0, 0, 0));
        this.body.setOpaque(false);
        this.body.setPreferredSize(new Dimension(80, 380));
        this.body.setLayout(new BorderLayout());
        this.pTitle.setOpaque(false);
        this.pTitle.setPreferredSize(new Dimension(632, 70));
        this.pTitle.setLayout(new FlowLayout(0, 15, 15));
        this.lbTitle.setFont(new Font("Roboto", 3, 36));
        this.lbTitle.setForeground(new Color(67, 79, 101));
        this.lbTitle.setText("YOUR PORTFOLIO");
        this.pTitle.add(this.lbTitle);
        this.body.add(this.pTitle, "First");
        this.pBody.setOpaque(false);
        this.pBody.setPreferredSize(new Dimension(632, 400));
        this.pBody.setLayout(new GridBagLayout());
        this.tbPortfolioShorting.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}}, new String[]{"Stock symbol", "Description", "Price", "Quantity", "Total"}) {
            boolean[] canEdit = new boolean[]{false, false, false, true, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.tbPortfolioShorting.setGridColor(new Color(51, 51, 51));
        this.tbPortfolioShorting.setSelectionBackground(new Color(145, 161, 187));
        this.tbPortfolioShorting.setSelectionForeground(new Color(35, 44, 63));
        this.jScrollPane3.setViewportView(this.tbPortfolioShorting);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.weighty = 0.5D;
        gridBagConstraints.insets = new Insets(0, 20, 20, 20);
        this.pBody.add(this.jScrollPane3, gridBagConstraints);
        this.tbPortfolio.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}}, new String[]{"Stock symbol", "Description", "Price", "Quantity", "Total"}) {
            boolean[] canEdit = new boolean[]{false, false, false, true, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.tbPortfolio.setGridColor(new Color(51, 51, 51));
        this.tbPortfolio.setSelectionBackground(new Color(145, 161, 187));
        this.tbPortfolio.setSelectionForeground(new Color(35, 44, 63));
        this.jScrollPane1.setViewportView(this.tbPortfolio);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.weighty = 0.5D;
        gridBagConstraints.insets = new Insets(0, 20, 20, 20);
        this.pBody.add(this.jScrollPane1, gridBagConstraints);
        this.jLabel1.setFont(new Font("Roboto", 3, 18));
        this.jLabel1.setForeground(new Color(73, 76, 83));
        this.jLabel1.setText("Stocks");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(0, 20, 5, 20);
        this.pBody.add(this.jLabel1, gridBagConstraints);
        this.jLabel2.setFont(new Font("Roboto", 3, 18));
        this.jLabel2.setForeground(new Color(73, 76, 83));
        this.jLabel2.setText("Shorting stocks");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.weightx = 0.5D;
        gridBagConstraints.insets = new Insets(0, 20, 5, 20);
        this.pBody.add(this.jLabel2, gridBagConstraints);
        this.body.add(this.pBody, "Center");
        this.pFooter.setBackground(new Color(36, 45, 63));
        this.pFooter.setPreferredSize(new Dimension(632, 60));
        this.pFooter.setLayout(new FlowLayout(1, 100, 20));
        this.lbAccValue.setBackground(new Color(255, 255, 255));
        this.lbAccValue.setFont(new Font("Roboto", 1, 18));
        this.lbAccValue.setForeground(new Color(255, 255, 255));
        this.lbAccValue.setText("Account value: £");
        this.pFooter.add(this.lbAccValue);
        this.lbCash.setBackground(new Color(255, 255, 255));
        this.lbCash.setFont(new Font("Roboto", 1, 18));
        this.lbCash.setForeground(new Color(255, 255, 255));
        this.lbCash.setText("Cash: £");
        this.pFooter.add(this.lbCash);
        this.body.add(this.pFooter, "Last");
        this.mainPanel.add(this.body, "Center");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.mainPanel, -1, 712, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.mainPanel, -1, -1, 32767));
        this.pack();
    }
}
