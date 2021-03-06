package com.rubicon.rms.orders;

import com.opencsv.CSVReader;
import com.rubicon.rms.admin.OrderOperation;
import com.rubicon.rms.admin.RestaurantManagement;

import javax.swing.*;
import java.io.*;
import java.util.List;

/**
 *
 * @author P. Sreeja-VJIT
 */
public class BillManagement extends javax.swing.JFrame {

    private List<String[]> importCSV(String fileName, String cols) throws IOException {
        File file= new File(fileName);
        PrintWriter pw = null;
        if (!file.exists()){
            file.createNewFile();
            pw = new PrintWriter(new FileOutputStream(fileName));
            pw.println(cols);
            System.out.println("File Created " + file.getPath());
            pw.flush();
            pw.close();
        }
        CSVReader reader = new CSVReader(new FileReader(fileName), ',', '\'', 1);
        return reader.readAll();
    }

    private CalculateTotal it ;
    private OrderDetails o;
    private TotalBil t;
    private String name;
    private String quantity ;
    private double totalPrice=0;
    private double sum=0;

    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public String getQuantity() {
        return quantity;
    }


    /**
     * Creates new form BillManagement
     */
    public BillManagement() throws IOException {
        initComponents();


        display();
        performFileRelatedTask();
    }
    private void display() throws IOException {
        t = new TotalBil();
        it = new CalculateTotal();
        menuTextArea.setText(t.getFullNames().toString());

        totalPriceArea.setText(it.getTotal());

    }
    private void performFileRelatedTask()
    {
        try {
            o = new OrderDetails();
        } catch (IOException e) {
            e.printStackTrace();
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

        billPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTextArea = new javax.swing.JTextArea();
        totalPriceArea = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));

        billPanel.setBackground(new java.awt.Color(102, 102, 102));

        menuTextArea.setEditable(false);
        menuTextArea.setBackground(new java.awt.Color(153, 153, 153));
        menuTextArea.setColumns(20);
        menuTextArea.setRows(5);
        jScrollPane1.setViewportView(menuTextArea);

        totalPriceArea.setEditable(false);
        totalPriceArea.setBackground(new java.awt.Color(153, 153, 153));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    backButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        paymentButton.setText("Payment");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    paymentButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billPanelLayout = new javax.swing.GroupLayout(billPanel);
        billPanel.setLayout(billPanelLayout);
        billPanelLayout.setHorizontalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalPriceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(billPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(printButton)
                        .addGap(18, 18, 18)
                        .addComponent(paymentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        billPanelLayout.setVerticalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalPriceArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentButton)
                    .addComponent(backButton)
                    .addComponent(printButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(billPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(billPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        OrderOperation om = new OrderOperation();
        om.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_paymentButtonActionPerformed
        // TODO add your handling code here:
        o.delete();
        t = new TotalBil();

        RestaurantManagement rm = new RestaurantManagement();
        rm.setVisible(true);
        this.dispose();
        try {
            PrintWriter pw1 = new PrintWriter(new FileOutputStream("temp.txt"));
            PrintWriter pw2 = new PrintWriter(new FileOutputStream("Order.csv"));
            PrintWriter pw3 = new PrintWriter(new FileOutputStream("TotalBill.csv",true));
            pw3.println(t.getFullNames()+"\t");



            pw1.close();;
            pw2.close();
            pw3.close();
        } catch (Exception ignored) {
        }
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        try {

            boolean complete = menuTextArea.print();
            if(complete){

                JOptionPane.showMessageDialog(null, "Done printing");
            }
            else{
                JOptionPane.showMessageDialog(null, "Printing cancel","Printer",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel billPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea menuTextArea;
    private javax.swing.JButton paymentButton;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField totalPriceArea;
    // End of variables declaration//GEN-END:variables
}