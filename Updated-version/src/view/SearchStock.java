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
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

public class SearchStock extends JDialog {
    private JPanel body;
    private JScrollPane jScrollPane1;
    private JLabel lbSearch;
    private JLabel lbTitle;
    private JPanel mainPanel;
    private JPanel pBody;
    private JPanel pSearch;
    private JPanel pTable;
    private JPanel pTitle;
    private JLabel separator;
    public JTable tbStocks;
    public JTextField tfSearch;
    private JPanel title;

    public SearchStock(Frame parent, boolean modal) {
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
        this.pSearch = new JPanel();
        this.separator = new JLabel();
        this.lbSearch = new JLabel();
        this.tfSearch = new JTextField();
        this.pTable = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.tbStocks = new JTable();
        this.setDefaultCloseOperation(2);
        this.setTitle("Search stock");
        this.mainPanel.setBackground(new Color(217, 219, 226));
        this.mainPanel.setLayout(new BorderLayout());
        this.title.setBackground(new Color(35, 44, 64));
        this.title.setPreferredSize(new Dimension(80, 0));
        GroupLayout titleLayout = new GroupLayout(this.title);
        this.title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(titleLayout.createParallelGroup(Alignment.LEADING).addGap(0, 80, 32767));
        titleLayout.setVerticalGroup(titleLayout.createParallelGroup(Alignment.LEADING).addGap(0, 512, 32767));
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
        this.lbTitle.setForeground(new Color(35, 44, 64));
        this.lbTitle.setText("Search stock");
        this.pTitle.add(this.lbTitle);
        this.body.add(this.pTitle, "First");
        this.pBody.setOpaque(false);
        this.pBody.setPreferredSize(new Dimension(632, 400));
        this.pBody.setLayout(new BoxLayout(this.pBody, 3));
        this.pSearch.setOpaque(false);
        this.pSearch.setPreferredSize(new Dimension(0, 40));
        this.pSearch.setLayout(new FlowLayout(0, 10, 5));
        this.pSearch.add(this.separator);
        this.lbSearch.setFont(new Font("Roboto", 0, 14));
        this.lbSearch.setForeground(new Color(0, 0, 0));
        this.lbSearch.setText("Search:");
        this.pSearch.add(this.lbSearch);
        this.tfSearch.setMinimumSize(new Dimension(100, 20));
        this.tfSearch.setPreferredSize(new Dimension(200, 25));
        this.pSearch.add(this.tfSearch);
        this.pBody.add(this.pSearch);
        this.pTable.setOpaque(false);
        this.pTable.setLayout(new GridBagLayout());
        this.tbStocks.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}}, new String[]{"Stock symbol", "Description", "Price", "Quantity", "Total"}) {
            boolean[] canEdit = new boolean[]{false, false, false, true, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.tbStocks.setGridColor(new Color(51, 51, 51));
        this.tbStocks.setSelectionBackground(new Color(145, 161, 187));
        this.tbStocks.setSelectionForeground(new Color(35, 44, 63));
        this.jScrollPane1.setViewportView(this.tbStocks);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0D;
        gridBagConstraints.weighty = 1.0D;
        gridBagConstraints.insets = new Insets(0, 20, 20, 20);
        this.pTable.add(this.jScrollPane1, gridBagConstraints);
        this.pBody.add(this.pTable);
        this.body.add(this.pBody, "Center");
        this.mainPanel.add(this.body, "Center");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.mainPanel, -1, 712, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.mainPanel, -1, -1, 32767));
        this.pack();
    }
}
