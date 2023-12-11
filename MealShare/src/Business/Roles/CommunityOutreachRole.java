/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import ui.CommunityOutreach.CommunityOutReach;

/**
 *
 * @author aniketgiram
 */
public class CommunityOutreachRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, Business business) {
        try {
            return new CommunityOutReach(userProcessContainer, account, enterprise,organization, business);
        } catch (Exception ex) {
            Logger.getLogger(CommunityOutreachRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
