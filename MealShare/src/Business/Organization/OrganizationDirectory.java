/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
      organizationList = new ArrayList<>();
    }
    
    public Organization addOrganization(Type type)
    {
        Organization organization = null;
        if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HelpSeeker.getValue())){
            organization = new HelpSeekerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new SupervisorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CommunityOutreach.getValue())){
            organization = new CommunityOutreachOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Nutritionist.getValue())){
            organization = new NutritionistOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void deleteOrganization(Organization organization)
    {
      organizationList.remove(organization);
    }
    
}
