/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gecedeneme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muharrem
 */
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        ShowProducts();

        populateComboBoxCustomer();
        populateComboBoxUser();
    }
   
    PreparedStatement prpStatement = null;
    Statement statement = null;
    Connection connection = null; 
    ResultSet resultSet = null;
    
    int stock=0;
    int key=0;   
    
    int n=1;
    int row=0;
    int totalf=0;
    
 private void   ShowProducts(){
        try
        {
            Class.forName("org.postgresql.Driver");
            connection = (Connection)DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); //bu kisma mysql'den data gelecek locakhost. tinak icine
            Statement statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery("Select * FROM public.products");
            ProductTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } 
        catch (Exception e) 
        {
        
        }
    }
    private void populateComboBoxCustomer() {
        try {
             Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT \"CustomersName\" FROM public.\"CustomersTable\"");

            while (resultSet.next()) {
                Customer.addItem(resultSet.getString("CustomersName"));
            }
            connection.close();
        } catch (Exception e) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void populateComboBoxUser() {
        try {
             Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT \"UserName\" FROM public.\"users\"");

            while (resultSet.next()) {
               User.addItem(resultSet.getString("UserName"));
            }
            connection.close();
        } catch (Exception e) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        Product = new javax.swing.JTextField();
        Customer = new javax.swing.JComboBox<>();
        BillBtn = new javax.swing.JButton();
        User = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        SaveBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        totallbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 228, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 241));

        jPanel3.setBackground(new java.awt.Color(255, 246, 253));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel1.setText("Billing");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("User:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Customer:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Amount:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Product ID:");

        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });

        Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductActionPerformed(evt);
            }
        });

        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });

        BillBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        BillBtn.setForeground(new java.awt.Color(255, 102, 153));
        BillBtn.setText("Add to Bill");
        BillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillBtnActionPerformed(evt);
            }
        });

        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setText("Price:");

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 222));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 111, 111));
        jButton8.setText("X");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Product, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(360, 360, 360)
                        .addComponent(jButton8)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(BillBtn)
                        .addGap(38, 38, 38))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(BillBtn)
                .addGap(57, 57, 57))
        );

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 153));
        jLabel7.setText("Product List");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 153));
        jLabel8.setText("Customer's Bill");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(130, 130, 130))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 234));

        ProductTable.setBackground(new java.awt.Color(255, 255, 234));
        ProductTable.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Category", "Amount", "Price"
            }
        ));
        ProductTable.setGridColor(new java.awt.Color(255, 255, 234));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        BillTable.setBackground(new java.awt.Color(255, 255, 234));
        BillTable.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Category", "Amount", "Price", "Total"
            }
        ));
        jScrollPane2.setViewportView(BillTable);

        SaveBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 102, 153));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        PrintBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 102, 153));
        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        totallbl.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        totallbl.setForeground(new java.awt.Color(255, 102, 153));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 153));
        jLabel9.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(SaveBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(PrintBtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(totallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)))
                                .addGap(87, 87, 87)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(totallbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveBtn)
                            .addComponent(PrintBtn))
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountActionPerformed

    private void ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed
 
    
    private void BillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillBtnActionPerformed
        if(Product.getText().isEmpty()||Price.getText().isEmpty()||Amount.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Missing information ");
        }else{
       int total=Integer.valueOf(Price.getText())*Integer.valueOf(Amount.getText());
       BillTable.setValueAt(n, row, 0);
       BillTable.setValueAt(Product.getText(), row, 1);
       BillTable.setValueAt(Amount.getText(), row, 2);
       BillTable.setValueAt(Price.getText(), row, 3);
       BillTable.setValueAt(total, row, 4);
       
       totalf+=total;
       
       totallbl.setText(String.valueOf(totalf));
       n++;
       row++; 
       UpdateAmount();
       ShowProducts();
        }  
    }//GEN-LAST:event_BillBtnActionPerformed

    private void UpdateAmount(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int newamount =stock-Integer.parseInt(Amount.getText());
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); 
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("UPDATE public.\"products\" SET \"productAmount\"=? where \"productId\"=?");
                String keyS= String.valueOf(key);
                save.setString(2, keyS);
                save.setInt(1,newamount);
     
                int row = save.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Product Amount edited Successfully!");
                
                connection.close();
                ShowProducts();
        } catch (Exception e) {
        }
         
    }
    
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        
        
        try {
            Class.forName("org.postgresql.Driver");
            
            if(Customer.getSelectedIndex()==-1  || User.getSelectedIndex()==-1 ){
                JOptionPane.showMessageDialog(this, "!!! missing information warning, fill in all the information !!!");
            }else{
                try {
                    
                    //connection = DriverManager.getConnection("\"jdbc:postgresql://localhost:5432/PetShop_Database\", \"postgres\", \"1234567\""); //bu kisma mysql'den data gelecek locakhost. tinak icine
                    //PreparedStatement save = (PreparedStatement) connection.prepareStatement("insert into BillT values(?,?,?,?,?)");
                    //save.setString(3,Integer.valueOf(Customer.getSelectedItem().toString()));
                    //save.setString(4,Integer.valueOf(User.getSelectedItem().toString()));
                    //save.setString(5,totalf);
                    
                    
                    //int row = save.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this, "Bill saved Successfully!");
                    
                   // connection.close();
                    ShowProducts();
                    //  DeleteAll();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        try {
          
            
            BillTable.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        int thisRow = ProductTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(thisRow, 0).toString());
        Product.setText(model.getValueAt(thisRow, 0).toString());
        stock  = Integer.parseInt(model.getValueAt(thisRow, 2).toString());
        Price.setText(model.getValueAt(thisRow, 3).toString());
        
    }//GEN-LAST:event_ProductTableMouseClicked

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        
    }//GEN-LAST:event_UserActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JButton BillBtn;
    private javax.swing.JTable BillTable;
    private javax.swing.JComboBox<String> Customer;
    private javax.swing.JTextField Price;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField Product;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> User;
    private javax.swing.JButton jButton8;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel totallbl;
    // End of variables declaration//GEN-END:variables
}
