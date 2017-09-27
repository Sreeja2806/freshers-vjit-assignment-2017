/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubicon.rms.system;

import com.opencsv.CSVReader;
import com.rubicon.rms.admin.RestaurantManagement;
import com.rubicon.rms.logins.BusBoyLogin;
import com.rubicon.rms.logins.ChefLogin;
import com.rubicon.rms.logins.HostLogin;
import com.rubicon.rms.logins.LineCookLogin;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pakeeru Sreeja
 */
public class Login extends javax.swing.JFrame {

    /**
     * Intializes new form LogIn
     */
    public Login() {
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

        restaurantPanel = new javax.swing.JPanel();
        unameLabel = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        passwdLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        exitLabel = new javax.swing.JLabel();
        RMSPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant Management System - RMS");
        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(700, 500));

        restaurantPanel.setBackground(new java.awt.Color(153, 153, 153));
        restaurantPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My-Village Restaurant", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe Print", 2, 24))); // NOI18N
        restaurantPanel.setForeground(new java.awt.Color(153, 153, 153));
        restaurantPanel.setToolTipText("");
        restaurantPanel.setName(""); // NOI18N
        restaurantPanel.setPreferredSize(new java.awt.Dimension(600, 350));

        unameLabel.setBackground(new java.awt.Color(255, 153, 153));
        unameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unameLabel.setText("User Name: ");

        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameKeyPressed(evt);
            }
        });

        passwdLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwdLabel.setText("Password :");

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(153, 153, 153));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(153, 153, 153));
        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    loginButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitLabel.setText("Click on Exit to close Application");

        javax.swing.GroupLayout restaurantPanelLayout = new javax.swing.GroupLayout(restaurantPanel);
        restaurantPanel.setLayout(restaurantPanelLayout);
        restaurantPanelLayout.setHorizontalGroup(
            restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restaurantPanelLayout.createSequentialGroup()
                .addGroup(restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(restaurantPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(restaurantPanelLayout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addGroup(restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(restaurantPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exitLabel)
                                .addGap(18, 18, 18)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(restaurantPanelLayout.createSequentialGroup()
                                .addGroup(restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(password))))))
                .addGap(187, 187, 187))
        );
        restaurantPanelLayout.setVerticalGroup(
            restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(restaurantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        RMSPanel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        RMSPanel.setText("Restaurant Management System - RMS  (Developed by Pakeeru Sreeja) VJIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(restaurantPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(RMSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RMSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restaurantPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        restaurantPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:

        String sa_user = "Sreeja";
        String sa_pwd = "Sreeja123$";
        List<String> userInfo = userType(userName.getText(), "Employee.csv");
        if (userName.getText().equalsIgnoreCase(sa_user) && new String(password.getPassword()).equals(sa_pwd)) {
            JOptionPane.showMessageDialog(this, "Access Granted" + "\nWelcome '" + userName.getText() + "'");
            this.dispose();
            RestaurantManagement rm = new RestaurantManagement();
            rm.setVisible(true);
        }
        else if (userInfo.size() == 2) {
            String userType = userInfo.get(0);
            String pwd = userInfo.get(1);
            if (new String(password.getPassword()).equals(pwd)) {
                if (userType.equalsIgnoreCase("Host")) {
                    JOptionPane.showMessageDialog(this, "Access Granted" + "\nWelcome '" + userName.getText() + "'");
                    this.dispose();
                    HostLogin rm = new HostLogin();
                    rm.setVisible(true);
                } else if (userType.equalsIgnoreCase("Boy")) {
                    JOptionPane.showMessageDialog(this, "Access Granted" + "\nWelcome '" + userName.getText() + "'");
                    this.dispose();
                    BusBoyLogin rm = new BusBoyLogin();
                    rm.setVisible(true);
                } else if (userType.equalsIgnoreCase("Chef")) {
                    JOptionPane.showMessageDialog(this, "Access Granted" + "\nWelcome '" + userName.getText() + "'");
                    this.dispose();
                    ChefLogin rm = new ChefLogin();
                    rm.setVisible(true);
                } else if (userType.equalsIgnoreCase("Line-Cook")) {
                    JOptionPane.showMessageDialog(this, "Access Granted" + "\nWelcome '" + userName.getText() + "'");
                    this.dispose();
                    LineCookLogin rm = new LineCookLogin();
                    rm.setVisible(true);
                }
            }
//            else if (userType.equalsIgnoreCase("Server")) {
//                JOptionPane.showMessageDialog(this, "Access Granted" + "\nWelcome '" + userName.getText() + "'");
//                this.dispose();
//                ServerBoyLogin rm = new ServerBoyLogin();
//                rm.setVisible(true);
//            }
            else {
                JOptionPane.showMessageDialog(this, userName.getText() + " Invalid Password");
            }
        }
        else {
//            userName.setText("");
//            password.setText("");
            if (userName.getText().equalsIgnoreCase(sa_user)) {
                JOptionPane.showMessageDialog(this, "UserID "+userName.getText() + " Access Denied");
            } else {
                JOptionPane.showMessageDialog(this, userName.getText() + " Access Denied" + "\n" + userName.getText() + " User Does not exists");
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private List<String> userType(String empid, String filename) throws IOException {
        List<String> l = new ArrayList<>();
        if (!new File(filename).exists()){
            return l;
        }
        CSVReader reader = new CSVReader(new FileReader(filename), ',');
        List<String[]> myEntries = reader.readAll();
        reader.close();
        for (int row = 0; row< myEntries.size(); row++){
            if (myEntries.get(row)[0].trim().equalsIgnoreCase(empid)){
                l = Arrays.asList(myEntries.get(row)[2], myEntries.get(row)[3]);
            }
        }
        return l;
    }



    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Thank You For choosing RMS");
        System.exit(0);

    }//GEN-LAST:event_exitButtonActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            loginButton.doClick();
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void userNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            password.requestFocus();
        }
    }//GEN-LAST:event_userNameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RMSPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwdLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel restaurantPanel;
    private javax.swing.JLabel unameLabel;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
