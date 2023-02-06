/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.useraccount;

import com.project.organization.Organization;
import com.project.person.Person;
import com.project.role.Role;
import java.util.ArrayList;
import static java.util.Objects.hash;

/**
 *
 * @author Anjali
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String userName, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equals(userName) && ua.getPassword().equals(String.valueOf(password))) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String userName, String password, Person person, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(userName);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccount.setIsActive(true);
        userAccountList.add(userAccount);
        return userAccount;

    }
    
    public boolean checkifUsernameisPresent(String username)
    {
        for (UserAccount ua:userAccountList)
        {
            if(ua.getUserName().equals(username)){
                return true;
               
            }
        }
        
        return false;
    }
    
    
    public UserAccount getOrganizationAdmin(Organization organization)
    {
        for (UserAccount ua:organization.getUserAccountDirectory().getUserAccountList())
        {
            if(ua.getRole().equals(Role.RoleType.ADMIN))
            {
                return ua;
            }
        }
    return null;
    }
    
    

}
