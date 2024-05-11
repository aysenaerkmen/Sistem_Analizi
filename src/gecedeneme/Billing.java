/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gecedeneme;

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
        ShowCustomer();
        GetCustomer();
        GetUser();
    }
      PraperedStatement prpStatement = null;
    
    Statement statement = null;
    Connection connection = null; 
    ResultSet resultSet = null;
 private void ShowCustomer(){
        try
        {
            connection = (Connection)DriverManager.getConnection(""); //bu kisma mysql'den data gelecek locakhost. tinak icine
            Statement statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery("Select * from CustomersTable");
            ProductT.setModel(DbUtils.resultSetToTableModel(resultSet));
        } 
        catch (Exception e) 
        {
        
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
        AmountT = new javax.swing.JTextField();
        ProductT = new javax.swing.JTextField();
        CustC = new javax.swing.JComboBox<>();
        BillBtn = new javax.swing.JButton();
        UserC = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PriceT = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        DateCh = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProListT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillT = new javax.swing.JTable();
        SaveBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        totallbl = new javax.swing.JLabel();

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
        jLabel5.setText("Product:");

        AmountT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTActionPerformed(evt);
            }
        });

        ProductT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductTActionPerformed(evt);
            }
        });

        CustC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CustC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustCActionPerformed(evt);
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

        UserC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        UserC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserCActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Date:");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setText("Price:");

        PriceT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTActionPerformed(evt);
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserC, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(DateCh, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(CustC, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ProductT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountT, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(BillBtn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(451, 451, 451)
                .addComponent(jButton8)
                .addGap(35, 35, 35))
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
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustC)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AmountT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserC)
                        .addComponent(PriceT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillBtn)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
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

        ProListT.setBackground(new java.awt.Color(255, 255, 234));
        ProListT.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ProListT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Category", "Amount", "Price"
            }
        ));
        ProListT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProListTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProListT);

        BillT.setBackground(new java.awt.Color(255, 255, 234));
        BillT.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        BillT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Product", "Price", "Amount", "Total"
            }
        ));
        jScrollPane2.setViewportView(BillT);

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
        totallbl.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totallbl)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SaveBtn)
                                .addGap(18, 18, 18)
                                .addComponent(PrintBtn)))
                        .addGap(85, 85, 85)))
                .addGap(22, 22, 22))
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
                .addGap(7, 7, 7)
                .addComponent(totallbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(PrintBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void AmountTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTActionPerformed

    private void ProductTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductTActionPerformed

    private void PriceTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTActionPerformed
    int n=1;
    int row=0;
    int totalf=0;
    
    private void BillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillBtnActionPerformed
        if(ProductT.getText().isEmpty()||PriceT.getText().isEmpty()||AmountT.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Missing information ");
        }else{
       int total=Integer.valueOf(PriceT.getText())*Integer.valueOf(AmountT.getText());
       BillT.setValueAt(n, row, 0);
       BillT.setValueAt(ProductT.getText(), row, 1);
       BillT.setValueAt(PriceT.getText(), row, 2);
       BillT.setValueAt(AmountT.getText(), row, 3);
       BillT.setValueAt(total, row, 4);
       totallbl.setText("totalf");
       totalf+=total;
       n++;
       row++; 
       UpdateAmount();
        }
       
    }//GEN-LAST:event_BillBtnActionPerformed
    int itemId;
    Statement statement1 = null;
    ResultSet resultSet1 = null;
    public void Counter(){
        try 
        {
            statement1 = (Statement) connection.createStatement();
            resultSet1 = statement1.executeQuery("select Max(BNum) from BillT");
            resultSet1.next();
            itemId = resultSet1.getInt(1)+1;
        }
        catch (Exception e) 
        {
            
        }
        
    }
    private void UpdateAmount(){
        int newamount =stock-Integer.valueOf(AmountT.getText());
        try {
            connection = DriverManager.getConnection(""); //bu kisma mysql'den data gelecek locakhost. tinak icine
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("update PetsT set PAmount=? where PId=?");
                  save.setInt(2,key);
               
                save.setInt(1,newamount);
       
                
                
                int satir = save.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Pet edited Successfully!");
                
                connection.close();
                ShowCustomer();
        } catch (Exception e) {
        }
         
    }
    
    
    
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(CustC.getSelectedIndex()==-1  || UserC.getSelectedIndex()==-1 ){
            JOptionPane.showMessageDialog(this, "!!! missing information warning, fill in all the information !!!");
        }else{
            try {
                Counter();
                connection = DriverManager.getConnection(""); //bu kisma mysql'den data gelecek locakhost. tinak icine
                PreparedStatement save = (PreparedStatement) connection.prepareStatement("insert into BillT values(?,?,?,?,?)");
                save.setInt(1,itemId);
                save.setString(2,DateCh.getDate().toString());
                save.setString(3,Integer.valueOf(CustC.getSelectedItem().toString()));
                save.setString(4,Integer.valueOf(UserC.getSelectedItem().toString()));
                save.setString(5,totalf);
                
                
                int satir = save.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Bill saved Successfully!");
                
                connection.close();
                ShowCustomer();
              //  DeleteAll();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        try {
          
            
            BillT.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed
     private void GetUser(){
           try{
                connection = (Connection)DriverManager.getConnection(""); //bu kisma mysql'den data gelecek locakhost. tinak icine
            Statement statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery("Select * from UserT");
            while(resultSet.next()){
                int UId=resultSet.getInt("UId");
                UserC.addItem(UId);
            }
           }catch(Exception e){
               
           }
       }
     private void GetCustomer(){
           try{
                connection = (Connection)DriverManager.getConnection(""); //bu kisma mysql'den data gelecek locakhost. tinak icine
            Statement statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery("Select * from CustomerT");
            while(resultSet.next()){
                int CatId=resultSet.getInt("CustId");
                CustC.addItem(CatId);
            }
           }catch(Exception e){
               
           }
       }
    
    int stock=0;
    int key=0;
    
    
    private void ProListTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProListTMouseClicked
          DefaultTableModel model = (DefaultTableModel) ProListT.getModel();
        int busira = ProListT.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(busira, 0).toString());
        ProductT.setText(model.getValueAt(busira, 1).toString());
       // stock =Integer.valueOf(model.getValueAt(busira, 3).toString());
        AmountT.setText(model.getValueAt(busira, 3).toString());
        PriceT.setText(model.getValueAt(busira, 4).toString());
        
    }//GEN-LAST:event_ProListTMouseClicked

    private void UserCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserCActionPerformed

    private void CustCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustCActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountT;
    private javax.swing.JButton BillBtn;
    private javax.swing.JTable BillT;
    private javax.swing.JComboBox<String> CustC;
    private com.toedter.calendar.JDateChooser DateCh;
    private javax.swing.JTextField PriceT;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTable ProListT;
    private javax.swing.JTextField ProductT;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> UserC;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel totallbl;
    // End of variables declaration//GEN-END:variables
}
