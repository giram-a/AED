/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory()
    {
      userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount addUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
         System.out.println(username);
        return userAccount;
       
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        boolean flag = true;
        for (UserAccount ua : userAccountList){
            if (ua.getUserName().equals(username))
            {
              flag =  false;
            }
            else
            {
            flag =  true;
            }
        }
        return flag;
    }
    
    public void deleteUserAccount(UserAccount userAccount)
    {
        userAccountList.remove(userAccount);
    }
    
}
