/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.HelpSeekerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class HelpSeekerOrganization extends Organization{
    public HelpSeekerOrganization() {
        super(Type.HelpSeeker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HelpSeekerRole());
        return roles;
    }
}
