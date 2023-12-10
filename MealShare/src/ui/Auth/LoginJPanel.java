/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Auth;

import Business.Business;
import Business.Common.ValidatePassword;
import Business.Common.ValidateStrings;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import com.github.javafaker.Faker;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.InputVerifier;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XChartPanel;

/**
 *
 * @author samar
 */
public class LoginJPanel extends javax.swing.JPanel {
    
    JPanel mainCardLayout;
    Business business;
    
    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel(JPanel MainCardLayout, Business business) {
        initComponents();
        inputVerifier();
        this.business = business;
        this.mainCardLayout = MainCardLayout;
//        Faker faker = new Faker();
//        System.out.println("Name "+ faker.name().username());
//        testChart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblDont = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        testPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();

        lblLogin.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");

        lblUsername.setText("Username");

        lblPassword.setText("Password");

        lblDont.setText("Don't have an account?");

        btnCreateAccount.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout testPanelLayout = new javax.swing.GroupLayout(testPanel);
        testPanel.setLayout(testPanelLayout);
        testPanelLayout.setHorizontalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        testPanelLayout.setVerticalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDont, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAccount)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblLogin)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDont)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateAccount)
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        if (isNullOrEmpty(username)) {
            System.out.println("Username cannot be empty.");
        } else {
            // Check for null or empty password
            if (password == null || password.length() == 0) {
                System.out.println("Password cannot be empty.");
            } else {
                UserAccount userAccount = business.getUserAccountDirectory().authenticateUser(username, password);
                Enterprise inEnterprise = null;
                Organization inOrganization = null;
                if (userAccount == null) {
                    for (Network network : business.getNetworkList()) {
                        //Step 2-a: Check against each enterprise
                        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                            userAccount = enterprise.getUserAccountDirectory().authenticateUser(username, password);
                            if (userAccount == null ) {
                                //Step3: Check against each organization inside that enterprise
                                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                    userAccount = organization.getUserAccountDirectory().authenticateUser(username, password);
                                    if (userAccount != null ) {
                                        inEnterprise = enterprise;
                                        inOrganization = organization;
                                        break;
                                    }
                                }
                            } else {
                                inEnterprise = enterprise;
                                break;
                            }
                            if (inOrganization != null) {
                                break;
                            }
                        }
                        if (inEnterprise != null) {
                            break;
                        }
                    }
                }
        
                if (userAccount == null) {
                    System.out.println("null");
                    JOptionPane.showMessageDialog(null, "Invalid Credentails!");
                } 
                else {
                    JPanel panel = userAccount.getRole().createWorkArea(mainCardLayout, userAccount, inOrganization, inEnterprise, business);
                    business.redirection(mainCardLayout, panel.getClass().getName(), panel);
                }
        
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        CreateAccountJPanel createAccountJPanel = new CreateAccountJPanel(mainCardLayout, business);
        business.redirection(mainCardLayout, createAccountJPanel.getClass().getName(), createAccountJPanel);
    }//GEN-LAST:event_btnCreateAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblDont;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel testPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void inputVerifier() {
        InputVerifier stringValidation = new ValidateStrings();
        txtUsername.setInputVerifier(stringValidation);
        
        InputVerifier passwordValidation = new ValidatePassword();
        txtPassword.setInputVerifier(passwordValidation);
    }
    
    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    private void testChart() {
        // Create Chart
        PieChart chart = new PieChartBuilder().width(400).height(400).title("Aniket").build();

        // Customize Chart
        Color[] sliceColors = new Color[] { new Color(224, 68, 14), new Color(230, 105, 62), new Color(236, 143, 110), new Color(243, 180, 159), new Color(246, 199, 182) };
        chart.getStyler().setSeriesColors(sliceColors);

        // Series
        chart.addSeries("Gold", 24);
        chart.addSeries("Silver", 21);
        chart.addSeries("Platinum", 39);
        chart.addSeries("Copper", 17);
        chart.addSeries("Zinc", 40);
        
        testPanel.setLayout(new FlowLayout()); 
        testPanel.setPreferredSize(new Dimension(400, 400));
        testPanel.add(new XChartPanel(chart));
//        testPanel.repaint();
    }
}
