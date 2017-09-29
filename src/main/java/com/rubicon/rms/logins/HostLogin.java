/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubicon.rms.logins;

import com.rubicon.rms.admin.ExportJTable;
import com.rubicon.rms.system.Login;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pakeeru Sreeja
 */
public class HostLogin extends javax.swing.JFrame {

    ImportData i = new ImportData();
    String[][] rowData =  i.importData("OrderDetails.csv").toArray(new String[0][]);
    final String[] columnNames = {"HostId","BusBoyID","ManagerId","ChefId","LineCookId","ServerId","CustomerId","Customer Name","No: Persons","TableId","OrderId","OrderDetails Details","Bill","Feedback","Status"};
    final String[] hideCols = {"HostId","BusBoyID","ManagerId","ChefId","LineCookId","ServerId","No: Persons","OrderDetails Details","Bill","Feedback","Status"};
    final DefaultTableModel model = new DefaultTableModel(rowData, columnNames);
    ExportJTable export = new ExportJTable();

    /**
     * Creates new form HostLogin
     */
    public HostLogin() throws IOException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        employeeIDLabel = new javax.swing.JLabel();
        hostLoginPanel = new javax.swing.JLayeredPane();
        NameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        numberTextField = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        contactTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        tableComboBox = new javax.swing.JComboBox<>();
        tableLabel = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        empIDLabel = new javax.swing.JLabel();
        employeeNameLabel = new javax.swing.JLabel();
        empNameLabel = new javax.swing.JLabel();
        submittedPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        submittedTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeeIDLabel.setText("Emplooyee ID:");

        hostLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        NameLabel.setText("Name");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        numberLabel.setText("No: of Persons");


        contactLabel.setText("Contact Details");


        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        tableComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tableLabel.setText("Choose Table");

        bookButton.setText("Book Table");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        hostLoginPanel.setLayer(NameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(nameTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(numberLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(numberTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(contactLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(contactTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(cancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(tableComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(tableLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hostLoginPanel.setLayer(bookButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout hostLoginPanelLayout = new javax.swing.GroupLayout(hostLoginPanel);
        hostLoginPanel.setLayout(hostLoginPanelLayout);
        hostLoginPanelLayout.setHorizontalGroup(
            hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostLoginPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hostLoginPanelLayout.createSequentialGroup()
                        .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hostLoginPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hostLoginPanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(numberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                    .addGroup(hostLoginPanelLayout.createSequentialGroup()
                        .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hostLoginPanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(contactTextField))
                            .addGroup(hostLoginPanelLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(tableComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(140, 140, 140))
            .addGroup(hostLoginPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(bookButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(31, 31, 31))
        );
        hostLoginPanelLayout.setVerticalGroup(
            hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostLoginPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(hostLoginPanelLayout.createSequentialGroup()
                        .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(hostLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookButton)
                    .addComponent(cancelButton))
                .addGap(10, 10, 10))
        );

        logOutButton.setBackground(new java.awt.Color(0, 0, 0));
        logOutButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(153, 153, 153));
        logOutButton.setText("LogOut");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        empIDLabel.setText(" ");

        employeeNameLabel.setText("Emplooyee Name:");

        empNameLabel.setText(" ");

        submittedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Submissions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        submittedTable.setModel(model);
        jScrollPane2.setViewportView(submittedTable);
        hideColumn(submittedTable,hideCols);

        javax.swing.GroupLayout submittedPanelLayout = new javax.swing.GroupLayout(submittedPanel);
        submittedPanel.setLayout(submittedPanelLayout);
        submittedPanelLayout.setHorizontalGroup(
            submittedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submittedPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        submittedPanelLayout.setVerticalGroup(
            submittedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submittedPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(employeeIDLabel)
                                        .addGap(21, 21, 21))
                                    .addComponent(employeeNameLabel, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(hostLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(submittedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hostLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(submittedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void hostDetails(){
//        Login l = new Login();
//        String userId = l.Vikas.get(0);
//        String userName = l.Vikas.get(1);
//        empIDLabel.setText(userId);
//        empNameLabel.setText(userName);
//    }

    private void hideColumn(JTable table, String[] cols) {
        for (String col : cols) {
            //table.removeColumn(table.getColumn(col));
            table.getColumn(col).setPreferredWidth(0);
            table.getColumn(col).setMinWidth(0);
            table.getColumn(col).setWidth(0);
            table.getColumn(col).setMaxWidth(0);
        }
    }
    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
        Object[] row = {"HostId", "","", "", "", "", "1234", nameTextField.getText(), numberTextField.getText(), tableComboBox.getSelectedItem(), "123", contactTextField.getText(), "Bill", "Feedback", "Progress"};
        model.addRow(row);
        //hideColumn(submittedTable,hideCols);
        submittedTable.setModel(model);
        export.exportJtable(submittedTable,"OrderDetails.csv");
    //export
    }//GEN-LAST:event_bookButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login l = new Login();
        JOptionPane.showMessageDialog(this, "Successfully Logged Out");
        l.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HostLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HostLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HostLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HostLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new HostLogin().setVisible(true);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel empIDLabel;
    private javax.swing.JLabel empNameLabel;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JLabel employeeNameLabel;
    private javax.swing.JLayeredPane hostLoginPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JPanel submittedPanel;
    private javax.swing.JTable submittedTable;
    private javax.swing.JComboBox<String> tableComboBox;
    private javax.swing.JLabel tableLabel;
    // End of variables declaration//GEN-END:variables
}