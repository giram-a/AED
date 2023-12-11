/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Donor;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aishwarya Dhandore
 */
public class ViewUpdateProfile extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    Organization organization;
    Business business;
    Person p;

    /**
     * Creates new form ViewUpdateProfile
     */
    public ViewUpdateProfile(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        p = account.getPerson();
        setData();
        this.setBackground(new java.awt.Color(102, 153, 255));
    }

    private void setData() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        txtName.setText(p.getName());
        txtDoB.setText(p.getDob() != null ? dateFormat.format(p.getDob()) : "");
        txtAddress.setText(p.getAddress1() + " " + p.getAddress2());
        txtEmailId.setText(p.getEmailId());
        txtCity.setText(p.getTown());
        txtZipCode.setText(p.getZipCode());
        txtContactNumber.setText(p.getPhoneNumber());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewUpdateProfile = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblDoB = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        btnUpdateProfile = new javax.swing.JButton();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDoB = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        lblViewUpdateProfile.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        lblViewUpdateProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewUpdateProfile.setText("View and Update my Profile");

        lblName.setText("Enter your Name :");

        lblDoB.setText("Enter Date of Birth :");

        lblAddress.setText("Enter address :");

        lblEmailID.setText("Enter Email ID :");

        lblCity.setText("City :");

        btnUpdateProfile.setText("Update my Profile");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        lblZipCode.setText("Zip Code :");

        lblContactNo.setText("Contact number :");

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
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblViewUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(253, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addComponent(lblName)
                                                                    .addGap(146, 146, 146))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(lblDoB)
                                                                    .addGap(138, 138, 138)))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblAddress)
                                                                .addGap(164, 164, 164)))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(lblEmailID)
                                                            .addGap(162, 162, 162)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblCity)
                                                        .addGap(215, 215, 215)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblZipCode)
                                                    .addGap(187, 187, 187)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblContactNo)
                                                .addGap(150, 150, 150)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtZipCode)
                                            .addComponent(txtCity)
                                            .addComponent(txtEmailId)
                                            .addComponent(txtAddress)
                                            .addComponent(txtDoB)
                                            .addComponent(txtName)
                                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnUpdateProfile)
                                        .addGap(172, 172, 172)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblViewUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoB)
                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailID)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnUpdateProfile)
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String birth = txtDoB.getText();
        String address = txtAddress.getText();
        String email = txtEmailId.getText();
        String city = txtCity.getText();
        String zipCode = txtZipCode.getText();
        String contactNo = txtContactNumber.getText();

        if (name.equals("") && birth.equals("") && address.equals("") && email.equals("") && city.equals("") && zipCode.equals("") && contactNo.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
            return;
        }

        try {
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            Date dob = dateFormat.parse(birth);
            if (dob.after(date) || dob.equals(date)) {
                JOptionPane.showMessageDialog(null, "Please Enter valid Date of Birth");
                return;
            }
            p.setDob(dateFormat.parse(birth));
            p.setAddress1(address);
            p.setTown(city);
            p.setZipCode(zipCode);
            p.setEmailId(email);
            p.setPhoneNumber(contactNo);

            JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            resetFields();
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, "Please Enter valid date of Birth!");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
        }
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Donor donor = new Donor(userProcessContainer, account, enterprise, organization, business);
        business.redirection(userProcessContainer, donor.getClass().getName(), donor);
    }//GEN-LAST:event_btnBackActionPerformed

    public void resetFields() {
        txtName.setText("");
        txtDoB.setText("");
        txtAddress.setText("");
        txtEmailId.setText("");
        txtCity.setText("");
        txtZipCode.setText("");
        txtContactNumber.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblViewUpdateProfile;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
