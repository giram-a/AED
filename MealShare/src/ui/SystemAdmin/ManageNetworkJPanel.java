/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samar
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    Organization organization;
    Business business;
    
    /**
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        populateNetworkTable();
        this.setBackground(new java.awt.Color(102, 153, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageNetwork = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAddNewNetwork = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        cbCountry = new javax.swing.JComboBox<>();
        cbState = new javax.swing.JComboBox<>();
        cbCity = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblManageNetwork.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lblManageNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageNetwork.setText("Manage Network");

        lblAddNewNetwork.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblAddNewNetwork.setText("Add New Network");

        lblCountry.setText("Country:");

        lblState.setText("State:");

        lblCity.setText("City:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        cbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "United States of America" }));

        cbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "California", "Massachusetts", "Texas", "Florida", "Ohio", "Georgia" }));
        cbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStateActionPerformed(evt);
            }
        });

        cbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "San Francisco", "Los Angeles" }));
        cbCity.setEnabled(false);

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "State", "City"
            }
        ));
        jScrollPane1.setViewportView(tblNetwork);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(349, 349, 349)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDelete)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddNewNetwork)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblState)
                                                .addComponent(lblCountry)
                                                .addComponent(lblCity))
                                            .addGap(48, 48, 48)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cbCountry, 0, 190, Short.MAX_VALUE)
                                                .addComponent(cbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(81, 81, 81)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnBack)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblManageNetwork)
                .addGap(18, 18, 18)
                .addComponent(lblAddNewNetwork)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCountry)
                            .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblState))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCity))
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd)
                                .addGap(189, 189, 189))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(cbState.getSelectedIndex()<0 ||
                cbCity.getSelectedIndex() <0)
        {
            JOptionPane.showMessageDialog(null, "Please select all the values", "warning",JOptionPane.WARNING_MESSAGE);
            return;
           }
        else
        {
        
        String country = (String) cbCountry.getSelectedItem();
        String state = (String) cbState.getSelectedItem();
        String city = (String) cbCity.getSelectedItem();
        if(!business.getNetworkList().isEmpty())
        {
         for(Network network : business.getNetworkList())
         {
             if(city.equals(network.getCity()))
             {
                JOptionPane.showMessageDialog(null, "Network already exists! ", "warning",JOptionPane.WARNING_MESSAGE);
                return;      
             }
         }
        }
       
        Network network = business.addNetwork();
      
        network.setCountry(country);
        network.setState(state);
        network.setCity(city);

        populateNetworkTable();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStateActionPerformed
        // TODO add your handling code here:
        cbCity.removeAllItems();
        cbCity.enable(true);
        if(cbState.getSelectedItem() == "California")
        {
            cbCity.addItem("Los Angeles");
            cbCity.addItem("San Francisco");
         }
        else if(cbState.getSelectedItem() == "Massachusetts")
        {
            cbCity.addItem("Boston");
            cbCity.addItem("Cambridge");    
        }
        else if(cbState.getSelectedItem() == "Texas")
        {
            cbCity.addItem("Houston");
        }
        else if(cbState.getSelectedItem() == "Florida")
        {
            cbCity.addItem("Miami");
            cbCity.addItem("Orlando");    
        }
        else if(cbState.getSelectedItem() == "Ohio")
        {
            cbCity.addItem("Columbus");
            cbCity.addItem("Cleveland");    
        }
        else if(cbState.getSelectedItem() == "Georgia")
        {
            cbCity.addItem("Atlanta");
            cbCity.addItem("Savannah");    
        }
    }//GEN-LAST:event_cbStateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNetwork.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the row ", "warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Network network = (Network) tblNetwork.getValueAt(selectedRow, 2);
                business.deleteNetwork(network);
                populateNetworkTable();
               
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a row", "warning",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminJPanel adminJPanel = new AdminJPanel(userProcessContainer, account, enterprise, organization, business);
        business.redirection(userProcessContainer, adminJPanel.getClass().getName(), adminJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateNetworkTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblNetwork.getModel();
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            Object[] row = new Object[3];
            row[0] = network.getCountry();
            row[1] = network.getState();
            row[2] = network;
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cbCity;
    private javax.swing.JComboBox<String> cbCountry;
    private javax.swing.JComboBox<String> cbState;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddNewNetwork;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblManageNetwork;
    private javax.swing.JLabel lblState;
    private javax.swing.JTable tblNetwork;
    // End of variables declaration//GEN-END:variables
}
