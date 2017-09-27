/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubicon.rms.admin;

import com.opencsv.CSVReader;

//import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.rubicon.rms.system.Login;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author P Sreeja
 */
public class EmployeeOperation extends javax.swing.JFrame {
    //Import CSV to Table
    private List<String[]> importCSV(String fileName) throws IOException {
        File file= new File(fileName);
        PrintWriter pw = null;
        if (!file.exists()){
            file.createNewFile();
            pw = new PrintWriter(new FileOutputStream(fileName));
            pw.println("ID,Name,EmployeeType,Password,Salary");
            System.out.println("Emlooyee File Created " + file.getPath());
            pw.flush();
            pw.close();
        }
        CSVReader reader = new CSVReader(new FileReader(fileName), ',', '\'', 1);
        List<String[]> myEntries = reader.readAll();
        return myEntries;
    }

    String[][] rowData =  importCSV("Employee.csv").toArray(new String[0][]);
    final String[] columnNames = {"ID", "Name", "EmployeeType","Password","Salary"};
    final DefaultTableModel model = new DefaultTableModel(rowData, columnNames);
    ExportJTable export = new ExportJTable();

    public EmployeeOperation() throws IOException {
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

        jPanel1 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        empTypeLabel = new javax.swing.JLabel();
        delButton = new javax.swing.JButton();
        empTypeComboBox = new javax.swing.JComboBox<>();
        employeeIdText = new javax.swing.JTextField();
        employeeNameText = new javax.swing.JTextField();
        employeeSalText = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        pane = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        entityName = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        empTypeLabel1 = new javax.swing.JLabel();
        defaultPwdCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        addButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    addButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        empTypeLabel.setText("Employement Type");
        empTypeLabel.setToolTipText("");

        delButton.setText("Delete");
        delButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delButtonMouseClicked(evt);
            }
        });
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        empTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Host", "Bus-Boy", "Manager", "Chef" }));
        empTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empTypeComboBoxActionPerformed(evt);
            }
        });

        idLabel.setText("Id");

        salaryLabel.setText("Salary");
        salaryLabel.setToolTipText("");

        nameLabel.setText("Name");

        employeeTable.setModel(model);
        pane.setViewportView(employeeTable);
        hideColumn(employeeTable,"Password");

        entityName.setText("Employee Data");

        backButton.setBackground(new java.awt.Color(153, 153, 153));
        backButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    updateButtonMouseClicked(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(0, 0, 0));
        logOutButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(153, 153, 153));
        logOutButton.setText("LogOut");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        empTypeLabel1.setText("Password Type");
        empTypeLabel1.setToolTipText("");

        defaultPwdCheckBox.setText("Default Password");
        defaultPwdCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultPwdCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empTypeLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(salaryLabel)
                                        .addComponent(idLabel)
                                        .addComponent(nameLabel)
                                        .addComponent(empTypeLabel))
                                    .addGap(63, 63, 63)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(employeeIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(empTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(employeeNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(employeeSalText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(defaultPwdCheckBox)))
                                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(entityName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addButton)
                                        .addGap(67, 67, 67)
                                        .addComponent(updateButton)
                                        .addGap(52, 52, 52)
                                        .addComponent(delButton))))
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(backButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeSalText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryLabel))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empTypeLabel)
                    .addComponent(empTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empTypeLabel1)
                    .addComponent(defaultPwdCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(delButton))
                .addGap(26, 26, 26)
                .addComponent(entityName)
                .addGap(18, 18, 18)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(backButton))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hideColumn(JTable table, String col){
        table.getColumn(col).setPreferredWidth(0);
        table.getColumn(col).setMinWidth(0);
        table.getColumn(col).setWidth(0);
        table.getColumn(col).setMaxWidth(0);
    }
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Object[] row;
        if (defaultPwdCheckBox.isSelected()) {
            row = new Object[]{employeeIdText.getText(), employeeNameText.getText(), empTypeComboBox.getSelectedItem(), empTypeComboBox.getSelectedItem() + "123$", employeeSalText.getText()};
        }
        else {
            row = new Object[]{employeeIdText.getText(), employeeNameText.getText(), empTypeComboBox.getSelectedItem(), "", employeeSalText.getText()};
        }
        model.addRow(row);
        hideColumn(employeeTable, "Password");
        employeeTable.setModel(model);
        export.exportJtable(employeeTable,"Employee.csv");
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        // i = the index of the selected row
        int i = employeeTable.getSelectedRow();
        if(i >= 0 )
        {
            model.setValueAt(employeeIdText.getText(), i, 0);
            model.setValueAt(employeeNameText.getText(), i, 1);
            model.setValueAt(empTypeComboBox.getSelectedItem(), i, 2);
            if (!defaultPwdCheckBox.isSelected()) {
                model.setValueAt("", i, 3);
            }
            else {
                model.setValueAt(empTypeComboBox.getSelectedItem()+"123$", i, 3);
        }
            model.setValueAt(employeeSalText.getText(), i, 4);
        }
        else{
            System.out.println("Update Error");
        }
        export.exportJtable(employeeTable,"Employee.csv");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) throws IOException {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
        // i = the index of the selected row
        int i = employeeTable.getSelectedRow();
        if(i >= 0) {
            model.setValueAt(employeeIdText.getText(), i, 0);
            model.setValueAt(employeeNameText.getText(), i, 1);
            model.setValueAt(empTypeComboBox.getSelectedItem(), i, 2);
            if (!defaultPwdCheckBox.isSelected()) {
                model.setValueAt("", i, 3);
            }
            else if(defaultPwdCheckBox.isSelected()) {
                model.setValueAt(empTypeComboBox.getSelectedItem()+"123$", i, 3);
            }
            model.setValueAt(employeeSalText.getText(), i, 4);
        }
        else {
            System.out.println("Update Error");
        }
        export.exportJtable(employeeTable,"Employee.csv");

    }//GEN-LAST:event_updateButtonMouseClicked

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        // TODO add your handling code here:
        // i = the index of the selected row
        int i = employeeTable.getSelectedRow();
        if(i >= 0){
            // remove a row from jemployeeTable
            model.removeRow(i);
        }
        else{
            System.out.println("Delete Error");
        }
        export.exportJtable(employeeTable,"Employee.csv");
    }//GEN-LAST:event_delButtonActionPerformed

    private void delButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delButtonMouseClicked
        // TODO add your handling code here:
        int[] i = employeeTable.getSelectedRows();
        for (int j : i) {
            if (j >= 0 && j < model.getRowCount()) {
                model.removeRow(j);
            } else {
                System.out.println("Delete Error");
            }
            export.exportJtable(employeeTable, "Employee.csv");
        }
    }//GEN-LAST:event_delButtonMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        RestaurantManagement rm = new RestaurantManagement();
        rm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login l = new Login();
        JOptionPane.showMessageDialog(this, "Successfully Logged Out");
        l.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void empTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empTypeComboBoxActionPerformed

    private void defaultPwdCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultPwdCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defaultPwdCheckBoxActionPerformed


    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//            if ("Nimbus".equals(info.getName())) {
//                try {
//                    UIManager.setLookAndFeel(info.getClassName());
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                } catch (InstantiationException e) {
//                    e.printStackTrace();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (UnsupportedLookAndFeelException e) {
//                    e.printStackTrace();
//                }
//                break;
//            }
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new EmployeeOperation().setVisible(true);
//                } catch (IOException ex) {
//                    Logger.getLogger(EmployeeOperation.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox defaultPwdCheckBox;
    private javax.swing.JButton delButton;
    private javax.swing.JComboBox<String> empTypeComboBox;
    private javax.swing.JLabel empTypeLabel;
    private javax.swing.JLabel empTypeLabel1;
    private javax.swing.JTextField employeeIdText;
    private javax.swing.JTextField employeeNameText;
    private javax.swing.JTextField employeeSalText;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel entityName;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JScrollPane pane;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
