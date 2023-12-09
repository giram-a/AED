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

/**
 *
 * @author aniketgiram
 */
public class NutritionistRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, Business business) {
//        return new DonorWorkAreaJPanel(userProcessContainer, account, enterprise,organization, business);
        return null;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
