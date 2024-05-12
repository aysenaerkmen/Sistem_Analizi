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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ayşe S. ERKMEN
 */
public class ProductManager extends javax.swing.JFrame {

    
    PreparedStatement prpStatement = null;
    
    Statement statement = null;
    Connection connection = null;
    ResultSet resultSet = null;
    /**
     * Creates new form ProductManager
     */
    public ProductManager() {
        initComponents();
        ShowProducts();
        populateComboBox();
    }

    private void DeleteAll()
    {
        ProductsID.setText("");
        ProductsAmount.setText("");
        ProductsPrice.setText("");
        key =0;
    }
    
    private void ShowProducts(){
        try
        {
            Class.forName("org.postgresql.Driver");
            connection = (Connection)DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); //bu kisma mysql'den data gelecek locakhost. tinak icine
            Statement statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery("Select * FROM public.products");
            ProductsTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } 
        catch (Exception e) 
        {
        
        }
    }
     private void populateComboBox() {
        try {
             Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT \"CategoryName\" FROM public.\"Categorys\"");

            while (resultSet.next()) {
                ProductsCategory.addItem(resultSet.getString("CategoryName"));
            }
            connection.close();
        } catch (Exception e) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ProductsID = new javax.swing.JTextField();
        ProductsAmount = new javax.swing.JTextField();
        ProductsPrice = new javax.swing.JTextField();
        ButtonProductsEdit = new javax.swing.JButton();
        ButtonProductsSave = new javax.swing.JButton();
        ButtonProductsDelete = new javax.swing.JButton();
        ButtonCustomersExit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ProductsCategory = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 228, 250));

        jPanel5.setBackground(new java.awt.Color(255, 255, 241));

        jPanel6.setBackground(new java.awt.Color(255, 246, 253));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel6.setText("PupPet Products Manager");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("ID:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Amount");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Price:");

        ProductsID.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ProductsID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsIDActionPerformed(evt);
            }
        });

        ProductsAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsAmountActionPerformed(evt);
            }
        });

        ProductsPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsPriceActionPerformed(evt);
            }
        });

        ButtonProductsEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        ButtonProductsEdit.setForeground(new java.awt.Color(255, 102, 153));
        ButtonProductsEdit.setText("Edit");
        ButtonProductsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProductsEditActionPerformed(evt);
            }
        });

        ButtonProductsSave.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        ButtonProductsSave.setForeground(new java.awt.Color(255, 102, 153));
        ButtonProductsSave.setText("Save");
        ButtonProductsSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProductsSaveActionPerformed(evt);
            }
        });

        ButtonProductsDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        ButtonProductsDelete.setForeground(new java.awt.Color(255, 102, 153));
        ButtonProductsDelete.setText("Delete");
        ButtonProductsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProductsDeleteActionPerformed(evt);
            }
        });

        ButtonCustomersExit.setBackground(new java.awt.Color(255, 255, 222));
        ButtonCustomersExit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ButtonCustomersExit.setForeground(new java.awt.Color(255, 111, 111));
        ButtonCustomersExit.setText("X");
        ButtonCustomersExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCustomersExitActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Category:");

        ProductsCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductsID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(ButtonProductsEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonProductsSave)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(ProductsCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(ProductsAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonProductsDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(ProductsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonCustomersExit)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ButtonCustomersExit))
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductsID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductsAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductsCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonProductsEdit)
                    .addComponent(ButtonProductsSave)
                    .addComponent(ButtonProductsDelete))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        ProductsTable.setBackground(new java.awt.Color(255, 255, 234));
        ProductsTable.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ProductsTable.setGridColor(new java.awt.Color(255, 255, 234));
        ProductsTable.setRowHeight(35);
        ProductsTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductsTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductsIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsIDActionPerformed

    private void ProductsAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsAmountActionPerformed

    private void ProductsPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsPriceActionPerformed

    private void ButtonProductsEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProductsEditActionPerformed
          try {    
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(ProductsID.getText().isEmpty() || ProductsCategory.getSelectedIndex()==-1|| ProductsAmount.getText().isEmpty()|| ProductsPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "!!! missing information warning, fill in all the information !!!");
        }else{
            
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); //bu kisma mysql'den data gelecek locakhost. tinak icine
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("UPDATE public.products SET  \"productCategory\"=?,\"productAmount\"=?,\"productPrice\"=? where \"productId\"=?");
                String keyS= String.valueOf(key);
                save.setString(4, keyS);
                String category = ProductsCategory.getSelectedItem().toString();
                save.setString(1,category);
                save.setInt(2,Integer.valueOf(ProductsAmount.getText()));
                save.setInt(3,Integer.parseInt(ProductsPrice.getText()));


                int row = save.executeUpdate();

                JOptionPane.showMessageDialog(this, "Product edited Successfully!");

                connection.close();
                ShowProducts();
                DeleteAll();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

    }//GEN-LAST:event_ButtonProductsEditActionPerformed

    private void ButtonProductsSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProductsSaveActionPerformed
         try {    
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(ProductsID.getText().isEmpty()  || ProductsCategory.getSelectedIndex()==-1 || ProductsAmount.getText().isEmpty()||ProductsPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "!!! missing information warning, fill in all the information !!!");
        }else{
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); //bu kisma mysql'den data gelecek locakhost. tinak icine
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("insert into public.products values(?,?,?,?)");
                save.setString(1,ProductsID.getText());
                save.setString(2,ProductsCategory.getSelectedItem().toString());
                save.setInt(3,Integer.valueOf(ProductsAmount.getText()));
                save.setInt(4,Integer.valueOf(ProductsPrice.getText()));

                int row = save.executeUpdate();

                JOptionPane.showMessageDialog(this, "Product added Successfully!");

                connection.close();
                ShowProducts();
                DeleteAll();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

    }//GEN-LAST:event_ButtonProductsSaveActionPerformed

    private void ButtonProductsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProductsDeleteActionPerformed
         try {    
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(key == 0){
            JOptionPane.showMessageDialog(this, "!!! warning, select a product !!!");
        }else{
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); //bu kisma mysql'den data gelecek locakhost. tinak icine
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("DELETE FROM \"products\" WHERE \"productId\" =?");
                String keyS= String.valueOf(key);
                save.setString(1, keyS);

                int row = save.executeUpdate();

                JOptionPane.showMessageDialog(this, "Product deleted Successfully!");

                connection.close();
                ShowProducts();
                DeleteAll();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

    }//GEN-LAST:event_ButtonProductsDeleteActionPerformed

    private void ButtonCustomersExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCustomersExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ButtonCustomersExitActionPerformed
int key = 0 ;
    private void ProductsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
    int thisRow = ProductsTable.getSelectedRow();
    
    // ID bilgisini alarak anahtar olarak kullan
    key = Integer.parseInt(model.getValueAt(thisRow, 0).toString());
    ProductsID.setText(model.getValueAt(thisRow, 0).toString());
    
    // Kategori bilgisini JComboBox'ta seçili hale getir
    String category = model.getValueAt(thisRow, 1).toString();
    ProductsCategory.setSelectedItem(category);
    
    // Miktar ve Fiyat bilgilerini ayarla
    ProductsAmount.setText(model.getValueAt(thisRow, 2).toString());
    ProductsPrice.setText(model.getValueAt(thisRow, 3).toString());

    }//GEN-LAST:event_ProductsTableMouseClicked

    private void ProductsCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCustomersExit;
    private javax.swing.JButton ButtonProductsDelete;
    private javax.swing.JButton ButtonProductsEdit;
    private javax.swing.JButton ButtonProductsSave;
    private javax.swing.JTextField ProductsAmount;
    private javax.swing.JComboBox<String> ProductsCategory;
    private javax.swing.JTextField ProductsID;
    private javax.swing.JTextField ProductsPrice;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}