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
import Business.Roles.CommunityOutreachRole;
import Business.Roles.DonorRole;
import Business.Roles.DriverRole;
import Business.Roles.NutritionistRole;
import Business.Roles.SupervisorRole;
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
        network.setCountry("United States of America");
        network.setState("Massachusetts");
        network.setCity("Boston");
        
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("BostonSchool", Enterprise.EnterpriseType.School);
        person = enterprise.getPersonDirectory().addPerson();
        person.setFirstName("SchoolFirstName");
        person.setLastName("SchoolLastName");
        person.setName();
        UserAccount account = business.getUserAccountDirectory().addUserAccount("bsc", "bsc1#", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Volunteer);
        
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Transport);
        person = organization.getPersonDirectory().addPerson();   
        person.setFirstName("Driver");
        person.setLastName("Transpport");
        person.setName();
        account = organization.getUserAccountDirectory().addUserAccount("dr1", "dr1#", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
        // AlohaHelp
        enterprise = network.getEnterpriseDirectory().addEnterprise("MealShare", Enterprise.EnterpriseType.MealShare);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("MealShare Admin");
        person.setName();
        account = enterprise.getUserAccountDirectory().addUserAccount("bhh", "bhh", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.HelpSeeker);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Supervisor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Supervisor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bsup", "bsup", person, new SupervisorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Non Profit
        enterprise = network.getEnterpriseDirectory().addEnterprise("NonProfit", Enterprise.EnterpriseType.NGO);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("non proft Admin");
        person.setName();
        account = enterprise.getUserAccountDirectory().addUserAccount("bno", "bno1#", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Donor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Donor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bdon", "bdon", person, new DonorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
        // Hospital
        enterprise = network.getEnterpriseDirectory().addEnterprise("Hospital", Enterprise.EnterpriseType.Hospital);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("hospital Admin");
        person.setName();
        account = enterprise.getUserAccountDirectory().addUserAccount("bho", "bho", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Nutritionist);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Doctor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bdoc", "bdoc", person, new NutritionistRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Govt
        enterprise = network.getEnterpriseDirectory().addEnterprise("Govt", Enterprise.EnterpriseType.Government);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("Govt Admin Admin");
        person.setName();
        account = enterprise.getUserAccountDirectory().addUserAccount("bgt", "bgt", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.CommunityOutreach);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("mayor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bmay", "bmay", person, new CommunityOutreachRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        return business;
    }
    
}
