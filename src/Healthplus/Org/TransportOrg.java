/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;

import Healthplus.EmergencyServices.Drivers;
import Healthplus.Role.DriverRole;
import Healthplus.Role.EmergencyServiceManager;
import Healthplus.Role.Roles;
import java.util.ArrayList;

/**
 *
 * @author sampadadhole
 */
public class TransportOrg extends Org{
    public TransportOrg() {
       super(Org.OrgType.Transport.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new DriverRole());
        return roles;
    }
}
