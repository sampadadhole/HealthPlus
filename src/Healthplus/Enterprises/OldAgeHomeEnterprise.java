/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Enterprises;
import Healthplus.Role.Roles;
import java.util.ArrayList;

public class OldAgeHomeEnterprise extends Enterprise {
    
    public OldAgeHomeEnterprise(String name) {
        super(name, EnterpriseType.OldAgeHome);
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
       return null;
    }
    
}
