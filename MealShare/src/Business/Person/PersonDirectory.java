/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author aniketgiram
 */
public class PersonDirectory {
    
      private ArrayList<Volunteer> volunteerList;
      private ArrayList<HelpSeeker> customerLsit;
      private ArrayList<Person> personList;
    
      public PersonDirectory()
      {
            volunteerList = new ArrayList<>();
            customerLsit = new ArrayList<>();
            personList = new ArrayList<>();
      }
      
      public Volunteer addVolunteer()
    {
        Volunteer volunteer = new Volunteer();
        volunteerList.add(volunteer);
        return volunteer;
    }
    
    public void removeVolunteer(Volunteer volunteer)
    {
      volunteerList.remove(volunteer);
    }
    
    public HelpSeeker addCustomer()
    {
        HelpSeeker customer = new HelpSeeker();
        customerLsit.add(customer);
        return customer;
    }
    
    public void removeCustomer(HelpSeeker customer)
    {
        customerLsit.remove(customer);
    }
    

    public ArrayList<HelpSeeker> getCustomerLsit() {
        return customerLsit;
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }


      public Person addPerson()
    {
        Person person = new Person();
       personList.add(person);
        return person;
    }
    
    public void removePerson(Person person)
    {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }


}
