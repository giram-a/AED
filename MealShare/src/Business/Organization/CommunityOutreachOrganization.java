/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.CommunityOutreachRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class CommunityOutreachOrganization extends Organization{
    public CommunityOutreachOrganization() {
        super(Type.CommunityOutreach.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CommunityOutreachRole());
        return roles;
    }
}
