/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus;

import Healthplus.Worker.Worker;
import Healthplus.Role.SysAdmin;
import Healthplus.UserAccount.UserAccount;


public class ConfigSystem {
  
    public static E_System configure(){
        
        E_System system = E_System.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account    
        
        Worker employee = system.getEmployeeDirectory().createEmployee("John");     
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sys", "sys", employee, new SysAdmin());
        
        return system;
    }
}
