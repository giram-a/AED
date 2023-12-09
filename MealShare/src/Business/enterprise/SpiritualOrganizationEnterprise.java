/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.enterprise;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class SpiritualOrganizationEnterprise extends Enterprise{
     public SpiritualOrganizationEnterprise(String name) {
        super(name, EnterpriseType.SpiritualOrganization);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
