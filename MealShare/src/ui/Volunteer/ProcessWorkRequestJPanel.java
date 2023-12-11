/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Volunteer;

import Business.Business;
import Business.Common.Meal;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Roles.DriverRole;
import Business.Roles.NutritionistRole;
import Business.UserAccount.UserAccount;
import Business.WrokQueue.NeedMealWorkRequest;
import Business.WrokQueue.TransportWorkRequest;
import Business.WrokQueue.WorkRequest;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author samar
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    Business business;
    Enterprise enterprise;
    Organization organization;
    NeedMealWorkRequest need;
    HashMap<Integer, UserAccount> userAccountMap;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Organization organization, Business business, NeedMealWorkRequest needWorkReq) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.need = needWorkReq;
        userAccountMap = new HashMap<>();
        needWorkRequestFor.setText(this.need.getMeal().getMeal());
        populateDriverCombo();
        this.setBackground(new java.awt.Color(102, 153, 255));
    }

    private void populateDriverCombo(){
        int index = 1;
        cbAssignDriver.removeAllItems();
        cbAssignDriver.addItem("Please select a Driver");
        for (Network n : business.getNetworkList()){
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getEnterpriseType().equals(e.getEnterpriseType().School)){
                    for(Organization o:  e.getOrganizationDirectory().getOrganizationList()){
                        for(UserAccount u: o.getUserAccountDirectory().getUserAccountList()){
                            if(u.getRole() instanceof DriverRole && organization.equals(o)){
                                cbAssignDriver.addItem(u.getPerson().getName());
                                userAccountMap.put(index++, u);
                            }
                        }
                    }
                }
            }
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

        lblProcessWorkRequest = new javax.swing.JLabel();
        lblHelpRequest = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        lblNeedTransport = new javax.swing.JLabel();
        cbAssignDriver = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnSubmitResult = new javax.swing.JButton();
        needWorkRequestFor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();

        lblProcessWorkRequest.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lblProcessWorkRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcessWorkRequest.setText("Process Work Request");

        lblHelpRequest.setText("Help Request:");

        lblComments.setText("Comments:");

        lblNeedTransport.setText("Assign Driver");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmitResult.setText("Submit Result");
        btnSubmitResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitResultActionPerformed(evt);
            }
        });

        needWorkRequestFor.setEditable(false);

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane1.setViewportView(txtComments);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProcessWorkRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHelpRequest)
                            .addComponent(lblComments)
                            .addComponent(lblNeedTransport))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                                .addComponent(btnSubmitResult))
                            .addComponent(cbAssignDriver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(needWorkRequestFor)
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblProcessWorkRequest)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHelpRequest)
                    .addComponent(needWorkRequestFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComments)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNeedTransport)
                    .addComponent(cbAssignDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSubmitResult))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitResultActionPerformed
        // TODO add your handling code here:
        String comments = txtComments.getText();
        if(comments.equals("")){
            JOptionPane.showMessageDialog(null, "Please provide comment", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int driverIndex = (int) cbAssignDriver.getSelectedIndex();
        UserAccount user = userAccountMap.get(driverIndex);
        TransportWorkRequest transportWorkRequest = new TransportWorkRequest();
        transportWorkRequest.setMeal(need.getMeal());
        transportWorkRequest.setMessage("Request Sent to Driver");
        transportWorkRequest.setReceiver(user);
        transportWorkRequest.setTransReqResult("Sent");
        transportWorkRequest.setComment(comments);
        transportWorkRequest.getMeal().getVolunteerNeedRequest().setComments("Request Forwarded to Driver");
        need.getMeal().setTransportReqSent(Boolean.TRUE);
        need.getMeal().setTransportWorkRequest(transportWorkRequest);
        user.getWorkQueue().getWorkRequestList().add(transportWorkRequest);
        JOptionPane.showMessageDialog(null, "Request Sent to Driver Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSubmitResultActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        VolunteerWorkAreaJPanel volunteerWorkAreaJPanel = new VolunteerWorkAreaJPanel(userProcessContainer, account, enterprise, organization, business);
        business.redirection(userProcessContainer, volunteerWorkAreaJPanel.getClass().getName(), volunteerWorkAreaJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitResult;
    private javax.swing.JComboBox<String> cbAssignDriver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblHelpRequest;
    private javax.swing.JLabel lblNeedTransport;
    private javax.swing.JLabel lblProcessWorkRequest;
    private javax.swing.JTextField needWorkRequestFor;
    private javax.swing.JTextArea txtComments;
    // End of variables declaration//GEN-END:variables
}
