/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;

import Healthplus.Role.Doctor;
import Healthplus.Role.EmergencyServiceManager;
import Healthplus.Role.Roles;
import java.util.ArrayList;

/**
 *
 * @author sampadadhole
 */
public class EmergencyServices extends Org {
 
     public EmergencyServices() {
       super(Org.OrgType.EmergencyRequest.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new EmergencyServiceManager());
        return roles;
    }
}
