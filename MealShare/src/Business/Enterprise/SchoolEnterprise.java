/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class SchoolEnterprise extends Enterprise{
    
    public SchoolEnterprise(String name) {
        super(name, EnterpriseType.School);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
