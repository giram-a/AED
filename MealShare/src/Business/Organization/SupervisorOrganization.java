/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.Role;
import Business.Roles.SupervisorRole;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class SupervisorOrganization extends Organization{
    public SupervisorOrganization() {
        super(Type.Supervisor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupervisorRole());
        return roles;
    }
}
