/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hotel_system;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josip
 */
public class ManageClientsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageClientsForm
     */
    
    Client client = new Client();
    
    public ManageClientsForm() {
        initComponents();
        
        // add a white border to "clear fields" button
        //Border border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.white);
        //jButtonClearFields.setBorder(border);
        
        // fill the table
        client.fillClientJTable(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAddClient = new javax.swing.JButton();
        jButtonEditClient = new javax.swing.JButton();
        jButtonRemoveClient = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1055, 650));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(7, 76, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Clients");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("First Name:");

        jTextFieldFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Last Name:");

        jTextFieldLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Prone N°:");

        jTextFieldPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Email:");

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone N°l", "Emaill"
            }
        )
        // make the table not editable
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.setGridColor(new java.awt.Color(255, 255, 0));
    jTable1.setSelectionBackground(new java.awt.Color(0, 153, 0));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButtonAddClient.setBackground(new java.awt.Color(102, 204, 0));
    jButtonAddClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButtonAddClient.setText("Add New Client");
    jButtonAddClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonAddClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddClientActionPerformed(evt);
        }
    });

    jButtonEditClient.setBackground(new java.awt.Color(255, 255, 0));
    jButtonEditClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButtonEditClient.setText("Edit");
    jButtonEditClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEditClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditClientActionPerformed(evt);
        }
    });

    jButtonRemoveClient.setBackground(new java.awt.Color(255, 0, 0));
    jButtonRemoveClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButtonRemoveClient.setForeground(new java.awt.Color(255, 255, 255));
    jButtonRemoveClient.setText("Remove");
    jButtonRemoveClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonRemoveClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveClientActionPerformed(evt);
        }
    });

    jButtonClearFields.setBackground(new java.awt.Color(204, 204, 204));
    jButtonClearFields.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonClearFields.setText("Clear Fields");
    jButtonClearFields.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonClearFieldsActionPerformed(evt);
        }
    });

    jButton_Refresh_JTable_Data.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton_Refresh_JTable_Data.setText("Refresh");
    jButton_Refresh_JTable_Data.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_Refresh_JTable_DataActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTextFieldFirstName)
                .addComponent(jTextFieldLastName)
                .addComponent(jTextFieldPhone)
                .addComponent(jTextFieldEmail)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonEditClient, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                    .addComponent(jButtonRemoveClient, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jButtonClearFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(jTextFieldID))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
            .addGap(23, 23, 23))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonRemoveClient, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonAddClient)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEditClient)))
                    .addGap(18, 18, 18)
                    .addComponent(jButtonClearFields))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap(87, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddClientActionPerformed
        
        // add a new client
        
        // get data from the fields
        String firstname = jTextFieldFirstName.getText();
        String lastname = jTextFieldLastName.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        
        if(firstname.trim().equals("") || lastname.trim().equals("") || phone.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name + Phone Number", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }else{
            
            if(client.addClient(firstname, lastname, phone, email)) {
                JOptionPane.showMessageDialog(rootPane, "New Client Added Successfully", "Add Client", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Client Not Added", "Add Client Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }//GEN-LAST:event_jButtonAddClientActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        // display selected row data in the jtextfields
        
        // get the jtable model
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        // get the selected row index
        int rIndex = jTable1.getSelectedRow();
        
        // display data
        jTextFieldID.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldFirstName.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldLastName.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldPhone.setText(model.getValueAt(rIndex, 3).toString());
        jTextFieldEmail.setText(model.getValueAt(rIndex, 4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEditClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditClientActionPerformed
        
        // get data from the fields
        int id = 0;
        String firstname = jTextFieldFirstName.getText();
        String lastname = jTextFieldLastName.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        
        if(firstname.trim().equals("") || lastname.trim().equals("") || phone.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name + Phone Number", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }else{
            
            try {
                id = Integer.valueOf(jTextFieldID.getText()); 
               
                if(client.editClient(id, firstname, lastname, phone, email)) {
                    JOptionPane.showMessageDialog(rootPane, "Client Data Updated Successfully", "Edit Client", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Client Data Not Updated", "Edit Client Error", JOptionPane.ERROR_MESSAGE);
                }
               
            }
            catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Client Id (number)", "Client Id Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }//GEN-LAST:event_jButtonEditClientActionPerformed

    private void jButtonRemoveClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveClientActionPerformed
        
        // delete selected client
        try {
            int id = Integer.valueOf(jTextFieldID.getText()); 
               
            if(client.removeClient(id)) {
                JOptionPane.showMessageDialog(rootPane, "Client Deleted Successfully", "Remove Client", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Client Data Not Deleted", "Remove Client Error", JOptionPane.ERROR_MESSAGE);
            }
               
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Client Id (number)", "Client Id Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonRemoveClientActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        
        jTextFieldID.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldPhone.setText("");
        jTextFieldEmail.setText("");
        
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed
        
        // clear the table first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID", "First Name", "Last Name", "Phone", "Email"}));
        
        // fill the table
        client.fillClientJTable(jTable1);
        
    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

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
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClientsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddClient;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditClient;
    private javax.swing.JButton jButtonRemoveClient;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
