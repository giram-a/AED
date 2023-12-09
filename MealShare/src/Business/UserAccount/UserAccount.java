/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Network.Network;
import Business.Person.Person;
import Business.Roles.Role;
import Business.WrokQueue.WorkQueue;

/**
 *
 * @author aniketgiram
 */
public class UserAccount {
    private String uname;
    private String pass;
    private Person person; 
    private Role role;
    private WorkQueue workQ;
    private boolean enabled = true;
    private Network network;
   
    
    public UserAccount() {
        workQ = new WorkQueue();
    }
  
    public String getUserName() {
        return uname;
    }

    public void setUserName(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQ;
    }

    public void setWorkQueue(WorkQueue workQ) {
        this.workQ = workQ;
    }

    @Override
    public String toString() {
        return uname; //To change body of generated methods, choose Tools | Templates.
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Network getNetwork() {
        return network;
    }
}
