/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Roles.AdminRole;
import Business.Roles.DriverRole;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author aniketgiram
 */
public class ConfigureABusiness {
    
    public static Business configure()
    {
        Business business = Business.getInstance();
        Person person = business.getPersonDirectory().addPerson();
        person.setFirstName("Sys");
        person.setLastName("Admin");
        person.setName();
        
        UserAccount ua = business.getUserAccountDirectory().addUserAccount("sysadmin", "sys1#", person, new SystemAdminRole());
        ua.setEnabled(true);
        
        Network network = business.addNetwork();
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
        
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("BostonSchool", Enterprise.EnterpriseType.School);
        person = enterprise.getPersonDirectory().addPerson();
        person.setFirstName("SchoolFirstName");
        person.setLastName("SchoolLastName");
        person.setName();
        UserAccount account = business.getUserAccountDirectory().addUserAccount("bsc", "bsc", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Volunteer);
        
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Transport);
        person = organization.getPersonDirectory().addPerson();   
        person.setFirstName("Driver");
        person.setLastName("Transpport");
        person.setName();
        account = organization.getUserAccountDirectory().addUserAccount("dr1", "dr1", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        return business;
    }
    
}
