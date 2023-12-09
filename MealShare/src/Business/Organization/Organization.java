/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Roles.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WrokQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public abstract class Organization {
    
    private String name;
    private UserAccountDirectory userAcDirect;
    private PersonDirectory personDirect;
    private WorkQueue workQ;
    private int orgId;
    private static int counter = 000;

    public Organization(String name) {
        this.name = name;
        userAcDirect = new UserAccountDirectory();
        personDirect = new PersonDirectory();
        workQ = new WorkQueue();
        counter++;
        orgId = counter;
    }
    
    public enum Type
    {
        Admin("Admin"),
        Volunteer("Volunteer Organization"),
        HelpSeeker("HelpSeeker Organization"),
        Supervisor("Supervisor Organization"),
        Donor("Donor Organization"),
        Transport("Transport Organization"),
        CommunityOutreach("CommunityOutreach Organization"),
        Nutritionist("Nutritionist Organization");
     
        private String value;
     
        private Type(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public PersonDirectory getPersonDirectory() {
        return personDirect;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAcDirect;
    }

    public WorkQueue getworkQ() {
        return workQ;
    }

    public String getName() {
        return name;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
