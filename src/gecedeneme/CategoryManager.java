
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


public class CategoryManager extends javax.swing.JFrame {

    
    public CategoryManager() {
        initComponents();
        ShowCategory();
    }

     PreparedStatement prpStatement = null;
    
    Statement statement = null;
    Connection connection = null;
    ResultSet resultSet = null;
    
    private void ShowCategory() {
    try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT \"CategoryName\" ,\"id\"  FROM public.\"Categorys\"");
        
        // Tablo modelini oluştur
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name"}, 0);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("CategoryName");
            model.addRow(new Object[]{id, name});
        }
        CategoryTable.setModel(model);
        
        // ID sütununu gizle
        CategoryTable.getColumnModel().getColumn(0).setMinWidth(0);
        CategoryTable.getColumnModel().getColumn(0).setMaxWidth(0);
        CategoryTable.getColumnModel().getColumn(0).setWidth(0);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CategoryName = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 228, 250));

        jPanel5.setBackground(new java.awt.Color(255, 255, 241));

        jPanel6.setBackground(new java.awt.Color(255, 246, 253));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel6.setText("PupPet Category Manager");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Name:");

        CategoryName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        CategoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryNameActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 102, 153));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 102, 153));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 102, 153));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 222));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 111, 111));
        jButton7.setText("X");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CategoryName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(76, 76, 76)))
                        .addGap(105, 105, 105))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(EditBtn)
                        .addGap(67, 67, 67)
                        .addComponent(SaveBtn)
                        .addGap(68, 68, 68)
                        .addComponent(DeleteBtn))
                    .addComponent(jLabel6))
                .addGap(251, 251, 251)
                .addComponent(jButton7)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn))
                .addGap(20, 20, 20))
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
                .addGap(0, 34, Short.MAX_VALUE))
        );

        CategoryTable.setBackground(new java.awt.Color(255, 255, 234));
        CategoryTable.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "CatagoryName"
            }
        ));
        CategoryTable.setRowHeight(35);
        CategoryTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryNameActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        
        try {    
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        if(CategoryName.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "!!! missing information warning, fill in all the information !!!");
        }else{
            try {
                
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); 
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("insert INTO  public.\"Categorys\"  values(?)");
                save.setString(1,CategoryName.getText());
              
                int row = save.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Category added Successfully!");
                
                connection.close();
                ShowCategory();
              //  DeleteAll();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }  
    }//GEN-LAST:event_SaveBtnActionPerformed
int key=0;
    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) CategoryTable.getModel();
        int selectedRowIndex = CategoryTable.getSelectedRow();
    
    
        key = (Integer) model.getValueAt(selectedRowIndex, 0);
        CategoryName.setText(model.getValueAt(selectedRowIndex, 1).toString());
         
        
    }//GEN-LAST:event_CategoryTableMouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
         
        try {    
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(CategoryName.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "!!! missing information warning, fill in all the information !!!");
        }else{
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); //bu kisma mysql'den data gelecek locakhost. tinak icine
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("UPDATE  public.\"Categorys\" SET \"CategoryName\" =? WHERE \"id\" = ?");
                save.setInt(2,key);
                save.setString(1,CategoryName.getText());
               
                
                int row = save.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Catogory edited Successfully!");
                
                connection.close();
                ShowCategory();
               DeleteAll();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        
        
    }//GEN-LAST:event_EditBtnActionPerformed
private void DeleteAll(){
    CategoryName.setText("");
}
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
        try {    
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(key == 0){
            JOptionPane.showMessageDialog(this, "!!! warning, select a category !!!");
        }else{
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PetShop_Database", "postgres", "1234567"); //bu kisma mysql'den data gelecek locakhost. tinak icine
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("Delete  FROM public.\"Categorys\" WHERE \"id\" = ?");
                save.setInt(1,key);
                
                
                
                int row = save.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Category deleted Successfully!");
                
                connection.close();
                ShowCategory();
               DeleteAll();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CategoryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CategoryName;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
