/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Common.Meal;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public abstract class Enterprise extends Organization{
    
    private String enterpId;
    private static int count = 1;
    private OrganizationDirectory orgDirect;
    private EnterpriseType enterptyp;
    private ArrayList<Meal> meals;
    
    
    public Enterprise(String enterpriseName, EnterpriseType enterptyp)
    {
        super(enterpriseName);
        this.enterptyp = enterptyp;
        orgDirect = new OrganizationDirectory();
        meals = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        sb.append("ENT");
        sb.append(count);
        enterpId = sb.toString();
        count++;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    public Meal addMeal(){
        Meal m = new Meal();
        this.meals.add(m);
        return m;
    }
    
    public ArrayList<Meal> getMeals(){
        return this.meals;
    }
    
    public enum EnterpriseType{
        
       School("School"),
       MealShare("MealShare"),
       NGO("NGO"),
       Government("Government"),
       Hospital("Hospital");
    
       
       final private String value;
       
       private EnterpriseType(String value)
       {
         this.value = value;  
       }

        public String getValue() {
            return value;
        }
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return orgDirect;
    }

    public EnterpriseType getEnterpriseType() {
        return enterptyp;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
