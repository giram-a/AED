/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.SystemAdmin.AdminJPanel;

/**
 *
 * @author aniketgiram
 */
public class SystemAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, Business business) {
        return new AdminJPanel(userProcessContainer, account, enterprise,organization, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
