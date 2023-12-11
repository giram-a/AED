/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import ui.Volunteer.VolunteerWorkAreaJPanel;

/**
 *
 * @author aniketgiram
 */
public class VolunteerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, Business business) {
        return new VolunteerWorkAreaJPanel(userProcessContainer, account, enterprise,organization, business);
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
