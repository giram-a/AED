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
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Volunteer("Volunteer"),
        Supervisor("Supervisor"),
        HelpSeeker("Help Seeker"),
        Driver("Driver"),
        Mayor("Mayor"),
        AlohaHelpManager("Aloha Help Manager"),
        Doctor("Doctor"),
        Donor("Donor");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Business business);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
