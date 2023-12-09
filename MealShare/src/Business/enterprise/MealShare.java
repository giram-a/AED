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
public class MealShare extends Enterprise{
    
    @Override
    public ArrayList<Role> getSupportedRole() {
      return null;
    }
    
    public MealShare(String name)
    {
     super(name, Enterprise.EnterpriseType.MealShare);  
    }
    
}
