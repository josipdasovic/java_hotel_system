package java_hotel_system;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josip
 */
public class ManageReservationsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageReservationsForm
     */
    
    Reservation reservation = new Reservation();
    
    public ManageReservationsForm() {
        initComponents();
        
        reservation.fillReservationsJTable(jTable1);
        
        jTable1.setRowHeight(25);
        
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
        jTextFieldClientID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRoomNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldReservationID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAddReservation = new javax.swing.JButton();
        jButtonEditReservation = new javax.swing.JButton();
        jButtonRemoveReservation = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();
        jDateChooserDateOut = new com.toedter.calendar.JDateChooser();
        jDateChooserDateIn = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel2.setBackground(new java.awt.Color(7, 76, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Reservations");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
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
        jLabel2.setText("Client ID:");

        jTextFieldClientID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Room N°:");

        jTextFieldRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Date In:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Date Out:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("ID:");

        jTextFieldReservationID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Client ID", "Room Number", "Date In", "Date Out"
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

    jButtonAddReservation.setBackground(new java.awt.Color(102, 204, 0));
    jButtonAddReservation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButtonAddReservation.setText("Add New Reservation");
    jButtonAddReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonAddReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddReservationActionPerformed(evt);
        }
    });

    jButtonEditReservation.setBackground(new java.awt.Color(255, 255, 0));
    jButtonEditReservation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButtonEditReservation.setText("Edit");
    jButtonEditReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEditReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditReservationActionPerformed(evt);
        }
    });

    jButtonRemoveReservation.setBackground(new java.awt.Color(255, 0, 0));
    jButtonRemoveReservation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButtonRemoveReservation.setForeground(new java.awt.Color(255, 255, 255));
    jButtonRemoveReservation.setText("Remove");
    jButtonRemoveReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonRemoveReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveReservationActionPerformed(evt);
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

    jDateChooserDateOut.setDateFormatString("dd/MM/yyyy");

    jDateChooserDateIn.setDateFormatString("dd/MM/yyyy");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientID)
                    .addComponent(jTextFieldReservationID)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRoomNumber)
                    .addComponent(jDateChooserDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonEditReservation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAddReservation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveReservation, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
            .addGap(41, 41, 41)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
            .addGap(23, 23, 23))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldReservationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jDateChooserDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jDateChooserDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonAddReservation)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditReservation))
                        .addComponent(jButtonRemoveReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButtonClearFields))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(74, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // display selected row data in the jtextfields

        // get the jtable model
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        // get the selected row index
        int rIndex = jTable1.getSelectedRow();

        // display data
        jTextFieldReservationID.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldClientID.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldRoomNumber.setText(model.getValueAt(rIndex, 2).toString());

        // display date in & date out
        try {
            
            Date dateIn = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 3).toString());
            jDateChooserDateIn.setDate(dateIn);
            
            Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 4).toString());
            jDateChooserDateOut.setDate(dateOut);
            
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddReservationActionPerformed

        try {
        
            int client_id = Integer.valueOf(jTextFieldClientID.getText());
            int room_number = Integer.valueOf(jTextFieldRoomNumber.getText());  
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date_in = dateFormat.format(jDateChooserDateIn.getDate());
            String date_out = dateFormat.format(jDateChooserDateOut.getDate());
            String toDayDate = dateFormat.format(new Date());
            
            Date din = dateFormat.parse(date_in);
            Date dout = dateFormat.parse(date_out);
            Date tdd = dateFormat.parse(toDayDate);
            
            // if the date_in is before or not equal to todays date
            if(!(din.after(tdd) || din.equals(tdd))) {
            
                JOptionPane.showMessageDialog(rootPane, "Date In Must Be After Or Equal To Todays Date", "Date In Error", JOptionPane.ERROR_MESSAGE);
                
            //if the date_out is before date_in or not equal to date_in
            }else if(!(dout.after(din) || dout.equals(din))){
                JOptionPane.showMessageDialog(rootPane, "Date Out Must Be After Or Equal To Date In", "Date Out Error", JOptionPane.ERROR_MESSAGE);
            }else{
                if(reservation.addReservation(client_id, room_number, date_in, date_out)) {
                    JOptionPane.showMessageDialog(rootPane, "New Reservation Added Successfully", "Add Reservation", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Reservation Not Added", "Add Reservation Error", JOptionPane.ERROR_MESSAGE);
                }  
            }
                
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Room Number + Client ID", "Input Fields Error", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_jButtonAddReservationActionPerformed

    private void jButtonEditReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditReservationActionPerformed

        // get data from the fields
        try {
            int reservationId = Integer.valueOf(jTextFieldReservationID.getText());
            int roomNumber = Integer.valueOf(jTextFieldRoomNumber.getText());
            int clientId = Integer.valueOf(jTextFieldClientID.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date_in = dateFormat.format(jDateChooserDateIn.getDate());
            String date_out = dateFormat.format(jDateChooserDateOut.getDate());
            
            String toDayDate = dateFormat.format(new Date());
            
            Date din = dateFormat.parse(date_in);
            Date dout = dateFormat.parse(date_out);
            Date tdd = dateFormat.parse(toDayDate);
            
            if(!(din.after(tdd) || din.equals(tdd))) {
            
                JOptionPane.showMessageDialog(rootPane, "Date In Must Be After Or Equal To Todays Date", "Date In Error", JOptionPane.ERROR_MESSAGE);
                
            //if the date_out is before date_in or not equal to date_in
            }else if(!(dout.after(din) || dout.equals(din))){
                JOptionPane.showMessageDialog(rootPane, "Date Out Must Be After Or Equal To Date In", "Date Out Error", JOptionPane.ERROR_MESSAGE);
            }else{
                if(reservation.editReservation(reservationId, clientId, roomNumber, date_in, date_out)) {
                    JOptionPane.showMessageDialog(rootPane, "Reservation Information Updated Successfully", "Edit Reservation", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Reservation Information Not Updated", "Edit Reservation Error", JOptionPane.ERROR_MESSAGE);
                }  
            }

        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Room Number + Client ID + Reservation ID", "Data Error", JOptionPane.ERROR_MESSAGE);
        }catch(NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Select Date In & Date Out", "Date Error", JOptionPane.ERROR_MESSAGE);
        }catch(ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonEditReservationActionPerformed

    private void jButtonRemoveReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveReservationActionPerformed

        // delete the selected room
        try {
            int reservationId = Integer.valueOf(jTextFieldReservationID.getText()); 
               
            if(reservation.removeReservation(reservationId)) {
                JOptionPane.showMessageDialog(rootPane, "Reservation Deleted Successfully", "Remove Reservation", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Reservation Not Deleted", "Remove Reservation Error", JOptionPane.ERROR_MESSAGE);
            }
               
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Reservation ID", "Reservation ID Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonRemoveReservationActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed

        jTextFieldClientID.setText("");
        jTextFieldReservationID.setText("");
        jTextFieldRoomNumber.setText("");
        
        jDateChooserDateIn.setDate(null);
        jDateChooserDateOut.setDate(null);

    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed

        // clear the table first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Reservation ID", "Client ID", "Room Number", "Date In", "Date Out"}));

        // fill the table
        reservation.fillReservationsJTable(jTable1);

    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

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
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReservationsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddReservation;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditReservation;
    private javax.swing.JButton jButtonRemoveReservation;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private com.toedter.calendar.JDateChooser jDateChooserDateIn;
    private com.toedter.calendar.JDateChooser jDateChooserDateOut;
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
    private javax.swing.JTextField jTextFieldClientID;
    private javax.swing.JTextField jTextFieldReservationID;
    private javax.swing.JTextField jTextFieldRoomNumber;
    // End of variables declaration//GEN-END:variables
}
