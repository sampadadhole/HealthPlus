/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;
import Healthplus.Role.Doctor;
import Healthplus.Role.Roles;
import java.util.ArrayList;

public class MedicalOrg extends Org {
     public MedicalOrg() {
       super(OrgType.Medical.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
    
}
