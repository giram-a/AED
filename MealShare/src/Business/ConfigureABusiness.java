/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Common.Meal;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Roles.AdminRole;
import Business.Roles.CommunityOutreachRole;
import Business.Roles.DonorRole;
import Business.Roles.DriverRole;
import Business.Roles.HelpSeekerRole;
import Business.Roles.NutritionistRole;
import Business.Roles.SupervisorRole;
import Business.Roles.SystemAdminRole;
import Business.Roles.VolunteerRole;
import Business.UserAccount.UserAccount;
import Business.WrokQueue.MealWorkRequest;
import com.github.javafaker.Faker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author aniketgiram
 */
public class ConfigureABusiness {
    
    public static Business configure()
    {
        Business business = Business.getInstance();
        Person person = business.getPersonDirectory().addPerson();
        person.setFirstName("System");
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
        UserAccount account = business.getUserAccountDirectory().addUserAccount("bsc", "bsc1#", person, new CommunityOutreachRole());
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
        
        account = organization.getUserAccountDirectory().addUserAccount("aa", "a1#", person, new VolunteerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
        // MealShare
        enterprise = network.getEnterpriseDirectory().addEnterprise("MealShare", Enterprise.EnterpriseType.MealShare);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("MealShare Admin");
        person.setName();
        account = enterprise.getUserAccountDirectory().addUserAccount("meal", "meal1#", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.HelpSeeker);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.HelpSeeker);
        person = organization.getPersonDirectory().addPerson();    
        person.setFirstName("Ani");
        person.setLastName("Help");
        person.setName();
        account = organization.getUserAccountDirectory().addUserAccount("help", "help1#", person, new HelpSeekerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Supervisor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Supervisor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("sup", "sup1#", person, new SupervisorRole());
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
        
        account = organization.getUserAccountDirectory().addUserAccount("bdon", "a1#", person, new DonorRole());
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
        
        account = organization.getUserAccountDirectory().addUserAccount("bdoc", "bdoc1#", person, new NutritionistRole());
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
    
    
    public static Business configureByFaker(){
        int n = 2;
        Faker faker = new Faker();
        Business business = configure();
        
        // generating System Admin
        Person person = business.getPersonDirectory().addPerson();
        person.setFirstName("System");
        person.setLastName("Admin");
        person.setName();
        
        UserAccount ua = business.getUserAccountDirectory().addUserAccount("sysadmin", "sys1#", person, new SystemAdminRole());
        ua.setEnabled(true);
        
        Network network = business.addNetwork();
        
        // setting up network
        network.setCountry("United States of America");
        network.setState(faker.address().state());
        network.setCity(faker.address().city());
        
        
        // school enterprise
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise(faker.university().name(), Enterprise.EnterpriseType.School);
        person = enterprise.getPersonDirectory().addPerson();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setName();
        UserAccount account = enterprise.getUserAccountDirectory().addUserAccount("school", "school1#", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Transport);
        
        //adding one common volunteer
        person = enterprise.getPersonDirectory().addPerson();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setName();
        account = organization.getUserAccountDirectory().addUserAccount("volunteer", "a1#", person, new VolunteerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
        // Nutritionist
        Enterprise enterprise4 = network.getEnterpriseDirectory().addEnterprise(faker.university().name(), Enterprise.EnterpriseType.Hospital);
        person = enterprise4.getPersonDirectory().addPerson();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setName();
        UserAccount account5 = enterprise4.getUserAccountDirectory().addUserAccount("hospital", "hospital1#", person, new AdminRole());
        account5.setEnabled(true);
        account5.setNetwork(network);
        
        Organization organization4 = enterprise4.getOrganizationDirectory().addOrganization(Organization.Type.Nutritionist);
//        for(int i=0; i<n; i++){
            person = organization4.getPersonDirectory().addPerson();   
            person.setFirstName(faker.name().firstName());
            person.setLastName(faker.name().lastName());
            person.setName();
            person.setAddress1(faker.address().fullAddress());
            person.setCountry("USA");
            person.setPhoneNumber(faker.phoneNumber().phoneNumber());
            person.setEmailId(faker.internet().emailAddress());
            UserAccount reciever = organization4.getUserAccountDirectory().addUserAccount("nutri", "a1#", person, new NutritionistRole());
            reciever.setNetwork(network);
            reciever.setEnabled(true);
            createMeal(enterprise4, faker, account, reciever);
//        }
        
        for(int i=0; i<n; i++){
            person = organization.getPersonDirectory().addPerson();   
            person.setFirstName(faker.name().firstName());
            person.setLastName(faker.name().lastName());
            person.setName();
            person.setAddress1(faker.address().fullAddress());
            person.setCountry("USA");
            person.setPhoneNumber(faker.phoneNumber().phoneNumber());
            person.setEmailId(faker.internet().emailAddress());
            UserAccount account1 = organization.getUserAccountDirectory().addUserAccount("dr"+i, "dr"+i+"#", person, new DriverRole());
            account1.setNetwork(network);
            account1.setEnabled(true);
            createMeal(enterprise, faker, account, reciever);
        }
        
        // MealShare
        Enterprise enterprise1 = network.getEnterpriseDirectory().addEnterprise(faker.university().name(), Enterprise.EnterpriseType.MealShare);
        person = enterprise1.getPersonDirectory().addPerson();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setName();
        UserAccount account1 = enterprise1.getUserAccountDirectory().addUserAccount("meal", "meal1#", person, new AdminRole());
        account1.setEnabled(true);
        account1.setNetwork(network);
        
        Organization organization1 = enterprise1.getOrganizationDirectory().addOrganization(Organization.Type.Supervisor);
        
        for(int i=0; i<n+2; i++){
            person = organization1.getPersonDirectory().addPerson();   
            person.setFirstName(faker.name().firstName());
            person.setLastName(faker.name().lastName());
            person.setName();
            person.setAddress1(faker.address().fullAddress());
            person.setCountry("USA");
            person.setPhoneNumber(faker.phoneNumber().phoneNumber());
            person.setEmailId(faker.internet().emailAddress());
            UserAccount account2 = organization1.getUserAccountDirectory().addUserAccount("sup"+i, "sup"+i+"#", person, new SupervisorRole());
            account2.setNetwork(network);
            account2.setEnabled(true);
            createMeal(enterprise1, faker, account, reciever);
        }
        
        
       
        // Government
        Enterprise enterprise2 = network.getEnterpriseDirectory().addEnterprise(faker.university().name(), Enterprise.EnterpriseType.Government);
        person = enterprise2.getPersonDirectory().addPerson();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setName();
        UserAccount account2 = enterprise2.getUserAccountDirectory().addUserAccount("gov", "gov1#", person, new AdminRole());
        account2.setEnabled(true);
        account2.setNetwork(network);
        
        Organization organization2 = enterprise2.getOrganizationDirectory().addOrganization(Organization.Type.CommunityOutreach);
        for(int i=0; i<n; i++){
            person = organization2.getPersonDirectory().addPerson();   
            person.setFirstName(faker.name().firstName());
            person.setLastName(faker.name().lastName());
            person.setName();
            person.setAddress1(faker.address().fullAddress());
            person.setCountry("USA");
            person.setPhoneNumber(faker.phoneNumber().phoneNumber());
            person.setEmailId(faker.internet().emailAddress());
            UserAccount account3 = organization2.getUserAccountDirectory().addUserAccount("co"+i, "co"+i+"#", person, new CommunityOutreachRole());
            account3.setNetwork(network);
            account3.setEnabled(true);
            createMeal(enterprise2, faker, account, reciever);
        }
        
        // NGO
        Enterprise enterprise3 = network.getEnterpriseDirectory().addEnterprise(faker.university().name(), Enterprise.EnterpriseType.NGO);
        person = enterprise3.getPersonDirectory().addPerson();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setName();
        UserAccount account3 = enterprise3.getUserAccountDirectory().addUserAccount("ngo", "ngo1#", person, new AdminRole());
        account3.setEnabled(true);
        account3.setNetwork(network);
        
        Organization organization3 = enterprise3.getOrganizationDirectory().addOrganization(Organization.Type.Donor);
        for(int i=0; i<n; i++){
            person = organization3.getPersonDirectory().addPerson();   
            person.setFirstName(faker.name().firstName());
            person.setLastName(faker.name().lastName());
            person.setName();
            person.setAddress1(faker.address().fullAddress());
            person.setCountry("USA");
            person.setPhoneNumber(faker.phoneNumber().phoneNumber());
            person.setEmailId(faker.internet().emailAddress());
            UserAccount account4 = organization3.getUserAccountDirectory().addUserAccount("do"+i, "do"+i+"#", person, new DonorRole());
            account4.setNetwork(network);
            account4.setEnabled(true);
            createMeal(enterprise3, faker, account, reciever);
        }
        
        return business;
    }
    
    public static void createMeal(Enterprise e, Faker faker, UserAccount sender, UserAccount reciever){
            ArrayList<String> mealType = new ArrayList();
            mealType.add("Lunch");
            mealType.add("Dinner");
            Meal m = e.addMeal();
            String meal = faker.food().dish();
            m.setMeal(meal);
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            c.add(Calendar.DATE, 10); 
            
            m.setType(mealType.get(new Random().nextInt(mealType.size())));

            m.setDate(sdf.format(faker.date().between(new Date(), c.getTime())));
            
            String mealID = faker.internet().uuid();
            
            m.setMealID(mealID);
            m.setAssigned(Boolean.FALSE);
            m.setVolunteerReqSent(Boolean.FALSE);
            
            
            
                    
            // Send Req to Nutritionist      
            MealWorkRequest request = new MealWorkRequest();
            
            ArrayList<Meal> meals = request.getMeals();
            meals.add(m);
                    
            request.setMessage(meal);
            request.setSendDataRequestId(mealID);
            request.setSender(sender);
            request.setStatus("Sent");
            request.setRequestDate(new Date());
            request.setMeals(meals);
            
            
            request.setReceiver(reciever);
            reciever.getWorkQueue().getWorkRequestList().add(request);
            sender.getWorkQueue().getWorkRequestList().add(request);
            setNutritionValues(request.getMealByID(m.getMealID()));
    }
    
    static private void setNutritionValues(Meal meal){
        Random random = new Random();
        meal.setCarbs(String.valueOf(random.nextInt(50) + 10));
        meal.setProtein(String.valueOf(random.nextInt(50) + 10));
        meal.setCalories(String.valueOf(random.nextInt(50) + 10));
    }
    
}
