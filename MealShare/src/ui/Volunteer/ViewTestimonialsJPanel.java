/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Volunteer;

import Business.Business;
import Business.Common.Meal;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WrokQueue.NeedMealWorkRequest;
import Business.WrokQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samar
 */
public class ViewTestimonialsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Business business;
    Enterprise enterprise;
    Organization organization;

    /**
     * Creates new form ViewTestimonialsJPanel
     */
    public ViewTestimonialsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        populateTableData();
        this.setBackground(new java.awt.Color(102, 153, 255));

    }

    private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel) tblViewMeals.getModel();
        model.setRowCount(0);
        for (WorkRequest w : account.getWorkQueue().getWorkRequestList()) {
            Object row[] = new Object[4];
            if (w instanceof NeedMealWorkRequest) {
                NeedMealWorkRequest need = (NeedMealWorkRequest) w;
                Meal meal = need.getMeal();
                if (need == null || meal == null) {
                } else {
                    if (meal.getCarbs() != null && meal.getProtein() != null && meal.getCalories() != null && meal.getVolunteerReqSent()) {
                        if (need.getReceiver() == null || need.getReceiver().equals(account)) {
                            if (need.getStatus().equals("Approved")) {
                                row[0] = meal.getMeal();
                                row[1] = meal.getDate();
                                row[2] = need.getStatus();
                                row[3] = meal.getMealFeedback();
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
        if (!(model.getRowCount() > 0)) {
            JOptionPane.showMessageDialog(null, "No Meal Assigned to you", "Information", JOptionPane.INFORMATION_MESSAGE);
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

        lblViewTestimonials = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewMeals = new javax.swing.JTable();

        lblViewTestimonials.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lblViewTestimonials.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewTestimonials.setText("View Testimonials");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblViewMeals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal Content", "Date", "Status", "Feedback"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewMeals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblViewTestimonials, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblViewTestimonials)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        VolunteerWorkAreaJPanel volunteerWorkAreaJPanel = new VolunteerWorkAreaJPanel(userProcessContainer, account, enterprise, organization, business);
        this.business.redirection(userProcessContainer, volunteerWorkAreaJPanel.getClass().getName(), volunteerWorkAreaJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewTestimonials;
    private javax.swing.JTable tblViewMeals;
    // End of variables declaration//GEN-END:variables
}
