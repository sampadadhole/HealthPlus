/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Role;
import Healthplus.DB4OUtil.DB4OUtil;
import Healthplus.E_System;
import Healthplus.EmergencyServices.EmergencyRequestDirectory;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import javax.swing.JPanel;


public abstract class Roles {
    private String name;
    public enum RoleType{
        Admin("Admin Type"),
        Manager("Manager Type"),
        Coordinator("Coordinator Type"),
        Guest("Guest Type"),
        System("System Type"),
        Applicant("Applicant Type"),
        CareTaker("CareTaker Type"),
        Doctor("Doctor Type"),
        EmergencyServiceManager("EmergencyServiceManager Type"),
        DriverRole("Driver Type");
        
        private String value;
        
        private RoleType(String value){
            this.value =value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value; //To change body of generated methods, choose Tools | Templates.
        }
    }
    public Roles(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, E_System business, DB4OUtil dB4OUtil, UserAccount userAccount, Org organization, Enterprise enterprise, EmergencyRequestDirectory EmergencyList);

    @Override
    public String toString() {
        return name;
    }
    
}
