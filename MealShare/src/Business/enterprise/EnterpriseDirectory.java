/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class EnterpriseDirectory {
    
    private final ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<>();
    }
    
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type)
    {
        Enterprise enterprise = null;
        if(null != type)
        switch (type) {
            case MealShare -> {
                enterprise = new MealShare(name);     
                enterpriseList.add(enterprise);
            }
            case Government -> {
                enterprise = new GovernmentEnterprise(name);
                enterpriseList.add(enterprise);
            }
            case NGO -> {
                enterprise = new NGOEnterprise(name);
                enterpriseList.add(enterprise);
            }
            case School -> {
                enterprise = new SchoolEnterprise(name);
                enterpriseList.add(enterprise);
            }
            case SpiritualOrganization -> {
                enterprise = new SpiritualOrganizationEnterprise(name);
                enterpriseList.add(enterprise);
            }
            default -> {
            }
        }

      return enterprise;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void deleteEnterprise(Enterprise enterprise)
    {
        enterpriseList.remove(enterprise);
    }
}
