/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.DriverRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class TransportOrganization extends Organization{
    public TransportOrganization() {
        super(Type.Transport.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DriverRole());
        return roles;
    }
}
